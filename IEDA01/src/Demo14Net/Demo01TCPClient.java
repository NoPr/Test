package Demo14Net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*  TCP通信的客户端，向服务器发送请求，给服务器发送数据，读取客户端回写的数据，
    表示客户端的类
        Socket：该类实现客户端套接字，套接字指的是两台设备之间通讯的端点。
        构造方法
    public Socket(String host, int port) :创建套接字对象并将其连接到指定主机上的指定端口号。
    host：代表服务器主机的名称/服务器的ip地址。
    int port：服务器的端口号
    如果指 定的host是null ，则相当于指定地址为回送地址。
    小贴士：回送地址(127.x.x.x) 是本机回送地址（Loopback Address），
    主要用于网络软件测试以及本 地机进程间通信，无论什么程序，一旦使用回送地址发送数据，立即返回，不进行任何网络传输。
    成员方法
        public InputStream getInputStream() ： 返回此套接字的输入流。 如果此Socket具有相关联的通道，则生成的InputStream 的所有操作也关联该通道。 关
        闭生成的InputStream也将关闭相关的Socket。
        public OutputStream getOutputStream() ： 返回此套接字的输出流。 如果此Socket具有相关联的通道，则生成的OutputStream 的所有操作也关联该通道。
        关闭生成的OutputStream也将关闭相关的Socket。
        public void close() ：关闭此套接字。 一旦一个socket被关闭，它不可再使用。 关闭此socket也将关闭相关的InputStream和OutputStream 。
        public void shutdownOutput() ： 禁用此套接字的输出流。  任何先前写出的数据将被发送，随后终止输出流
        实现步骤：
        1.创建一个客户端对象Scoket，构造方法绑定服务器的ip地址和端口号
        2.使用Ccoket对象中的方法getOutputStream（）获取网络字节输出流OutputStream
        3.使用网络字节输出流OutputStream对象中的方法write，给服务器发送数据。
        4.使用Scoket对象中的方法getInputStream（）获取 网络字节输入流InputStream对象，
        5.使用网络字节输入流InputStream对象中的方法read，读取服务器回写的数据。
        6.释放资源（Socket）。
      注意
      1.客户端和服务器端交互，必须使用Scoket中提供的网络流，不能使用自己的流对象，
      2.当我们创建客户端对象Scoket的时候，就会去请求服务器和服务器经过三次握手建立的连接通路。
        这时如果服务器没有启动，那么就会抛出异常。
        如果服务器已经启动，那么就会进行交互了


 */
public class Demo01TCPClient {
    public static void main(String[] args) throws IOException {
        //创建一个客户端对象Scoket，构造方法绑定服务器的ip地址和端口号
        Socket socket = new Socket("127.0.0.1",10086);
        //使用Ccoket对象中的方法getOutputStream（）获取网络字节输出流OutputStream
        OutputStream os = socket.getOutputStream();
        //使用网络字节输出流OutputStream对象中的方法write，给服务器发送数据。
        os.write("你好服务器".getBytes());
        //使用Scoket对象中的方法getInputStream（）获取 网络字节输入流InputStream对象，
        InputStream ins = socket.getInputStream();
        //使用网络字节输入流InputStream对象中的方法read，读取服务器回写的数据。
        byte[] bytes = new byte[1024];
        int len = ins.read(bytes);
        System.out.println(new String(bytes,0,len));
        //释放资源
        socket.close();


    }
}
