package Demo09Interface;

public class Demo01InterfaceTest implements Demo01{
    public static void main(String[] args) {
        Demo01.fly();//只能使用接口名调用，不可以通过实现类的类名或者实现类的对象调用
    }
}
