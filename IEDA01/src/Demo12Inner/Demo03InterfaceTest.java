package Demo12Inner;
/*
    如果接口的实现类或者是父类的子类只需要使用一次，那么这种情况下就可以使用该类的定义
    而改为匿名内部类
    定义格式
        接口名称  对象名 = new 接口名称（）{
        覆盖重写所有抽象方法
        }；
 */
public class Demo03InterfaceTest {
    public static void main(String[] args) {

//        Demo03InterfaceImpl impl = new Demo03InterfaceImpl();
//        impl.method();
//        //多态
//        Demo03Interface im = new Demo03InterfaceImpl();
//        im.method();
        //匿名内部类
        Demo03Interface d1 = new Demo03Interface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }
        };
        d1.method();
    }
}
