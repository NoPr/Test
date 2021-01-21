package Demo11Thread.Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestPool {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        ExecutorService service = Executors.newFixedThreadPool(10);
        service.execute(thread);
        service.execute(thread);
        service.execute(thread);
        service.execute(thread);

        //2.关闭连接
        service.shutdown();
    }
}
class MyThread implements Runnable{

    @Override
    public void run() {
            System.out.println(Thread.currentThread().getName());
    }
}
