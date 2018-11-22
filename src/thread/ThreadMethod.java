package thread;

import java.util.concurrent.TimeUnit;

public class ThreadMethod {
    private Thread thread;
    private int count = 5;
    private String name;

    public ThreadMethod(String name) {
        this.name = name;
    }

    public void runTask() {
        if (thread == null) {
            thread = new Thread(name){
                @Override
                public void run() {
                    try {
                        while (true) {
                            System.out.println(this);
                            if (--count == 0) {
                                return;
                            }
                            sleep(100);
                        }
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                @Override
                public String toString() {
                    return getName() + ": " + count;
                }
            };
            thread.start();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadMethod t = new ThreadMethod("alery");
        t.runTask();
        System.out.println(t.thread.getState());
        TimeUnit.SECONDS.sleep(1);
        System.out.println(t.thread.getState());
    }
}
