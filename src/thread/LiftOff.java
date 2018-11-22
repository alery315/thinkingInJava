package thread;


import java.util.concurrent.TimeUnit;

public class LiftOff implements Runnable {

    private String name = "main";
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff() {

    }

    public LiftOff(String name, int countDown) {
        this.countDown = countDown;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " #" + id + "(" + (countDown > 0 ? countDown : "LiftOff!" ) + ")";
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.println(this);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread.yield();
//            System.out.println(this + "2");
//            Thread.yield();
//            System.out.println(this + "3");
//            Thread.yield();
        }
    }


    public static void main(String[] args) throws InterruptedException {

        System.out.println("start of main");

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new LiftOff());

            // 设置为后台进程,当程序中没有后台进程的时候就会自动结束
            thread.setDaemon(true);

            thread.start();
        }

        TimeUnit.MILLISECONDS.sleep(3000);

        System.out.println("end of main");



    }

}
