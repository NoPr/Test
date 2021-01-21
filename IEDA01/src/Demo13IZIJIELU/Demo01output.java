package Demo13IZIJIELU;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    java.io.OutputStream 抽象类是表示字节输出流的所有类的超类，
        将指定的字节信息写出到目的地。它定义了字 节输出流的基本共性功能方法。
    定义了一些子类共性的成员方法。
    public void close() ：关闭此输出流并释放与此流相关联的任何系统资源。
    public void flush() ：刷新此输出流并强制任何缓冲的输出字节被写出。
    public void write(byte[] b) ：将 b.length字节从指定的字节数组写入此输出流。
    public void write(byte[] b, int off, int len) ：从指定的字节数组写入 len字节，
        从偏移量 oﬀ开始输 出到此输出流。
    public abstract void write(int b) ：将指定的字节输出流。
    java.io.OutputStream继承了OutputStream

    fileOutputStream：文件字节输出流
    作用：把内存中的数据写入到文件中。
    构造方法
    public FileOutputStream(File file) ：创建文件输出流以写入由指定的 File对象表示的文件。
    public FileOutputStream(String name) ： 创建文件输出流以指定的名称写入文件
    参数：File file：目的地是一个文件。
        string name：目的地是一个文件的路径。
    作用：
        1. 创建一个FileOutputStream对象。
        2. 会根据构造方法中传递的文件/文件路径，创建一个空的文件夹。
        3. 会把FileOutputStream对象指向创建好的文件

    写入数据的原理（内存-》硬盘）
    java-->jvm-->os-->os调用写数据的方法-->把数据写入到文件中

    字节输出流的使用重点：
        1.创建一个fileoutputstream对象，构造方法中传入写入数据的目的地。
        2.调用fileoutputstream对象中的write方法，把数据写入到文件中，
        3.释放资源（流会占用一定的内存，使用完毕要把内存清空）

    任意的文本编辑器（记事本等）
        在打开文件的时候，都会查询编码表，把字节转化为字符表示
        0-127：查询ASCII表
        其他值：查询系统默认表（中文系统GBK）
 */
public class Demo01output {
    public static void main(String[] args)  throws IOException {
        //1.创建一个fileoutputstream对象，构造方法传递写入数据的目的地
        FileOutputStream fos = new FileOutputStream("D:\\IDEAProject\\IEDA01\\src\\Demo13IZIJIELU\\a.txt");
        //2.调用fileoutputstream对象中的write方法，把数据写入到文件中，
        //public void write(byte[] b) ：将 b.length字节从指定的字节数组写入此输出流
        fos.write(25);        //写数据的时候会把10进制的整数转换为2进制的整数，硬盘中存储的都是字节
        //3.释放资源（流会占用一定的内存，使用完毕要把内存清空
        //public void close() ：关闭此输出流并释放与此流相关联的任何系统资源
        fos.close();
    }
}
