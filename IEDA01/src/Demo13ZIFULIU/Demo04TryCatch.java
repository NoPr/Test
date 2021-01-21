package Demo13ZIFULIU;

import java.io.FileReader;
import java.io.IOException;

/*
    在jdk1.7之前使用try catch处理流中的异常。
    try{
        可能会产生异常的代码
    }catch（）{
        异常的处理逻辑
    }finally{
        一定会执行的代码（一般是释放资源）
    }
 */
public class Demo04TryCatch {
    public static void main(String[] args) {
        //提高变量的作用域，让finally可以使用
        //变量在定义的时候可以没有值，但是在使用的时候必须有值。
        //fr= new FileReader("D:\\IDEAProject\\IEDA01\\src\\Demo13IZIJIELU\\c.txt");执行失败，
        //namefr没有值。
        FileReader fr=null;
        try {
             fr= new FileReader("D:\\IDEAProject\\IEDA01\\src\\Demo13IZIJIELU\\c.txt");
            int len;
            char [] ch = new char[1024];
            while ((len =fr.read(ch))!=-1){
            /*  String 类的构造方法
                String(char[]vaule) 把字符数组转换为字符串
                String(char[]value,int offset.int count)把字符数组额部分转换为字符串

             */
                System.out.println(new String(ch,0,len));
            }
        }catch (IOException e){
            System.out.println(e);
        }finally {
            //一定会执行的代码
            //创建对象失败了，fr的默认值是null，null是不能调用放法的，所以需要增加判断。
            if (fr!=null) {
                try {
                    //fr.close方法声明抛出了IOException异常对象，所以我们就得处理这个异常对象。要么throw，要么try catch。
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
