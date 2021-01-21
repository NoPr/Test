package Demo13IZIJIELU;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*    public void write(byte[] b) ：将 b.length字节从指定的字节数组写入此输出流。
      public void write(byte[] b, int off, int len) ：从指定的字节数组写入 len字节，
             从偏移量off开始输出到此输出流

      1.创建一个fileoutputstream对象，构造方法中传入写入数据的目的地。
      2.调用fileoutputstream对象中的write方法，把数据写入到文件中，
      3.释放资源（流会占用一定的内存，使用完毕要把内存清空）

 */
public class Demo01moreoutput {
    public static void main(String[] args) throws IOException {
        //1.创建一个fileoutputstream对象，构造方法中传入写入数据的目的地。
        FileOutputStream fos = new FileOutputStream(new File("D:\\IDEAProject\\IEDA01\\src\\Demo13IZIJIELU\\b.txt"));
        //2.调用fileoutputstream对象中的write方法，把数据写入到文件中，
        //假如要在文件中显示100，要写几个字节    3
        fos.write(49);
        fos.write(48);
        fos.write(48);
         /*
            public void write(byte[] b) ：将 b.length字节从指定的字节数组写入此输出流。
            一次写多个字节：
                如果写的第一个字节是正数（0-127），那么显示的时候会 查询ASCII表
                如果写的第一个字节是负数，那么第一个字节和第二个字节，两个字节会组成一个中文字节，
                查询系统默认码表。
         */
        byte[] bytes ={65,66,69,65};
        byte[] bytes1 ={-65,-66,-69,-65};
        fos.write(bytes);
        fos.write(bytes1);
        /*
             public void write(byte[] b, int off, int len) ：
                把字节数组的一部分写入到文件中。
                int off：数组的开始索引。
                int len：写几个字节
         */
        fos.write(bytes,1,2);
        /*
            写入字符串的方法
            可以使用string类中的方法把字符串，转换为字节数组。
            byte【】 getBytes（）把字符串转换为字节数组。
         */
        byte[] bytes2 = "你好".getBytes();
       // System.out.println(Arrays.toString(bytes2));      //[-28, -67, -96, -27, -91, -67]
        fos.write(bytes2);

        // 3.释放资源（流会占用一定的内存，使用完毕要把内存清空）
        fos.close();





    }

}
