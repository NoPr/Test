package Demo13ZIFULIU;

import java.io.FileWriter;
import java.io.IOException;

/*
    1.写出字符数组 ：
    write(char[] cbuf) 和 write(char[] cbuf, int off, int len) ，每次可以写出字符数 组中的数据，用法类似FileOutputStream，
    2. 写出字符串：
    write(String str) 和 write(String str, int off, int len) ，每次可以写出字符串中的 数据，更为方便
    3. 续写和换行：
    操作类似于FileOutputStream
 */
public class Demo03moreWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\IDEAProject\\IEDA01\\src\\Demo13ZIFULIU\\c.txt");
        //write(char[] cbuf)
        char [] cs = {'a','v','c','s','w'};
        fw.write(cs);
        //write(char[] cbuf, int off, int len) ，每次可以写出字符数 组中的数据
        fw.write(cs,0,3);//从Index 0开始写，写 3 个。
        //write(String str)
        fw.write("xixixi");
        //write(String str, int off, int len)
        fw.write("你说谎",0,2);
        fw.close();
    }
}
