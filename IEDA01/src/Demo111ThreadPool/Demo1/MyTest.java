package Demo111ThreadPool.Demo1;

import Demo111ThreadPool.Demo1.MyTask.MyTask1;
import Demo111ThreadPool.Demo1.MyThreadPool.MyThreadPool;

/**
 * 测试类
 *  1.创建线程池类对象
 *  2。提交多个任务
 */
public class MyTest {
    public static void main(String[] args) {
        MyThreadPool threadPool = new MyThreadPool(2,4,20);

        for (int i = 0; i < 10; i++) {
            MyTask1 myTask1 = new MyTask1(i);
            threadPool.submit(myTask1);
        }
    }
}

