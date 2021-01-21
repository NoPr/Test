package Demo10Exception;

import java.util.List;

/*
        多个异常使用捕获又该如何处理呢？
        1. 多个异常分别处理。
        2. 多个异常一次捕获，多次处理。
        3. 多个异常一次捕获一次处理

        运行时异常被抛出可以不处理。即不捕获也不声明抛出。
        如果ﬁnally有return语句,永远返回ﬁnally中的结果,避免该情况
        如果父类抛出了多个异常,子类重写父类方法时,抛出和父类相同的异常或者是父类异常的子类或者。
        父类方法没有抛出异常，子类重写父类该方法时也不可抛出异常。此时子类产生该异常，只能捕获处理，不 能声明抛出
     */
public class Demo02Exception {
        public static void main(String[] args) {
            int [] arr={1,2,3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException: 3


           /*
            d多个异常一次捕获，多次处理
           try{      
                编写可能会出现异常的代码 }
           catch(异常类型A  e){  当try中出现A类型异常,就用该catch来捕获.      
                处理异常的代码      
                //记录日志/打印异常信息/继续抛出异常 }
           catch(异常类型B  e){  当try中出现B类型异常,就用该catch来捕获.      
                处理异常的代码      
           //记录日志/打印异常信息/继续抛出异常
            */
        }
        //父类抛出了多个异常,子类重写父类方法时,抛出和父类相同的异常
        public  void  show01() throws NullPointerException,ClassCastException{}
        //父类抛出了多个异常,子类重写父类方法时,抛出父类异常的子类
        public  void  show02() throws IndexOutOfBoundsException{}
        //不抛出异 常
        public  void  show03() throws IndexOutOfBoundsException{}

        public void  show04(){}
}
class zi extends Demo02Exception{
    //父类抛出了多个异常,子类重写父类方法时,抛出和父类相同的异常
    public  void show01() throws NullPointerException,ClassCastException{}
    //父类抛出了多个异常,子类重写父类方法时,抛出父类异常的子类
    public  void show02() throws ArrayIndexOutOfBoundsException{}
    //不抛出异 常
    public  void show03()  {}
//    父类方法没有抛出异常，子类重写父类该方法时也不可抛出异常。此时子类产生该异常，只能捕获处理，不 能声明抛出
//    public  void  show04() throws  Exception{}
    //只能捕获处理，
    public void show04(){
        try {
            throw  new Exception("编译器异常");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}