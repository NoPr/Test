package Demo03Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo03Generic {
    public static void main(String[] args) {
        //创建对象的时候，不确定使用什么数据类型，就使用泛型
//        ArrayList<String> list = new ArrayList<String>();

        show01();
        show02();

    }

    private static void show02() {
        /*
        使用泛型，避免了类型转换的麻烦
        把运行期（代码运行之后会抛出异常）异常提升到了编译期（写代码报错）
        弊端：
        泛型是什么类型，只能存储什么类型
         */
        ArrayList<String> list = new ArrayList<String>();

        list.add("1");
        list.add("ads");
        list.add("sad");
//        list.add(1)   不能存储非String类型
    }

    /*
    创建集合对象，不使用泛型
    好处：
        集合不使用泛型，默认类型就是object，可以存储任意类型的数据,
    弊端：
        不安全，会引发异常
     */
    private static void show01() {
        ArrayList list = new ArrayList();

        list.add(1);
        list.add("ads");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            //因为集合没有数据类型，所以取出object类型
            //如果输出的时候不需要指定数据类型，那么输出的就是object
            //但如果指定，比如String类特有的方法，length获取字符串长度 多态object obj 不能
            //使用子类特有的方法需要向下转型
            //会抛出异常
            String s = (String) iterator.next();
            System.out.println(s.length());

        }

    }
}
