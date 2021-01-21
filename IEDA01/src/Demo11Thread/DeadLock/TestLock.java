package Demo11Thread.DeadLock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 测试lock锁
 */
public class TestLock {
    public static void main(String[] args) {
        TestLock1 testLock1 = new TestLock1();
        new Thread(testLock1,"王菲").start();
        new Thread(testLock1,"李研").start();
        new Thread(testLock1,"孙曦").start();

    }

}
class TestLock1 implements Runnable{

    int ticknums =10;
    //定义lock锁
    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        buy();
    }

    public void buy(){
        while (true){
            lock.lock();
            try {
                if (ticknums>0){
                   try {
                       Thread.sleep(1000);
                   }catch (InterruptedException e){
                       e.printStackTrace();
                   }
                    System.out.println(Thread.currentThread().getName()+"拿到了"+ticknums--+"张票");
                }else {
                    break;
                }
            }finally {
                //解锁
                lock.unlock();
            }
        }
    }
}
