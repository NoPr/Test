package ThreadPoolExecuor;

import java.util.concurrent.*;

public class Executor {
    ExecutorService ex = new ThreadPoolExecutor(
            3,//核心线程大小
            5,//最大线程池大小
            5, //超时多久没人调用就会释放
            TimeUnit.SECONDS,//超时单位，
            new LinkedBlockingDeque<>(3),//允许三个用户进入阻塞队列
            Executors.defaultThreadFactory(),//用了Executors对象提供的默认线程创建工厂
            new ThreadPoolExecutor.AbortPolicy()//AbortPolicy表示拒绝任务的处理程序。
            );
}
