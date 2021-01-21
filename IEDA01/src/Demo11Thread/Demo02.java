package Demo11Thread;

/**
 * 多个线程同时操作同一对象
 *
 * 买火车票
 *
 * 多个线程操作同一个资源的情况下，线程不安全，
 */
public class Demo02 implements Runnable {


    private int ticksnums=10; //火车票
    @Override
    public void run() {
        while (true){
            if (ticksnums<=0){
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"拿到了"+ticksnums--+"票");
        }
    }

    public static void main(String[] args) {
        Demo02 demo02= new Demo02();

        new Thread(demo02,"小明").start();
        new Thread(demo02,"老王").start();
        new Thread(demo02,"黄牛").start();
    }
}
