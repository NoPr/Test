package Demo10Exception;

import java.util.Scanner;

/*
    分析：
    1.使用数组，保存已经注册过的用户名
    2.使用scanner获取用户输入的注册用户名
    3.定义一个方法，对用户输入的注册用户名进行判断，
        遍历存储已经注册过用户名的数组。获取每一个用户名。
        使用获取到的用户名和用户数输入端用户名进行比较
        true：已经存在，抛出异常
        false;继续遍历比较
        如果循环结束了还没有找到重复的用户名，提示用户“successful”
 */
public class Demo03DIYTest {
    static String[] usernames={"张三","李四","王五"};

    public static void main(String[] args) //throws Demo03DIYException
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要注册的用户名");
        String username =sc.next();

         try {
             checkUsernames(username);
         } catch (Demo03DIYException e) {
             e.printStackTrace();
             return;//结束方法
         }
     }

    //定义一个方法，对用户输入的用户进行判断
    public static void  checkUsernames(String username) throws Demo03DIYException {
        //遍历获取已经注册过用户数组，获取每一个用户名
        for (String name:usernames
             ) {
            //使用获取到的用户名和输入得进行比较
            if (name.equals(usernames)){
                throw new Demo03DIYException("该用户已经被注册");
            }
        }
        System.out.println("successful");
    }
}
