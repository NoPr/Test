package Demo11Thread;

/**
 * join合并线程，待此线程执行完毕后，在执行其他线程，其他线程阻塞
 * 类似于插队
 */
public class TestJoin implements Runnable{

    public static void main(String[] args) throws InterruptedException {
        TestJoin testJoin = new TestJoin();

        Thread thread = new Thread(testJoin);
        thread.start();

        for (int i = 0; i < 1000; i++) {
            if (i==525){
                thread.join();
            }
            System.out.println("线程main"+i+"执行");
        }

    }
    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            System.out.println("线程一"+i+"执行");
        }
    }
}
