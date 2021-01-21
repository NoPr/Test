package Demo13ZIFULIU;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
    flush ：刷新缓冲区，流对象可以继续使用。
    close :先刷新缓冲区，然后通知系统释放资源。流对象不可以再被使用了。

 */
public class Demo02flushANDclose {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\IDEAProject\\IEDA01\\src\\Demo13ZIFULIU\\b.txt");

        fw.write("a");
        fw.flush();

        fw.write("b");
        fw.flush();

        fw.close();

        fw.write("c");//Exception in thread "main" java.io.IOException: Stream closed
    }
}
