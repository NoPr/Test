package Demo11Thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * 实现多线程和方式二，实现Runnable接口
 */
public class RunnableTest2 implements Runnable{
    private String url;
    private String name;
    public RunnableTest2(String url,String name){
        this.url=url;
        this.name=name;
    }
    @Override
    public void run() {
        WebDownloader downloader = new WebDownloader();
        downloader.downloader(url,name);
        System.out.println("下载了文件名为"+name);
    }

    class WebDownloader {
        public void downloader (String url,String name){
            try {
                FileUtils.copyURLToFile(new URL(url),new File(name));
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("IO异常，downloader方法出现问题");
            }
        }
    }

    public static void main(String[] args) {
        RunnableTest2 runnableTest1 = new RunnableTest2("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1599222773202&di=b1aa47fe120683eef0beccb4d0c524e5&imgtype=" +
                "0&src=http%3A%2F%2Ft8.baidu.com%2Fit%2Fu%3D1484500186%2C1503043093%26fm%3D79%26app%3D86%26f%3DJPEG%3Fw%3D1280%26h%3D853","4.jpg");
        RunnableTest2 runnableTest2 = new RunnableTest2("https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1166223310,4080319737&fm=26&gp=0.jpg","5.jpg");
        RunnableTest2 runnableTest3 = new RunnableTest2("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1599222878332&di=47dcbc6b63ddd6270aad255847dbe612&imgtype=0&src=http%3" +
                "A%2F%2Fdik.img.kttpdq.com%2Fpic%2F21%2F14405%2Fe57a4aa3aa93af47_1680x1050.jpg","6.jpg");

        new Thread(runnableTest1).start();
        new Thread(runnableTest2).start();
        new Thread(runnableTest3).start();

    }
}
