package Demo11Thread;

/**
 * 测试线程的优先级
 *
 * 优先级低只是意味着获取调度的概率低，不意味着不调用，看cpu的调度
 */
public class TserPriority extends Thread{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"---->"+Thread.currentThread().getPriority());

        MyPriority myPriority = new MyPriority();

        Thread t1 = new Thread(myPriority);
        Thread t2 = new Thread(myPriority);
        Thread t3 = new Thread(myPriority);
        Thread t4 = new Thread(myPriority);
        Thread t5 = new Thread(myPriority);
        Thread t6 = new Thread(myPriority);

        t1.start();

        t2.setPriority(1);
        t2.start();

        t3.setPriority(3);
        t3.start();

        t4.setPriority(Thread.NORM_PRIORITY);
        t4.start();

        t5.setPriority(7);
        t5.start();

        t6.setPriority(Thread.MAX_PRIORITY);
        t6.start();
    }
}
    class MyPriority implements Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+"---->"+Thread.currentThread().getPriority());
        }

}
