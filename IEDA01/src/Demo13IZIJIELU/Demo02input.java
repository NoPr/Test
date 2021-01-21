package Demo13IZIJIELU;
/*
    java.io.InputStream 抽象类是表示字节输入流的所有类的超类，可以读取字节信息到内存中。它定义了字节输入 流的基本共性功能方法
    public void close() ：关闭此输入流并释放与此流相关联的任何系统资源。
    public abstract int read() ： 从输入流读取数据的下一个字节。
    public int read(byte[] b) ： 从输入流中读取一些字节数，并将它们存储到字节数组 b中 。

    FileInputStream(File file) ： 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系 统中的 File对象 ﬁle命名。
    FileInputStream(String name) ： 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件 系统中的路径名 name命名

    java.io.InputStream继承了InputStream
    FileInputStream：文件字节输入流
    作用：把硬盘文件中的数据读取到内存中使用。

    FileInputStream(File file)
    FileInputStream(String name)
    参数：
        File file：文件
        String name：文件路径
    作用：
    1.会创建一个FileInputStream对象，
    2.会把FileInputStream指向构造方法中要读取的文件

    读取数据的原理（硬盘-->内存）：
    java程序-->jvm==>os-->os读取数据的方法-->读取文件
    字节输入流的使用步骤
        1.创建一个FileInputStream对象。构造方法中绑定要读取的数据源。
        2.使用FileInputStream对象中的方法read，读取文件
        3.释放资源
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo02input {
    public static void main(String[] args) throws IOException {
        //创建一个FileInputStream对象。构造方法中绑定要读取的数据源。
        FileInputStream fis = new FileInputStream("D:\\IDEAProject\\IEDA01\\src\\Demo13IZIJIELU\\a.txt");
        // 使用FileInputStream对象中的方法read，读取文件
        //int read()读取文件中的一个字节并返回，读取到文件的末尾返回-1
//        int len = fis.read();
//        System.out.println(len);
//
//        len =fis.read();
//        System.out.println(len);
//
//        len =fis.read();
//        System.out.println(len);
//
//        len =fis.read();
//        System.out.println(len);
        /*
            以上读取文件是一个重复的过程
            不知道文件有多少字节，使用while循环
            当读取到-1时，结束循环
            boolen表达式(len =fis.read())!=-1)
            1.fis.read()；读取一个字节
            2.len =fis.read：把读取到的字节赋值给变量len
            3.判断变量len是否不等于-1
         */
        int len =0; //记录读取到的字节
        while((len =fis.read())!=-1) {
            System.out.println(len);
        }

        //3.释放资源
        fis.close();

    }
}
