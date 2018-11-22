package thread;

import java.util.concurrent.TimeUnit;

public class EvenGenerator extends IntGenerator {

    private int currentEvenValue = 0;

    @Override
    public synchronized int next(){
        // 加二非原子性操作,可能多线程导致错位
        ++currentEvenValue;
        try {
            TimeUnit.MILLISECONDS.sleep(500);
            System.out.println(currentEvenValue);
//            Thread.yield();
            ++currentEvenValue;
            TimeUnit.MILLISECONDS.sleep(500);
            System.out.println(currentEvenValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return currentEvenValue;
    }

    public static void main(String[] args) {

        EvenChecker.test(new EvenGenerator());

    }

}
