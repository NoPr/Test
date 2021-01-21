package 斗地主;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Demo02 {
    public static void main(String[] args) {
        //组装54张扑克牌
        HashMap<Integer,String> pokerMap = new HashMap<>();
        //创建花色与数字集合

        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();

        //存储花色与数字
        Collections.addAll(colors,"♦","♣","♥","♠");//.addAll往集合中添加一些元素
        Collections.addAll(numbers,"A","2","3","4","5","6","7","8","9","10","J","Q","K");
        //设置存储变量编号

        int count =1;
        pokerMap.put(count++,"大王");
        pokerMap.put(count++,"小王");
        //创建牌，存储到map集合中
        for (String number:numbers){
            for (String color:colors
                 ) {
                String card = color+number;
                pokerMap.put(count++,card);
            }
        }
        //将54张牌顺序打乱
        //取出编号 集合
        Set<Integer> numberSet = pokerMap.keySet();
        //因为要将编号打乱，所以应该 西安转换到list集合中
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.addAll(numberList);
        //打乱顺序
        Collections.shuffle(numberList);
        // 3 完成三个玩家交替摸牌，每人17张牌，后三张留作底牌        
        //  3.1 发牌的编号        
        //  创建三个玩家编号集合 和一个 底牌编号集
        ArrayList<Integer>nop1 = new ArrayList<Integer>();
        ArrayList<Integer>nop2 = new ArrayList<Integer>();
        ArrayList<Integer>nop3 = new ArrayList<Integer>();
        ArrayList<Integer>dipaiNo = new ArrayList<Integer>();

        //发牌的编号
        for (int i = 0; i < numberList.size(); i++) {
            //获取该编号
            Integer no = numberList.get(i);
            //发牌，
            //留出底牌
            if(i>=51){
                dipaiNo.add(no);
            }else {
                if (i%3==0){
                    nop1.add(no);
                }else if (i%3==1){
                    nop2.add(no);
                }else{
                    nop3.add(no);
                }
            }
        }
        //查看三人手中各自的牌（按照牌的大小排序），底牌
        //对手中的牌进行排序

        Collections.sort(nop1);
        Collections.sort(nop2);
        Collections.sort(nop3);
        Collections.sort(dipaiNo);

        //进行牌面的转换
        //创建三个玩家牌面合集，以及底牌牌面集合
        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();
        ArrayList<String> dipai = new ArrayList<String>();

        //转换
        for (Integer i:nop1){
            //根据编号找到牌面pokermap
            String card = pokerMap.get(i);
            //添加到相对应的牌面集合中
            player1.add(card);
        }
        for (Integer i:nop2){
            //根据编号找到牌面pokermap
            String card = pokerMap.get(i);
            //添加到相对应的牌面集合中
            player2.add(card);
        }
        for (Integer i:nop3){
            //根据编号找到牌面pokermap
            String card = pokerMap.get(i);
            //添加到相对应的牌面集合中
            player3.add(card);
        }
        for (Integer i:dipaiNo){
            //根据编号找到牌面pokermap
            String card = pokerMap.get(i);
            //添加到相对应的牌面集合中
            dipai.add(card);
        }
        System.out.println("1"+player1);
        System.out.println("2"+player2);
        System.out.println("3"+player3);
        System.out.println("4"+dipai);



    }
}
