package Demo12Inner;
/*
    分类
    ：成员内部类
    局部内部类（包含匿名内部类）

内用外，随意访问，外用内 ，创建内部类对象
    使用成员内部类
    1.间接方法：在外部类的方法中，使用内部类，然后main调用外部类方法
    2.直接方法： w外部类方法。内部类方法 对象名 = new 外部类对象。new 内部类对象
 */
public class Demo01InnerTest {
    public static void main(String[] args) {
        Demo01Inner d = new Demo01Inner();
        d.test();
        System.out.println("==============");
        Demo01Inner.hert dh = new Demo01Inner().new hert();
        dh.work();

    }
}
