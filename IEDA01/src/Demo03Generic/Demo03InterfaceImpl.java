package Demo03Generic;
/*
    含有泛型的接口
    使用方法一：
    定义接口的实现类，实现接口，指定接口的泛型
 */
public class Demo03InterfaceImpl implements DemoInterface<String>{
    public static void main(String[] args) {

    }

    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
