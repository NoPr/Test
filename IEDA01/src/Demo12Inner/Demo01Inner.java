package Demo12Inner;

public class Demo01Inner {
    private String name;
    public class hert{
        public void work(){
            System.out.println("我正在跳动");
            System.out.println("我的名字叫"+name);
        }
    }
    public void test(){
        System.out.println("外部类的方法");
//        hert h = new hert();
//        h.work();
        new hert().work();
    }
}
