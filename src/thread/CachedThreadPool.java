package thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {

    public static void main(String[] args) {
        // 分配任务大小的线程,不断回收复用
        //ExecutorService exec = Executors.newCachedThreadPool();

        // 分配大小固定的线程池
        ExecutorService exec = Executors.newFixedThreadPool(8);

        // 分配单个线程的线程池
        exec = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 20; i++) {
            exec.execute(new LiftOff());
        }

        // 不接收新提交的任务
        exec.shutdown();


    }



}
