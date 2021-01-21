package Demo03Generic;
/*
    含有泛型的接口使用方法二：
     接口使用什么泛型，实验类就是用什么泛型，类跟着接口走
     相当于定义了一个含有泛型的类，创建对象的时候确定泛型的类型
 */
public class Demo03InterfaceImpl2<I> implements DemoInterface<I>{
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
