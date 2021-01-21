package Demo05Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
    继承了Collection
    1.不允许存储重复的元素。
    2.没有索引， 没有带索引的方法，也不能使用普通的for循环遍历

    HashSet特点
    1.不允许存储重复的元素。
    2.没有索引， 没有带索引的方法，也不能使用普通的for循环遍历
    3.是一个无序的集合,存储和取出的顺序有可能不一样
    4.底层是一个哈希表结构，查询速度特别快
 */
public class Demo01Set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        //add
        set.add("1");
        set.add("as");
        set.add("v");
        set.add("2");
        //不能使用for循环遍历
        //迭代器
        Iterator<String> iterator =set.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(iterator.next());

        }
        System.out.println("================");;
        //增强for
        for (String s : set) {
            System.out.println(s);
        }
    }
}
