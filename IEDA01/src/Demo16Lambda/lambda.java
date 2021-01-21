/*
package Demo16Lambda;

*/
/**
 * 使用lambda表达式可以对一个接口进行非常简洁的实现
 *
 * 虽然可以使用lambda表达式对某些接口进行简单的实现，但是并不是所有的接口都可以
 * 用lambda表达式来实现，要求接口中定义的必须从要实现的抽象方法只能是一个。
 *
 * 在jdk8中接口新加了一个特性，default。
 *
 * @FunctionlIntyerface
 * 修饰函数式接口，接口中的抽象方法只有一个。
 *//*

public class lambda {
    public static void main(String[] args) {
        */
/**
         * 接口不能实例化，用接口的实现类可以实例化，
         *  将实现类的对象在内存中的地址指向接口，这个接口就可以使用了
         *
         *  但是不能使用实现类中有但是接口所没有的方法，
         *  包括实现类没有重写的方法
         *//*

        //1.使用接口实现
        Comparator comparator = new mycompartor();
//        comparator.compartoor(12,15);
//        comparator.jiekou();

        //2.使用匿名内部类
        Comparator  comparator1 =new Comparator() {
            @Override
            public int compartoor(int a, int b) {
                return a-b;
            }
        };

        //3.使用lambda表达式,可以非常简洁的对一个接口进行实现        
        Comparator comparator2 = ((a, b) -> a-b);
    }
}



class mycompartor implements Comparator{

    @Override
    public int compartoor(int a, int b) {
        return a-b;
    }
    public void shixain(){
        System.out.println("this is a shixian");
    }
}

@FunctionalInterface
interface Comparator{
    int  compartoor(int a,int b);

    default void jiekou(){
        System.out.println("this is a jiekou");
    }
}
*/
