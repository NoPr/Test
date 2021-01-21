package Demo12Inner;
/*
    局部内部类：定义在一个方法内部的类

    定义一个类的时候，权限修饰符
    1.外部类     public
    2.成员内部类     public/protected/private
    3.局部内部类     什么都不能写
 */
public class Demo02OuterClass {
    public void methodOuter(){
        class Inner{//局部内部类,只有当前所属的方法才能使用它，除了方法外部就不能用了
            int num =10;
            public void methodInner(){
                System.out.println(num);
                System.out.println("局部内部类方法");
            }
        }
        Inner i = new Inner();
        i.methodInner();//在这调用局部内部类

    }
}
