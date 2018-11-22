package thread;

class SelfManaged implements Runnable {

    private int count = 5;
    private Thread t = new Thread(this);

    public SelfManaged() {
        t.start();
    }

    @Override
    public String toString() {
        return Thread.currentThread() + "(" + count + "), ";
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(this);
            if (--count == 0) {
                return;
            }
        }
    }
}

public class SimpleThread extends Thread{

    private int count = 5;
    private static int threadCount = 0;

    public SimpleThread() {
        super("subThread" + Integer.toString(++threadCount));
        this.start();
    }

    public String toString() {
        return "# " + getName() + " (" + count + "), ";
    }

    public void run() {
        while (true) {
            System.out.println(this);
            if (--count == 0) {
                return;
            }
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
//            new SimpleThread();
            new SelfManaged();
        }

    }


}
