package Demo11Thread;

/**
 * 模拟网络延迟 :放大问题的发生性
 */
public class TestSleep implements Runnable{
    public static void main(String[] args) {
        TestSleep testSleep = new TestSleep();

        new Thread(testSleep,"小明").start();
        new Thread(testSleep,"白洁").start();
        new Thread(testSleep,"八戒").start();
        new Thread(testSleep,"小芳").start();

    }

    private int ticksNums=100;
    @Override
    public void run() {
        while (true){
            if (ticksNums<=0){
                break;
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"拿了第"+ticksNums--+"张票");
        }
    }
}
