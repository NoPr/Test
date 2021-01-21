package Demo05Set;

import java.util.HashSet;

/*
    set集合不允许存储重复元素集合的原理
    ser集合在调用add方法的时候，add方法会调用元素的hashcode方法和equals方法，判断元素是否重复
 */
public class Demo01SetString {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String s1  = new String("abc");
        String s2 = new String("abc");
        set.add(s1);
        set.add(s2);

        set.add("重地");
        set.add("通话");
        set.add("abc");

        System.out.println(set);//[重地, 通话, abc]
    }
}
