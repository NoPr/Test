package Demo05Set;

import person.person;

/*
    哈希值：
        是一个十进制的整数，由系统随机给出（就是对象的地址值，是一个逻辑地址，是模拟出来得到的地址，不是数据实际存储的物理地址）
        在objec类有一个方法，可以获取对象的哈希值
 */
public class Demo01HashCode {
    public static void main(String[] args) {
        person p1 = new person();
        int h1 = p1.hashCode();
        System.out.println(h1);

        person p2 = new person();
        int h2 = p2.hashCode();
        System.out.println(h2);

        String s1 = new String("13");
        String s2 = new String("13");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
