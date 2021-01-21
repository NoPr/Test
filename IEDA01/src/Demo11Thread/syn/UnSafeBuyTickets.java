package Demo11Thread.syn;

/**
 * 不安全线程  ；买票
 *
 * 线程不安全，有负数
 */
public class UnSafeBuyTickets {

    public static void main(String[] args) {
        BuyTickets buyTickets = new BuyTickets();

        new Thread(buyTickets,"苦逼").start();
        new Thread(buyTickets,"牛逼").start();
        new Thread(buyTickets,"傻逼").start();
        new Thread(buyTickets,"逗逼").start();
    }
}
class BuyTickets implements Runnable{

    private int ticknums=100;
    boolean flag = true;
    @Override
    public void run() {
            while (flag){
                try {
                    buy();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        //同步锁，索的是本身
    public synchronized void buy() throws InterruptedException {
        if (ticknums<=0){
            flag=false;
            return;
        }
        //模拟延时
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName()+"买到了"+ticknums--+"张票");
        }

}
