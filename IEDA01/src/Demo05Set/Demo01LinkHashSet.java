package Demo05Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
    是链表和哈希表组合的一个数据存储结构。
    底层是一个哈希表（数组+链表/红黑树）+链表：多了一条链表（记录元素的存储顺序），保证元素有序
 */
public class Demo01LinkHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("abc");
        set.add("www");
        set.add("asda");

        System.out.println(set);    //[asda, abc, www]无序且不重复
        System.out.println("=====================");
        LinkedHashSet<String> l = new LinkedHashSet<>();
        l.add("abc");
        l.add("abc");
        l.add("www");
        l.add("asda");
        System.out.println(l);  //[abc, www, asda],有序不重复
    }
}
