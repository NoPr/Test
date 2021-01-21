package Demo03Generic;

/*
    修饰符 <泛型> 返回值类型 方法名（参数列表（使用泛型））
    **在创建对象的时候确定泛型**
    **调用方法时，确定泛型的类型**

 */
public class Demo03Method {

    //定义一个含有泛型的方法
    public <M>void  Method01(M m){
        System.out.println(m);
    }
    public  static <S> void Method02(S s){
        System.out.println(s);

    }
}
