package Demo01Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    public static <T> boolean addAll(Collection<T> c, T... elements) :往集合中添加一些元素。
    public static void shuffle(List<?> list) 打乱顺序 :打乱集合顺序。
    public static <T> void sort(List<T> list) :将集合中元素按照默认规则排序。
    public static <T> void sort(List<T> list，Comparator<? super T> ) :将集合中元素按照指定规则排 序
 */
public class Demo02CollectionsUtils {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //原来写法         
        // list.add(12);         
        // list.add(14);         
        // list.add(15);         
        // list.add(1000);
        //采用工具类 完成 往集合中添加元素           
//        Collections.addAll(list,5,15,20,"asd",);
//        System.out.println(list);

        //排序方法          
        list.add(12);
        list.add(5);
        list.add(8);
        Collections.sort(list);//默认是升序
        System.out.println(list);
        /*
            1.Comparable和2.Comparator
            1相当于找一个第三方的裁判比较两人
            2自己（this）和别人（参数）比较，自己需要实现Comparable接口，重写比较的规则Comparator方法
         */
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            //重写比较的规则
            public int compare(Integer o1, Integer o2) {
                //return o1-o2;//升序排序
                return  o2-o1;//降序
            }
        });
        System.out.println(list);
    }
}
