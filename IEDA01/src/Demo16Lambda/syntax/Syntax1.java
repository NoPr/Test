package Demo16Lambda.syntax;

import Demo16Lambda.interfaces.*;

public class Syntax1 {
    //1.lambda表达式的基本语法；
    //lambda是一个匿名函数
    //参数列表，方法体

    //（）：用来描述参数列表
    //{}：用来描述方法体
    // -> lambda运算符，读作goes to



    public static void main(String[] args) {
        //无参无返回
        LambdaNoneReturnNoneParamter lambda1 =()->{
            System.out.println("hello");
        };
        lambda1.test();

        //无返回值单个参数
        LambdaNoneReturnSingleParamter lambda2=(int a)->{
            System.out.println(a);
        };
        lambda2.test(10);

        //无返回值多个参数
        LambdaNoneReturnMutipleParameter lambda3=(int a ,int b)->{
            System.out.println(a+b);
        };
        lambda3.test(12,55);


        //无参有返回
        LambdaSingleReturnNoneParameter lambda4=()->{
            System.out.println("lambda4");
            return  100;
        };
        int test = lambda4.test();
        System.out.println(test);

        //有返回值单个参数
        LambdaSingleReturnSingleParameter lambda5=(int a )->{
            System.out.println("lambda5");
            return  a*2;
        };
        int test1 = lambda5.test(500);
        System.out.println(test1);

        //有返回值多个参数
        LambdaSingleReturnMutipleParameter lambda6=(int a,int b )->{
            return  a*2+b*4;
        };
        int test2 = lambda6.test(500,100);
        System.out.println(test2);
    }

}
