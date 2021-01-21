package Demo11Thread;

/**
 *测试守护线程
 */

public class TestDaemon {
    public static void main(String[] args) {
        Anything anything = new Anything();

        You you = new You();

        Thread thread = new Thread(anything);
        thread.setDaemon(true);//默认false表示是用户线程 ，正常的都是用户线程

        thread.start();

        //你  ，用户线程启动
        new Thread(you).start();
    }
}
class Anything implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println("守护着你");
        }
    }
}
class You implements  Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 36500; i++) {
            System.out.println("开心的活着");
        }
        System.out.println("Good Bye World");
    }
}