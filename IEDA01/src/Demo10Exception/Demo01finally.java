package Demo10Exception;

import java.io.FileNotFoundException;

/*
    ﬁnally：有一些特定的代码无论异常是否发生，都需要执行。另外，因为异常会引发程序跳转，
    导致有些语句执行 不到。而ﬁnally就是解决这个问题的，在ﬁnally代码块中存放的代码都是一定会被执行的

    try...catch....ﬁnally:自身需要处理异常,终还得关闭资源
    注意：
    1.ﬁnally不能单独使用
    2.finallu一般用于资源释放（资源回收），无论程序是否出现程序异常，最后都要释放
 */
public class Demo01finally {
    public static void main(String[] args) {
        try {
            //可能会产生异常的代码
            read("a.tx");
        } catch (FileNotFoundException e) {
            //抓取到的是编译期异常  抛出去的是运行期，异常的处理逻辑
            e.printStackTrace();
        }finally {
            System.out.println("不管程序怎么样，这里都会被执行");
        }
        System.out.println("end");
    }
    public static void read(String path) throws FileNotFoundException {
        if (! path.equals("a.txt")){//如果不是 a.txt这个文件
           // 我假设  如果不是 a.txt 认为 该文件不存在 是一个错误 也就是异常  throw
            throw  new FileNotFoundException("文件不存在");
        }
    }
}
