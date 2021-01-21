//package Demo07JDK9;
//
//import java.util.List;
//
///*
//    jdk9新特性：
//    list接口，set接口，map接口里边增加了一个静态方法of，可以给集合一次性添加多个元素
//    static <E> list <E> of (E...elements)
//    适用前提：
//    当集合中存储的元素的个数已经确定不再改变时使用。
//    注意：
//    of方法只是适用于list接口，set接口，map接口，不适用于接接口的实现类
//    of方法的返回值是一个不能改变的集合，集合不能再使用add，put方法添加元素，会抛出异常
//    set接口，map接口在调用方法是不能有重复的元素，否则会抛出异常
// */
//public class Demo01JDK9 {
//    public static void main(String[] args) {
//       // List<String> list=List.of("a","b","c","d","e");
//        System.out.println(list);
//    }
//}
