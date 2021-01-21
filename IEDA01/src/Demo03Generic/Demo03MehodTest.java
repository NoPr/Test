package Demo03Generic;

public class Demo03MehodTest {
    public static void main(String[] args) {
        Demo03Method d1 = new Demo03Method();
        /*
        调用含有泛型的方法
        传递什么类型，泛型就是什么类型
         */
        d1.Method01("12");
        d1.Method01(10);
        d1.Method01(true);

        d1.Method02("静态方法不建议创建对象使用");
        //静态方法通过类名，方法名（参数）可以直接使用
        Demo03Method.Method02("静态方法");
        Demo03Method.Method02(132);
        Demo03Method.Method02(true);
    }
}
