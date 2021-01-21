package Demo10Exception;
/*
    throw关键字：
    使用格式：
        throw new***Exception（“异常产生的原因”）
    注意：
        1.throw关键字必须写在方法的内部
        2.throw关键字后边new的对象必须是Exception或者Exception的子类对象
        throw关键字抛出指定异常对象，我们就必须处理这个异常对象
            throw关键字后边创建的是RuntimeException或者是RuntimeException的子类对象，
            我们可以不处理，默认交给jvm处理（打印异常，中断程序）
            throw关键字后边创建的是编译异常（写代码的时候报错），我们必须处理这个异常，要么throws，要么try catch
 */

public class Demo01throw {
    public static void main(String[] args) {
        int [] arr =new int[3];
        int  e = getElement(arr,0);
        System.out.println(e);

    }
    /*
        以后在工作中，我们必须首先对方法传递过来的参数进行合法性校验，
        如果参数不合法，我们就必须使用抛出异常的方式，告知 方法的调用者，传递的参数有问题
        NullPointerException是一个运行期异常，默认交给JVM处理
     */
    public  static int getElement(int [] arr, int index) {
        /*
            我们可以对传递过来的参数数组，进行合法性校验
            如果数组arr的值是null；
            那么我们就抛出空指针异常，告知方法的调用者 “传递的数组的值是null”
         */
        if (arr==null){
            throw new NullPointerException("传递的数组的值为空");
        }
        /*
            我们可以对传递过来的参数进行合法性校验
            如果index范围不在数组的索引范围内，那么我们就抛出数组索引越界异常，
            告知方法的调用者“传递的索引超出了数组的适用范围”
         */
        if (index<0||index>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("数组的索引越界");
        }
        int ele = arr[index];
        return ele;

    }
}
