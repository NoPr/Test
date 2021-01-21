package Demo03Generic;

public class Demo03InterfaceTest {
    public static void main(String[] args) {
        Demo03InterfaceImpl d1 = new Demo03InterfaceImpl();
        d1.method("sss");

        //创建对象的时候确定泛型的类型
        Demo03InterfaceImpl2<Integer> d2 = new Demo03InterfaceImpl2<Integer>();
        d2.method(20);

        Demo03InterfaceImpl2<Double> d3 = new Demo03InterfaceImpl2<Double>();
        d3.method(55.2);

    }
}
