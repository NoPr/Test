package Demo10Exception;
/*
自定义异常类
java提供的异常类不够使用，需要我们自己定义
    public class xxxException extends Exception | RuntimeException{
        添加一个空参数的构造方法
        添加一个带异常信息的构造方法
    }
    注册异常
    注意：
    1.自定义异常一般都是以Exception结尾，说明该类是一个异常类
    2.自定义异常类，必须的继承Exception或者RuntimeException
        继承Exception，那么自定义异常类就是一个编译器异常，如果方法内部抛出了编译器异常，就必须处理这个异常，要么throws，要么try catch
        继承RuntimeException，那么自定义的异常类就是一个运行期异常，无需处理，交给jvm

 */
public class Demo03DIYException extends Exception{

    //添加一个空参构造方法
    public Demo03DIYException() {
        super( );
    }
    //添加一个带异常信息的构造方法，查看源码发现，所有的异常类都会有一个带异常信息的构造方法
    //方法内部会调用父类带异常信息的构造方法，让父类；来处理这个异常信息

    public Demo03DIYException(String message) {
        super(message);
    }
}
