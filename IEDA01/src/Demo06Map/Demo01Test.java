package Demo06Map;

import java.util.HashMap;
import java.util.Scanner;

/*
    计算字符串中华每个字符出现的次数
 */
public class Demo01Test {
    public static void main(String[] args) {
        //scanner 获取用户输入的字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要测试的字符串");
        String s = sc.next();
        //创建map集合，key是字符串中的字符，vaule是字符串的个数
        HashMap<Character,Integer> map = new HashMap<>();
        //遍历字符串，获取每一个字符
        for(char c:s.toCharArray()){
        //使用获取到的字符，去map集合判断key是否存在
            if (map.containsKey(c)){
                //key存在
                Integer value = map.get(c);
                    value++;
                    map.put(c,value);
            }else {
                //key不存在
                map.put(c,1);
            }
        }
        //遍历map集合，输出结果
        for (Character key:map.keySet()){
            Integer vaule = map.get(key);
            System.out.println(key+vaule);
            

        }

    }
}
