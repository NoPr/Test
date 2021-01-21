package Demo13IZIJIELU;
import com.sun.org.apache.xerces.internal.impl.xs.XSAttributeDecl;
import com.sun.prism.impl.shape.MaskData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/*
        使用字节数组读取： read(byte[] b) ，每次读取b的长度个字节到数组中，返回读取到的有效字节个数，读 取到末尾时，返回 -1
        明确两件事：
           1.方法的参数byte[]的作用？
           起到缓冲作用，存储每次读到的多个字节
           数组的长度一般定义为1024（1k）或者1024的整数倍
           2.方法的返回值int是什么？
           每次读取到的有效字节个数

         string类的构造方法
            String（byte【】 bytes）：把字节数组转换为字符串
            String(byte[] bytes, int offset, int length):把字符串数组的一部分转换为字符串
            offset：数组的开始索引
            length：转换的字节个数
*/
public class Demo02moreInput {
    public static void main(String[] args) throws IOException {
        //1
        FileInputStream fis = new FileInputStream("D:\\IDEAProject\\IEDA01\\src\\Demo13IZIJIELU\\b.txt");
        //2
//        byte[] bytes = new byte[2];
//        int len = fis.read(bytes);
//
//        System.out.println(len);
//        System.out.println(Arrays.toString(bytes));
//        //String（byte【】 bytes）：把字节数组转换为字符串
//        System.out.println(new String(bytes));
        //定义变量，作为有效个数
        int len;
        // 定义字节数组，作为装字节数据的容器
        byte[] bytes = new byte[2];
        while ((len =fis.read(bytes))!=-1){
            // 每次读取后,把数组变成字符串打印
           // System.out.println(new String(bytes));
            System.out.println(new String(bytes,0,len));
        }


        //3
        fis.close();

    }



}
