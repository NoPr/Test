package Demo111ThreadPool.Demo1.MyTask;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * 需求：
 *  自定义线程池练习；这是任务类
 *  包含任务编号，每一个人任务执行时间设计为0.2s
 */
public class MyTask1 implements Runnable{
    private  int id;
    //由于run方法是重写接口中的方法，因此id这个属性初始化可以用构造方法
    public MyTask1(int id){
        this.id=id;
    }
    @Override
    public void run() {

        try {
            System.out.println(Thread.currentThread().getName()+"线程即将执行"+id+"任务");
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"线程完成了"+"任务"+id);
    }
}
