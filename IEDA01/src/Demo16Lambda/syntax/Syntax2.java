package Demo16Lambda.syntax;

import Demo16Lambda.interfaces.*;

/**
 * 语法精简
 * 1.参数
 *  由于在接口的抽象方法中，已经定义了参数的数量和类型，所以在lambda表达式中参数的类型可以省略
 *    备注：如果需要省略类型，则每一个参数的类型都需要省略。
 */
public class Syntax2 {
    public static void main(String[] args) {

        LambdaSingleReturnMutipleParameter lambda1= (a,b)->{
            System.out.println("xixixi");
            return a*2+5*b;
        };
        System.out.println(lambda1.test(12,55));

        /**
         * 2.小括号
         * 如果参数列表中，参数的数量只有一个，此时小括号可以省略
         */
        LambdaSingleReturnSingleParameter lambda2 = a -> {
            System.out.println("hshhh");
            return a*5;
        };
        System.out.println(lambda2.test(44));


        /**
         * 方法大括号
         *  如果方法体中只有一条语句，此时大括号可以省略
         */
        LambdaNoneReturnSingleParamter lambd3= a ->System.out.println("asdasd");

        /**
         * 如果方法体中唯一一条语句是返回值,在省略掉大括号中的同时必须省略return
         */
        LambdaSingleReturnNoneParameter lambda4 = () ->10;
    }
}
