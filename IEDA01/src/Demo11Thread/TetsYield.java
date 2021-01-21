package Demo11Thread;

/**
 * 测试线程礼让，
 * 礼让不一定成功，将线程从运行状态转换为就绪态
 */
public class TetsYield implements Runnable{
    public static void main(String[] args) {

        TetsYield tetsYield = new TetsYield();

        new Thread(tetsYield,"线程一").start();
        new Thread(tetsYield,"线程二").start();

    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程开始执行");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"线程停止执行");
    }
}
