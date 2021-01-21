package Demo12Inner;
/*
    内部类同名变量访问
    如果出现了重名现象，那么格式是外部类名称。this.外部类成员变量
 */
public class Demo01Outer {
    int num =10;//外部类的成员变量
    public class Inner{
        int num = 20;//内部类的成员变量
        public  void methodInner(){
            int num =30;//内部类方法的局部变量
            System.out.println(num);//局部变量，就近原则
            System.out.println(this.num);// 内部类的成员变量
            System.out.println(Demo01Outer.this.num);
        }
    }

    public static void main(String[] args) {
        Demo01Outer d = new Demo01Outer();
        Demo01Outer.Inner d1 = new Demo01Outer().new Inner();
        d1.methodInner();
    }
}
