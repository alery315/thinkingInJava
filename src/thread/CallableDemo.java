package thread;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class TaskWithResult implements Callable<String> {

    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws InterruptedException {

        System.out.println(id + "# 1");

        Thread.sleep(2000);

        // 这样写也是休眠,可读性好点
        TimeUnit.MILLISECONDS.sleep(2000);
        TimeUnit.SECONDS.sleep(3);

        System.out.println(id + "# 2");

        Thread.sleep(2000);

        return "result : " + id;
    }
}


public class CallableDemo {

    public static void main(String[] args) {

        System.out.println("start of main");

        ExecutorService exec = Executors.newCachedThreadPool();
        List<Future<String>> results = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            results.add(exec.submit(new TaskWithResult(i)));
        }

        System.out.println("middle of main");

        for (Future<String> fs : results) {
            System.out.println(fs.isDone());
        }

        // fs.get() 阻塞线程到结果回来
        for (Future<String> fs : results) {
            System.out.println("circle of for results");
            try {
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }finally {
                exec.shutdown();
            }
        }


        System.out.println("end of main");


    }


}
