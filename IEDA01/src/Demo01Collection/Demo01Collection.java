package Demo01Collection;

import java.util.ArrayList;
import java.util.Collection;
/*
Collection是所有单列集合的父接口，因此在Collection中定义了单列集合(List和Set)通用的一些方法，这些方法可用于操作所有的单列集合。方法如下：

* `public boolean add(E e)`：  把给定的对象添加到当前集合中 。
* `public void clear()` :清空集合中所有的元素。
* `public boolean remove(E e)`: 把给定的对象在当前集合中删除。
* `public boolean contains(E e)`: 判断当前集合中是否包含给定的对象。
* `public boolean isEmpty()`: 判断当前集合是否为空。
* `public int size()`: 返回集合中元素的个数。
* `public Object[] toArray()`: 把集合中的元素，存储到数组中。

 */
public class Demo01Collection {
    public static void main(String[] args) {
        //首先创建集合对象
        Collection<String> coll = new ArrayList<>(); //接口指向实现类，多态
        //public boolean add(E e)`：  把给定的对象添加到当前集合中 。
        coll.add("hello");
        coll.add("world");
        coll.add("java");
        boolean b1 =coll.add("xixixi");     //返回的是boolean类型

        // `public int size()`: 返回集合中元素的个数。
//        int i1 =coll.size();
//        System.out.println(i1);
        System.out.println(coll.size());

        //* `public boolean remove(E e)`: 把给定的对象在当前集合中删除。
        boolean result = coll.remove("java");           //删掉java
        System.out.println(coll);
        System.out.println(result);
        //public boolean contains(E e)`: 判断当前集合中是否包含给定的对象。
        boolean b2 = coll.contains("java");
        System.out.println(b2);

        // public void clear()` :清空集合中所有的元素
        coll.clear();
        System.out.println(coll);
        //public boolean isEmpty()`: 判断当前集合是否为空。
        boolean b3 = coll.isEmpty();
        System.out.println(b3);

        //public Object[] toArray()`: 把集合中的元素，存储到数组中。
//        Object arr = coll.toArray();
//        //遍历数组
//        for (int i = 0; i<arr.length; i++){
//            System.out.println([i]);
//        }

    }
}
