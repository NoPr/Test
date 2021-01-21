package Demo11Thread.DeadLock;

/**
 *  产生死锁的四个必要条件
 *   互斥条件：一个资源一次只能被一个进程使用
 *   请求与保持条件；一个进程因请求资源而阻塞的时候，对已经获得的资源保持不放
 *   不剥夺条件：进程已获得的资源，在未使用完之前，不能强行剥夺
 *   循环等待条件：若干进程之间形成一种头尾相接的循环等待资源关系
 */
public class TestSynchronized {
    public static void main(String[] args) {
        MakeFace makeFace1= new MakeFace(1,"王妃");
        MakeFace makeFace2= new MakeFace(0,"皇后");

        makeFace1.start();
        makeFace2.start();
    }
}

//口红
class Lipstack{

}

//镜子
class Mirror{

}
//执行动作，化妆。需要镜子，口红
class  MakeFace extends Thread{
    static  Lipstack  lipstack = new Lipstack();
    static Mirror mirror = new Mirror();

    int chioce; //选择
    String name;//化妆的人

    MakeFace(int chioce,String name){
        this.chioce=chioce;
        this.name=name;
    }

    @Override
    public void run() {
        try {
            makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void makeup() throws InterruptedException {

        if (chioce==0) {
            synchronized (lipstack) {
                System.out.println(Thread.currentThread().getName() + "获得口红");
                Thread.sleep(1000);
                //只要两个人不同时抢一个，将synchronized移出当前锁之外
                synchronized (mirror){
                    System.out.println(Thread.currentThread().getName()+"获得镜子");
                }
            }
        }else {
            synchronized (mirror){
                System.out.println(Thread.currentThread().getName()+"获得镜子");
                Thread.sleep(2000);
                synchronized (lipstack){
                    System.out.println(Thread.currentThread().getName()+"获得口红");
                }
            }
        }

    }
}
