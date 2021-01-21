package Demo11Thread;
/**
 * 实现线程方式一，继承Thread接口
 */

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

//练习Thread,实现网图下载
public class ThreadTest1 extends Thread{
    public static void main(String[] args) {
        ThreadTest1 test1 = new ThreadTest1("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10" +
                "000&sec=1599221059435&di=b71d728e9982c46f9f02b00ffd0ad56d&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com" +
                "%2Fwallpaper%2F2018-07-25%2F5b57f23663fed.jpg","1.jpg");
        ThreadTest1 test2 = new ThreadTest1("https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1178458362,2481887775&fm=11&gp=0.jpg","2.jpg");
        ThreadTest1 test3 = new ThreadTest1("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3253095303,3656538668&fm=26&gp=0.jpg","3.jpg");
        //猜想下载 1.2.3；
        //实际  2. 1.3
        test1.start();
        test2.start();
        test3.start();

    }
    private String url;
    private String name;
    public ThreadTest1(String url,String name){
        this.url=url;
        this.name=name;
    }
    @Override
    public void run() {
        WebDownloader downloader = new WebDownloader();
        downloader.downloader(url,name);
        System.out.println("下载了文件名为"+name);
    }
}
//下载器
class WebDownloader{
    //下载方法
    public void downloader (String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出现问题");
        }
    }
}
