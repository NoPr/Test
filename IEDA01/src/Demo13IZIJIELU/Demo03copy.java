package Demo13IZIJIELU;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*  文件的复制

 */
public class Demo03copy {
    public static void main(String[] args) throws IOException {
        long s =  System.currentTimeMillis();
        FileInputStream fis =new FileInputStream("D:\\壁纸\\电脑壁纸\\1 (127).jpg");

        FileOutputStream fos = new FileOutputStream("D:\\IDEAProject\\IEDA01\\src\\Demo13IZIJIELU\\1 (127).jpg");

        //使用字节缓冲，读取多个字节，写入多个字节
        byte[] bytes = new byte[1024]; //也可以是1024的整数倍
        int len;
        while((len = fis.read(bytes))!=-1){
            //System.out.println(len);
            fos.write(bytes,0,len);
        }
        //先关闭写的，再关闭读的。
        fos.close();
        fis.close();
        long e =System.currentTimeMillis();
        System.out.println("复制文件共耗时"+(e-s)+"毫秒");
    }
}
