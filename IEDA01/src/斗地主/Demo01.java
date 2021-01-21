package 斗地主;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01 {
    public static void main(String[] args) {
        //定义一个存储64张牌的集合，泛型使用字符串
        ArrayList<String> poker = new ArrayList<>();

        //定义两个数组，一个数组存储花色，一个存储序号

        String[] colors = {"♠","♥","♦","♣"};
        String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        //先把大王小王添加到poker中
        poker.add("大王");
        poker.add("小王");

        //循环嵌套遍历两个数组，组装50张牌

       for (String number:numbers){
           for (String color : colors) {
//               System.out.println(color+number);
               //把组装好的牌存储 到poker中
               poker.add(color+number);
           }
       }
        //洗牌,使用集合工具类Collection中的方法，
        // static void shuffle(list<?>list),使用默认随机源对指定列表进行置换
        Collections.shuffle(poker);

        //发牌
        //定义四个集合，存储玩家的牌和底牌
        ArrayList<String> play01 = new ArrayList<>();
        ArrayList<String> play02 = new ArrayList<>();
        ArrayList<String> play03 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        //遍历poker集合，获取每一张牌，
        //使用poker集合的索引%3给每个玩家发牌
        //剩余3张牌给底牌
            //先判断底牌（i>=51）,否则牌就发完了
        for (int i =0;i<poker.size();i++){
            //获取每一张牌
            String s = poker.get(i);

            //轮流发牌
            if(i>=51) {
                dipai.add(s);//先留下三张底牌
            }else if (i%3==0){
                play01.add(s);

            }else if (i%3==1){
                play02.add(s);

            }else if (i%3==2){
                play03.add(s);

            }
        }
        System.out.println("01"+play01);
        System.out.println("02"+play02);
        System.out.println("03"+play03);
        System.out.println("d"+dipai);
    }
}
