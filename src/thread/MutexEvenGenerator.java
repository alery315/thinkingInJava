package thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MutexEvenGenerator extends IntGenerator {

    private int currentEvenValue = 0;
    private Lock lock = new ReentrantLock();

    @Override
    public int next() {
        lock.lock();
        try {
            ++currentEvenValue;
            TimeUnit.MILLISECONDS.sleep(500);
            System.out.println(currentEvenValue);
            Thread.yield();
            ++currentEvenValue;
            TimeUnit.MILLISECONDS.sleep(500);
            System.out.println(currentEvenValue);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            return currentEvenValue;
        }
    }

    public static void main(String[] args) {

        EvenChecker.test(new MutexEvenGenerator());


    }

}
