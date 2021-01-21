package Demo06Map;

import java.util.LinkedHashMap;
/*
    哈希表+链表（记录元素的顺序）
 */
public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,String> l = new LinkedHashMap<>();
        l.put("a","1");
        l.put("b","2");
        l.put("c","3");
        l.put("a","4");
        System.out.println(l);//{a=4, b=2, c=3}

    }
}
