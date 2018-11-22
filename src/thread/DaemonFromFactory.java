package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DaemonFromFactory implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread() + " " + this);
            TimeUnit.MILLISECONDS.sleep(200);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }finally {
            System.out.println("finally always be executed?");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ExecutorService exec = Executors.newCachedThreadPool(new DaemonThreadFactory());
        for (int i = 0; i < 10; i++) {
            exec.execute(new DaemonFromFactory());
        }
        System.out.println("all daemons started");

        TimeUnit.MILLISECONDS.sleep(100);
    }

}
