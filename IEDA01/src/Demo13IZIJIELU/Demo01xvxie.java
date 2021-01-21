package Demo13IZIJIELU;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    public FileOutputStream(File file, boolean append) ： 创建文件输出流以写入由指定的 File对象表示的 文件。
    public FileOutputStream(String name, boolean append) ： 创建文件输出流以指定的名称写入文件。 这两个构造方法，
    参数：File file：目的地是一个文件。
        string name：目的地是一个文件的路径。
        boolean append：追加写开关，
    参数中都需要传入一个boolean类型的值，
        true 表示追加数据，
        false（创建一个新文件，覆盖原文件）表示清空原有数据。 这样创建的输出流对象，就可以指定是否追加续写了
     写换行：
        windows：\r\n
        Linux：/n
        MAC:/r


 */
public class Demo01xvxie {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\IDEAProject\\IEDA01\\src\\Demo13IZIJIELU\\c.txt",true);
        for (int i = 0; i <10 ; i++) {
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes());
        }

        fos.close();
    }
}
