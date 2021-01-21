package Demo11Thread.syn;

import person.D;

/**
 * 不安全的取钱
 */
public class UnSafeBank {
    public static void main(String[] args) {
        Account account= new Account(550,"创业基金");

        Drawing drawing = new Drawing(account,100,"你");
        Drawing drawing1 = new Drawing(account,500,"女朋友");

        drawing.start();
        drawing1.start();
    }
}
//账户
class Account{

     int money;
     String id;

    public Account(int money, String id) {
        this.money = money;
        this.id = id;
    }
}

//模拟提款
//synchroized  .默认锁的是this，即它本身
class Drawing extends Thread{
    Account account;
    int drawingMoney; //取了多少钱
    int nomoney;        //现在手里的钱
    public Drawing(Account account,int drawingMoney,String name){
        super(name);
        this.account=account;
        this.drawingMoney=drawingMoney;
    }

    @Override
    public void run() {
        //锁的对象是变化的量
        synchronized (account){
            //判断有没有钱
            if (account.money-drawingMoney<0){
                System.out.println(Thread.currentThread().getName()+"钱不够，取不了");
                return;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //卡里的余额
            account.money=account.money-drawingMoney;
            //手里的钱 =手里的钱+取出来的
            nomoney=nomoney+drawingMoney;
            System.out.println("余额为"+account.money);
            //
//        Thread.currentThread().getName()  等价于 this.getName()
            System.out.println(this.getName()+"手里的钱"+nomoney);
        }

    }
}
