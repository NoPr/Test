package ThreadPoolExecuor;

import java.util.concurrent.Executors;

public class Test1 {
    public static void main(String[] args) {
        BuyTicks buyTicks = new BuyTicks();

    }
}
class BuyTicks implements Runnable{

    static int ticknums=10;
    private String name;
    public void BuyTicks(String name){
        this.name=name;
    }
    @Override
    public void run() {
        if (ticknums<=0){
            return;
        }else {
            try {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName()+"拿到了"+ticknums--+"张票");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
