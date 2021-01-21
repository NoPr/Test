package Demo06Map;

import java.util.HashMap;

/*
    Map集合的特点：
        1.Map是一个双列集合，一个元素包含两个值（key，value）
        2.Map集合中的元素的数据类型，key和value的数据类型可以相同，也可以不同。
        3.key不允许重复，value允许重复
        4.key和value是一一对应的

        HashMap：存储数据采用的哈希表结构，元素的存取顺序不能保证一致。由于要保证键的唯一、不重复，需 要重写键的hashCode()方法、equals()方法。

        LinkedHashMap：HashMap下有个子类LinkedHashMap，存储数据采用的哈希表结构+链表结构。
        通过链 表结构可以保证元素的存取顺序一致；通过哈希表结构可以保证的键的唯一、不重复，需要重写键的 hashCode()方法、equals()方法

        public V put(K key, V value) :  把指定的键与指定的值添加到Map集合中。
        public V remove(Object key) : 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的 值。
        public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
        public Set<K> keySet() : 获取Map集合中所有的键，存储到Set集合中。
        public Set<Map.Entry<K,V>> entrySet() : 获取到Map集合中所有的键值对对象的集合(Set集合)
 */
public class Demo01Map {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();//数据类型可以相同也可以不同
        //使用put方法时，若指定的键(key)在集合中没有，则没有这个键对应的值，返回null，并把指定的键值添加到 集合中
        //若指定的键(key)在集合中存在，则返回值为集合中键对应的值（该值为替换前的值），并把指定键所对应的 值，替换成指定的新值
        hm.put("霞","ADC");
        hm.put("洛","辅助");
        hm.put("卡萨丁","中单");
        hm.put("刀妹","上单");
        hm.put("皇子","打野");
        System.out.println(hm);
        System.out.println("=============");

        String s =hm.remove("卡萨丁");
        System.out.println(s);
        System.out.println("=============");

        System.out.println(hm.get("洛"));

        System.out.println(hm.keySet());

        System.out.println(hm.entrySet());



    }
}
