package thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Pair {
    private int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Pair() {
        this(0, 0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void incrementX() {
        x++;
    }

    public void incrementY() {
        y++;
    }

    public String toString() {
        return "x: " + x + ", y: " + y;
    }

    public class PairValuesNotEqualException extends RuntimeException {
        public PairValuesNotEqualException() {
            super("Pair values not equal: " + Pair.this);
        }
    }

    public void checkState() {
        if (x != y) {
            throw new PairValuesNotEqualException();
        }
    }

}

// protect a Pair inside a thread-safe class
abstract class PairManager {
    AtomicInteger checkCounter = new AtomicInteger(0);
    protected Pair p = new Pair();
    public List<Pair> storage = Collections.synchronizedList(new ArrayList<>());

    public synchronized Pair getPair() {
        // make a copy to keep the original safe
        return new Pair(p.getX(), p.getY());
    }

    protected void store(Pair p) {
        storage.add(p);
        try {
            TimeUnit.MILLISECONDS.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public abstract void increment();

}

class PairManager1 extends PairManager {

    @Override
    public synchronized void increment() {
        p.incrementX();
        p.incrementY();
        store(getPair());
    }
}

class PairManager2 extends PairManager {

    @Override
    public synchronized void increment() {
        Pair temp;
        synchronized (this) {
            p.incrementX();
            p.incrementY();
            temp = getPair();
        }
        store(temp);
    }
}

class ExplicitPairManager1 extends PairManager {
    private Lock lock = new ReentrantLock();

    @Override
    public synchronized void increment() {
        lock.lock();
        try {
            p.incrementX();
            p.incrementY();
            store(getPair());
        }finally {
            lock.unlock();
        }
    }
}

class ExplicitPairManager2 extends PairManager {
    private Lock lock = new ReentrantLock();

    @Override
    public void increment() {
        Pair temp;
        lock.lock();
        try {
            p.incrementX();
            p.incrementY();
            temp = getPair();
        }finally {
            lock.unlock();
        }
        store(temp);
    }
}

class PairManipulator implements Runnable {
    private PairManager pm;

    public PairManipulator(PairManager pm) {
        this.pm = pm;
    }

    @Override
    public void run() {
        while (true) {
            pm.increment();
        }
    }

    public String toString() {
        return "Pair: "  + pm.getPair() +  " checkCounter = " + pm.checkCounter.get();
    }

}

class PairChecker implements Runnable {

    private PairManager pm;

    public PairChecker(PairManager pm) {
        this.pm = pm;
    }

    @Override
    public void run() {
        while (true) {
            pm.checkCounter.incrementAndGet();
//            System.out.println(pm.checkCounter.get());
            pm.getPair().checkState();
//            System.out.println(pm.getPair());
        }
    }
}


public class CriticalSection {
    static void testApproaches(PairManager pm1, PairManager pm2) {

        ExecutorService exec = Executors.newCachedThreadPool();
        PairManipulator pml1 = new PairManipulator(pm1);
        PairManipulator pml2 = new PairManipulator(pm2);
        PairChecker pc1 = new PairChecker(pm1);
        PairChecker pc2 = new PairChecker(pm2);

        exec.execute(pml1);
        exec.execute(pml2);
        exec.execute(pc1);
        exec.execute(pc2);



        try {
            TimeUnit.MILLISECONDS.sleep(500);
            System.out.println("after 500 ms");
        } catch (InterruptedException e) {
            System.out.println("sleep interrupted");
        }



//        System.out.println(pm1.checkCounter.get());
//        System.out.println(pm2.checkCounter.get());

        exec.shutdownNow();

        System.out.println("pml1: " + pml1 + "\npml2: " + pml2);

        System.exit(0);
    }

    public static void main(String[] args) {
        PairManager pm1 = new PairManager1();
        PairManager pm2 = new PairManager2();

        testApproaches(pm1, pm2);

//        PairManager pm3 = new ExplicitPairManager1();
//        PairManager pm4 = new ExplicitPairManager2();
//
//        testApproaches(pm3, pm4);

    }

}
