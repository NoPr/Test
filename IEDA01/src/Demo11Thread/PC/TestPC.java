package Demo11Thread.PC;

/**
 * 测试生产者消费者 --》利用缓冲区解决  ：管程法
 *
 *  生产者 ：消费者： 产品 缓冲区
 */
public class TestPC {
    public static void main(String[] args) {
        SynContainer container  =new SynContainer() ;

        new Productpr(container).start();
        new Consumer(container).start();
    }
}
//生产者
class Productpr extends Thread{
    SynContainer container;

    public Productpr(SynContainer container){
        this.container=container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            container.push(new Chicken(i));
            System.out.println("生产了"+i+"只鸡");
        }
    }
}
//消费者
class Consumer extends Thread{
    SynContainer container;
    public Consumer(SynContainer container){
        this.container=container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("消费了"+container.pop().id+"只鸡");
        }
    }
}
//产品
class Chicken{

    int id;//产品编号
    public Chicken(int id) {
        this.id=id;
    }
}
//缓冲区
class SynContainer{
    //容器大小
    Chicken[] chickens = new Chicken[10];
    //容器计数器
    int count=0;
    //生产者放入产品
    public synchronized void push(Chicken chicken){
        //如果容器满了，就需要等待消费者消费
        if (count== chickens.length){
            try {
                this.wait();
                System.out.println("满了。来用");
                //通知消费者消费，生产等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果没满，我们就丢入产品
        chickens[count] =chicken;
        count++;
        //可以通知 消费者消费了
        this.notify();
    }
    //消费者消费 产品
    public synchronized Chicken  pop(){
        if (count==0){
            try {
                System.out.println("没了，来加");
                //等待生产者生产，消费者等待
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        //如果可以消费
        count--;
        Chicken chicken = chickens[count];
        //通知生产者生产
        this.notify();
        return chicken;
    }
}
