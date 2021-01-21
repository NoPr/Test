package Demo04List;

import sun.plugin.javascript.navig.Link;

import java.util.LinkedList;

/*
    1.底层是链表结构，查询慢，增删快
    2.里边包含了大量操作首尾元素的方法
    3.注意：使用linkedlist集合特有的方法，不能使用多态。
    public void addFirst(E e) :将指定元素插入此列表的开头。
    public void addLast(E e) :将指定元素添加到此列表的结尾。
    public void push(E e) :将元素推入此列表所表示的堆栈。

    public E getFirst() :返回此列表的第一个元素。
    public E getLast() :返回此列表的后一个元素。

    public E pop() :从此列表所表示的堆栈处弹出一个元素。
    public E removeFirst() :移除并返回此列表的第一个元素。
    public E removeLast() :移除并返回此列表的后一个元素。

    public boolean isEmpty() ：如果列表不包含元素，则返回true
 */
public class Demo01LinkList {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
    }

    private static void show03() {
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("a");
        l1.add("b");
        l1.add("c");
        l1.add("d");

        String s = l1.removeFirst();
        System.out.println(s);

        System.out.println(l1.removeLast());

        System.out.println(l1.pop());// pop相当于removefirst

    }

    private static void show02() {
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("a");
        l1.add("b");
        l1.add("c");

        l1.clear();//清空元素
        if (!  l1.isEmpty()){  //不包含元素返回true，所以加一个取反
            //1
            System.out.println(l1.getFirst());
            //2
            String last = l1.getLast();
            System.out.println(last);
            //1,2操作等效，不过一个输出末尾，一个输出开头，
        }
    }
    private static void show01() {
        LinkedList<String> l1 = new LinkedList<String>();
        //add
        l1.add("a");
        l1.add("b");
        l1.add("c");
        System.out.println(l1);

        l1.addFirst("01");
        l1.addLast("09");//普通add方法也是添加到末尾
        //push 等效于addfist
        l1.push("09");
        System.out.println(l1);
    }
}
