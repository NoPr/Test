package Demo111ThreadPool.Demo2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * 练习Executors 获取ExecutorsService;
 */
public class MyTest1 {
    public static void main(String[] args) {
      /*  //1.使用工厂类获取线程池对象
        ExecutorService service=Executors.newCachedThreadPool();
        //2.提交任务
        for (int i = 0; i < 10; i++) {
            service.submit(new MyRunnable(i));
        }*/

        //1.使用工厂类获取线程池对象
        ExecutorService service=Executors.newCachedThreadPool(new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r,"DIY");
            }
        });
        //2.提交任务
        for (int i = 0; i < 10; i++) {
            service.submit(new MyRunnable(i));
        }


        service.shutdown();


    }
}
class MyRunnable implements  Runnable{

    private int id;

    public MyRunnable(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"正在执行任务"+id);
    }
}
