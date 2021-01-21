package Demo10Exception;

import java.util.Objects;

/*
    public static <T> T requireNonNull(T obj) :查看指定引用对象不是null。
    public static <T> T requireNonNull(T obj) {     
        if (obj == null)       
        throw new NullPointerException();        
        return obj; }
 */
public class Demo01Objects {
    public static void main(String[] args) {
        method(null);
    }
    public static void method(Object obj){
        //对传递过来的参数进行合法性判断，判断是否为null；
//        if (obj == null) {
//            throw  new NullPointerException("传递的对象的值是null");
//        }
//        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj,"传递的对象的值是null");//用这个方法判断
    }
}
