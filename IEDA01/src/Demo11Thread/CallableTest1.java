package Demo11Thread;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;


public class CallableTest1 implements Callable<Boolean> {
    private String url;
    private String name;
    public CallableTest1(String url,String name){
        this.url=url;
        this.name=name;
    }
    @Override
    public Boolean call() {
        WebDownloader downloader = new WebDownloader();
        downloader.downloader(url,name);
        System.out.println("下载了文件名为"+name);
        return true;
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
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableTest1 callableTest1 = new CallableTest1("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1599228191808&di=d390121f7cd95fd9bf7b52cff46caa37&i" +
                "mgtype=0&src=http%3A%2F%2Fimg1.gtimg.com%2Frushidao%2Fpics%2Fhv1%2F20%2F108%2F1744%2F113431160.jpg","7.jpg");
        CallableTest1 callableTest2 = new CallableTest1("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1599228235048&di=0d997d2b9c4d7b380d7d7d240f14e896&im" +
                "gtype=0&src=http%3A%2F%2Fa0.att.hudong.com%2F30%2F29%2F01300000201438121627296084016.jpg","8.jpg");
        CallableTest1 callableTest3 = new CallableTest1("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1599228293538&di=ec35253d4de3743d0cbb66869afbec5d&im" +
                "gtype=0&src=http%3A%2F%2Fattach.bbs.miui.com%2Fforum%2F201407%2F18%2F135446xbaqj12g0bpp2zh1.jpg","9.jpg");


        //创建执行服务 ，数字为池子中线程个数
        ExecutorService servic = Executors.newFixedThreadPool(3);

        //提交执行
        Future<Boolean> r1 = servic.submit(callableTest1);
        Future<Boolean> r2 = servic.submit(callableTest2);
        Future<Boolean> r3 = servic.submit(callableTest3);

        //获取结果
        boolean rs1 =r1.get();
        boolean rs2 =r2.get();
        boolean rs3 =r3.get();

        System.out.println(rs1);
        System.out.println(rs2);
        System.out.println(rs3);
        //关闭服务
        servic.shutdown();
    }
}
