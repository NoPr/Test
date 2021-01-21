package Demo10Exception;

import java.io.FileNotFoundException;

/*
    public String getMessage() :获取异常的描述信息,原因(提示给用户的时候,就提示错误原因。
    public String toString() :获取异常的类型和异常描述信息(不用)。
    public void printStackTrace() :打印异常的跟踪栈信息并输出到控制台。

    try：该代码块中编写可能产生异常的代码。
    catch：用来进行某种异常的捕获，实现对捕获到的异常进行处理。


 包含了异常的类型,异常的原因,还包括异常出现的位置,在开发和调试阶段,都得使用printStackTrace
    1.TRY可能抛出多个异常，那么就可以使用多个catch来处理
    2.如果try中产生了异常，那么就会执行catch中的异常处理逻辑，执行完毕catch中的处理逻辑，继续执行try catch之后的代码
        如果没有产生异常，那么就不会执行catch中的异常处理逻辑，执行完毕try中的处理逻辑，继续执行try catch之后的代码

 */
public class Demo01TryCatch {
    public static void main(String[] args) {
        try {// 当产生异常时，必须有处理方式。要么捕获，要么声明
            read("b.txt");
        } catch (FileNotFoundException e) {// 括号中需要定义什么呢
            //try中抛出的是什么异常，在括号中就定义什么异常类型
            System.out.println(e);
            System.out.println("*****");
            System.out.println(e.getMessage());
            System.out.println("/////////");
            System.out.println(e.toString());
            System.out.println("++++++++");
            e.printStackTrace();

        }
        System.out.println("end");

    }

    public static  void read(String path) throws FileNotFoundException {
        if(! path.equals("a.txt")){//如果不是a.txt这个文件
            throw new FileNotFoundException("文件不存在");
        }
    }


}
