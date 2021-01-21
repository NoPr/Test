package Demo10Exception;

import java.io.FileNotFoundException;

/*
异常处理：第一张方式
    声明异常：将问题标识出来，报告给调用者。如果方法内通过throw抛出了编译时异常，
    而没有捕获处理（稍后讲 解该方式），那
    么必须通过throws进行声明，让调用者去处理。
    关键字throws运用于方法声明之上,用于表示当前方法不处理异常,
    而是提醒该方法的调用者来处理异常(抛出异常).
        在方法声明时使用
    修饰符 返回值类型 方法名(参数) throws 异常类名1,异常类名2…{   }
        注意：
        1.throws关键字必须写在方法声明处
        2.throws关键字后边声明的异常必须是Exception或者是Exception的子类
        3.方法内部如果抛出了多个异常对象，那么throws后便必须也生命多个异常
            如果抛出了多个异常对象有子父类关系，那么直接声明父类异常即可
        4.调用一个声明抛出异常的方法，我们就必须处理声明的异常
        要么继续使用thorws声明抛出，交给方法调用者处理，最终交给jvm
        要么try。。catch自己处理

 */
public class Demo01throws {
    public static void main(String[] args) {

    }
    /*
        定义一个方法，对传递的文件路径进行合法性判断，
        如果路径不是“c:\\a.txt”，那么我们就抛出文件找不到异常，告知方法的调用者
        注意：
            FileNotFoundException是编译异常，抛出了编译异常就必须处理这个异常
            可以使用throws继续声明抛出FileNotFoundException这个异常对象，让方法的调用者处理。

     */
    public  static  void  readFile(String fileName) throws FileNotFoundException {
        if (!fileName.equals("c:\\\\a.txt")){
            throw  new FileNotFoundException("路径不是“c:\\\\a.txt");
        }
        System.out.println("读取文件，路径没有问题");
    }

}
