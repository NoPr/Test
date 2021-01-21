package Demo02Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*

 * `public E next()`:返回迭代的下一个元素。
 * `public boolean hasNext()`:如果仍有元素可以迭代，则返回 true。

 */
public class Demo02Iterator {
    public static void main(String[] args) {
        forxunhuan();

        Collection<String> coll = new ArrayList<>();

        coll.add("2");
        coll.add("6");
        coll.add("5");
        coll.add("4");
        coll.add("3");
        // 接口                 实现类          多态
        Iterator<String> it = coll.iterator();//迭代器的泛型跟着集合走

        boolean b = it.hasNext();//判断
        System.out.println(b);
        //使用循环优化，用迭代器取出元素
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
            //增强for循环(也称for each循环)是**JDK1.5**以后出来的一个高级for循环，专门用来遍历数组和集合的。
            // 它的内部原理其实是个Iterator迭代器，所以在遍历的过程中，不能对集合中的元素进行增删操作
            //它用于遍历Collection和数组。通常只进行遍历元素，不要在遍历的过程中对集合元素进行增删操作。
            /*44
            for(元素的数据类型  变量 : Collection集合or数组){
             	//写操作代码
}
             */
        }
    }
    //增强for循环
    public static void forxunhuan(){
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        for (String i :list){
            System.out.println(i);
        }
    }
}
