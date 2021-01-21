package Demo11Thread;

/**
 * 静态代理模式总结
 * 真实对象和代理对象都要实现同一个接口
 * 代理对象要代理真是角色，
 *
 * 好处“
 *  代理对象可以做真是对象做不了的事情。
 *  真实对象可以做自己的事情
 */
public class StaticProxy {
    public static void main(String[] args) {
/*
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱你");
            }
        }).start();*/

        new  Thread(()-> System.out.println("我爱你")).start();

//        you you = new you();
//        you.HappyMarry();

//        WeddingCompany weddingCompany = new WeddingCompany(new you());
//        weddingCompany.HappyMarry();

        new WeddingCompany(new you()).HappyMarry();
    }
}


interface  marry{

    void HappyMarry();
}

//真实角色，是你去结婚
class  you implements  marry{

    @Override
    public void HappyMarry() {
        System.out.println("要结婚了");
    }
}

//代理角色，帮助你结婚
class WeddingCompany implements marry{
//  //目标对象  代理谁
    private marry target;

    public WeddingCompany(marry target){
        this.target=target;
    }
    @Override
    public void HappyMarry() {
        before();
        this.target.HappyMarry();//这就是真实对象
        after();
    }

    private void after() {
        System.out.println("结婚之后善后");
    }

    private void before() {
        System.out.println("结婚之前布置现场");
    }
}
