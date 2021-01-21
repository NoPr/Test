package Demo11Thread;

/**
 *  并发：指两个或多个事件在同一个时间段内发生。
 *     并行：指两个或多个事件在同一时刻发生（同时发生）。
 *
 *     进程：是指一个内存中运行的应用程序，每个进程都有一个独立的内存空间，一个应用程序可以同时运行多 个进程；
 *     进程也是程序的一次执行过程，是系统运行程序的基本单位；系统运行一个程序即是一个进程从创 建、运行到消亡的过程。
 *     线程：线程是进程中的一个执行单元，负责当前进程中程序的执行，一个进程中至少有一个线程。一个进程 中是可以有多个线程的，
 *     这个应用程序也可以称之为多线程程序。 简而言之：一个程序运行后至少有一个进程，一个进程中可以包含多个线程
 *
 *     分时调度 所有线程轮流使用 CPU 的使用权，平均分配每个线程占用 CPU 的时间。
 *     抢占式调度 优先让优先级高的线程使用 CPU，如果线程的优先级相同，那么会随机选择一个(线程随机性)，Java使用的为 抢占式调度。
 *
 *     主线程：执行main方法的线程
 *
 *     单线程程序：java程序中只有一个线程
 *     执行从main方法开始，从上到下依次执行
 *
 *     实现Runnable接口比继承Thread类所具有的优势：
 *     1. 适合多个相同的程序代码的线程去共享同一个资源。
 *     2. 可以避免java中的单继承的局限性。
 *     3. 增加程序的健壮性，实现解耦操作，代码可以被多个线程共享，代码和线程独立。
 *     4. 线程池只能放入实现Runable或Callable类线程，不能直接放入继承Thread的类。
 */
public class Demo01 {
    public static void main(String[] args) {//单线程
//        person p1 = new person("小强");
//        p1.run();
//
//        person p2 = new person("小徐");
//        p2.run();



       show1 show1 = new show1();
       show1.start();
       show2 show2 = new show2();
       show2.start();
     }

}

//创建线程方式1，继承Thread
//线程开启不一定立即执行，
class  show2 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 200; i++) {
            System.out.println("int"+i);
        }
    }
        }
class  show1 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 200; i++) {
            System.out.println("main"+i);
        }
    }
}

