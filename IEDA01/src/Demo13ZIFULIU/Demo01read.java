package Demo13ZIFULIU;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;

/*
    当使用字节流读取文本文件时，可能会有一个小问题。就是遇到中文字符时，可能不会显示完整的字符，
    那是因为 一个中文字符可能占用多个字节存储。所以Java提供一些字符流类，以字符为单位读写数据，专门用于处理文本文 件。
    java.io.Reader 抽象类是表示用于读取字符流的所有类的超类，可以读取字符信息到内存中。它定义了字符输入 流的基本共性功能方法。
    public void close() ：关闭此流并释放与此流相关联的任何系统资源。
    public int read() ： 从输入流读取一个字符。
     public int read(char[] cbuf) ： 从输入流中读取一些字符，并将它们存储到字符数组 cbuf中 。

     java.io.FileReader 类是读取字符文件的便利类。构造时使用系统默认的字符编码和默认字节缓冲区。
        1. 字符编码：字节与字符的对应规则。Windows系统的中文编码默认是GBK编码表。 idea中UTF-8
        2. 字节缓冲区：一个字节数组，用来临时存储字节数据。
    构造方法：
     FileReader(File file) ： 创建一个新的 FileReader ，给定要读取的File对象。
     FileReader(String fileName) ： 创建一个新的 FileReader ，给定要读取的文件的名称。 当你创建一个流对象时，必须传入一个文件路径。类似于FileInputStream

     1.创建FileReader对象。，构造方法中绑定要读取的数据源。
     2.使用FileReader对象中的read方法读取
     3.释放资源。
 */
public class Demo01read {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\IDEAProject\\IEDA01\\src\\Demo13IZIJIELU\\c.txt");
//       // public int read() ： 从输入流读取一个字符
//        int len ;
//        while ((len =fr.read())!=-1){
//            System.out.println((char)len);
//        }

        int len;
        char [] ch = new char[1024];
        while ((len =fr.read(ch))!=-1){
            /*  String 类的构造方法
                String(char[]vaule) 把字符数组转换为字符串
                String(char[]value,int offset.int count)把字符数组额部分转换为字符串

             */
            System.out.println(new String(ch,0,len));
        }


        fr.close();


    }
}
