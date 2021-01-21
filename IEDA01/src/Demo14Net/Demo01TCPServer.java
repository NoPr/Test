package Demo14Net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*  ServerSocket 类：这个类实现了服务器套接字，该对象等待通过网络的请求。
    构造方法
    public ServerSocket(int port) ：使用该构造方法在创建ServerSocket对象时，就可以将其绑定到一个指 定的端口号上，参数port就是端口号。
    服务器必须明确一件事，必须知道哪个客户端请求的服务器
    所以可以使用accept方法获取到请求的客户端对象Socket
    成员方法
    public Socket accept() ：侦听并接受连接，返回一个新的Socket对象，用于和客户端实现通信。该方法 会一直阻塞直到建立连接。
    服务器的实现步骤：
    1.创建服务器ServerSocket对象，
    2.使用ServerSocket对象中的方法accept，获取请求到的客户端的对象Socket
    3.使用Scoket对象中的方法getInputStream（）获取 网络字节输入流InputStream对象
    4.使用网络字节输入流InputStream对象中的方法read，读取客户端发送的数据。
    5.用Ccoket对象中的方法getOutputStream（）获取网络字节输出流OutputStream
    6.使用网络字节输出流OutputStream对象中的方法write，给客户端回写数据。
    7.释放资源（Socket，ServerSocket）
 */
public class Demo01TCPServer {
    public static void main(String[] args) throws IOException {
//        1.创建服务器ServerSocket对象，
        ServerSocket ss = new ServerSocket(10086);
//        2.使用ServerSocket对象中的方法accept，获取请求到的客户端的对象Socket
        Socket accept = ss.accept();
//        3.使用Scoket对象中的方法getInputStream（）获取 网络字节输入流InputStream对象
        InputStream is = accept.getInputStream();
//        4.使用网络字节输入流InputStream对象中的方法read，读取客户端发送的数据。
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
//        5.用Scoket对象中的方法getOutputStream（）获取网络字节输出流OutputStream
        OutputStream os = accept.getOutputStream();
//        6.使用网络字节输出流OutputStream对象中的方法write，给客户端回写数据。
        os.write("收到，谢谢".getBytes() );
//        7.释放资源（Socket，ServerSocket）
        ss.close();
        accept.close();
    }
}
