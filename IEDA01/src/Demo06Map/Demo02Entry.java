package Demo06Map;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
     Map 中存放的是两种对象，一种称为key(键)，一种称为value(值)，
     它们在在 Map 中是一一对应关 系，这一对对象又称做 Map 中的一个 Entry(项) 。
     Entry 将键值对的对应关系封装成了对象。即键值对对象，这 样我们在遍历 Map 集合时，
     就可以从每一个键值对（ Entry ）对象中获取对应的键与对应的值。
     public K getKey() ：获取Entry对象中的键。
     public V getValue() ：获取Entry对象中的值。 在Map集合中也提供了获取所有Entry对象的方法：
     public Set<Map.Entry<K,V>> entrySet() : 获取到Map集合中所有的键值对对象的集合(Set集合

 */
public class Demo02Entry {
    //使用Entry对象遍历
    //使用map集合中的entryset（）方法，把map集合中的多个entry对象取出来，存储到set集合中。
    //遍历set集合，获取每一个entry对象
    //使用entry对象中的方法获取。
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<String, Integer>();

        hashMap.put("Scarlett Johansson",1984);
        hashMap.put("Taylor Swift",1989);
        hashMap.put("林志玲",1974);
        //Set<Map.Entry<K,V>> entrySet() : 获取到Map集合中所有的键值对对象的集合(Set集合
        Set<Map.Entry<String,Integer>> set = hashMap.entrySet();

        //遍历
//        Map集合不能直接使用迭代器或者foreach进行遍历。但是转成Set之后就可以使用了
        //1.迭代器
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
//        while (it.hasNext()){
//            String k =hashMap.getK();
//
//        }

    }

    private static class Entry {
    }
}
