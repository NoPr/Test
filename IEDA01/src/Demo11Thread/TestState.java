package Demo11Thread;

/**
 * 观察测试线程的状态
 */
public class TestState {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("**************");
            }
        });

        //观察状态 NEW
        Thread.State state =thread.getState();
        System.out.println(state);

        //线程启动后 Run
        thread.start();
        state =thread.getState();
        System.out.println(state);

        //只要线程不终止，就一直处在输出状态
        while (state != Thread.State.TERMINATED){
            Thread.sleep(100);
            state=thread.getState();//更新线程状态
            System.out.println(state);
        }

    }
}
