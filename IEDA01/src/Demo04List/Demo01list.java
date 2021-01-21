package Demo04List;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*  继承了list接口
    特点：
    1.存储元素和取出元素的顺序是一样的
    2.有索引，包含了一些带索引的方法
    3.允许重复存储元素

    public void add(int index, E element) : 将指定的元素，添加到该集合中的指定位置上。
    public E get(int index) :返回集合中指定位置的元素。
    public E remove(int index) : 移除列表中指定位置的元素, 返回的是被移除的元素。
    public E set(int index, E element) :用指定元素替换集合中指定位置的元素,返回值的更新前的元素

 */
public class Demo01list {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();

        l1.add("12");
        l1.add("a");
        l1.add("b");
        l1.add("c");
        System.out.println(l1);
        //public E get(int index) :返回集合中指定位置的元素。
        System.out.println(l1.get(2));
        //在指定位置添加元素
        l1.add(3,"5");
        System.out.println(l1);
        //public E remove(int index) : 移除列表中指定位置的元素, 返回的是被移除的元素。
        String remove = l1.remove(0);
        System.out.println("被移除的元素"+remove);
        //  public E set(int index, E element) :用指定元素替换集合中指定位置的元素,返回值的更新前的元素
        String set = l1.set(3, "d");
        System.out.println("被替换的元素"+set);
        System.out.println(l1);
        //list集合遍历三种方式

        //1.使用普通的for循环
        for (int i =0;i<=l1.size();i++){
            String s = l1.get(i);
            System.out.println(s);
        }
        //2.迭代器
        Iterator<String> i =l1.iterator();
        while (i.hasNext()){
            String next = i.next();
            System.out.println(next);
        }
        //3.增强for循环
        for (String s : l1) {
            System.out.println(s);

        }


    }

}
