package Demo03Generic;

import java.util.ArrayList;
import java.util.Iterator;

/*
泛型的通配符:**不知道使用什么类型来接收的时候,此时可以使用?,?表示未知通配符。**
？能代表任意数据类型
使用方式：
不能创建对象使用
只能作为方法的参数使用


此时只能接受数据,不能往该集合中存储数据
 */
public class Demo03Generictongpeifu {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");

        printArray(list1);
    }
    /*
    定义一个方法，能遍历所有的Arraylist集合
    这时候我们不知道Arraylist集合使用什么数据类型，可以使用泛型的通配符？
     */
    //注意：泛型是没有继承概念的
    public static void  printArray(ArrayList<?>list){
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()){
//            iterator.next()取出的元素是object类型，可以接受任意属性的元素
            Object next = iterator.next();
            System.out.println(next);
        }

    }
}
