package Demo16Lambda.exercise;

import Demo16Lambda.data.Person;

import java.util.ArrayList;

/**
 * 集合排序
 *  在一个ArrayList中有若干个person对象，将这些person对象按照年龄进行降序排序
 */
public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("小明",20));
        list.add(new Person("梨花",22));
        list.add(new Person("暴雪",23));
        list.add(new Person("哈哈",25));
        list.add(new Person("拳头",25));
        list.add(new Person("无黁",10));

//        list.sort((o1, o2) -> {
//            return o2.age-o1.age;
//        });
//    }
        }
//    }

}
