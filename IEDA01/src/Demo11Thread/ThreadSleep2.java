package Demo11Thread;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 模拟倒计时
 */
public class ThreadSleep2 implements Runnable{
    public static void main(String[] args) {
        ThreadSleep2 threadSleep2 =  new ThreadSleep2();
        new Thread(threadSleep2).start();
    }

    private int down =10;
    @Override
    public void run() {
        while (true){
            if (down<=0){
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("倒计时"+down--+"秒"+new SimpleDateFormat("HH:mm:ss").format(new Date()));
        }

    }
}
