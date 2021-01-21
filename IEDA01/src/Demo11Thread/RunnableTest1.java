package Demo11Thread;

/**
 * 实现多线程和方式二，实现Runnable接口
 */
public class RunnableTest1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("我是多线程"+i);
        }
    }

    public static void main(String[] args) {

        //创建Runnable接口的实现类对象
        RunnableTest1 runnableTest1 = new RunnableTest1();


       /* Thread thread = new Thread(runnableTest1);
        thread.start();*/

        //简写
        new Thread(runnableTest1).start();

        for (int i = 0; i < 500; i++) {
            System.out.println("我是主线程"+i);
        }

    }
}
