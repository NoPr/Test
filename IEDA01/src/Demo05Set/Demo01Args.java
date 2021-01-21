package Demo05Set;
/*
    可变参数是jdk1.5之后出现的新特性
    适用前提：
        当方法的参数列表数据类型已经确定，但是参数的个数不确定，就可以使用可变参数。
       定义方法时使用
    修饰符 返回值类型 方法名(参数类型... 形参名){  }
    等价于
    修饰符 返回值类型 方法名(参数类型[] 形参名){  }
    只是后面这种定义，在调用时必须传递数组，而前者可以直接传递数据即可

    可变参数底层就是一个数组，根据传递参数的个数不同，会创建不同长度的数组，来存储这些参数
    传递的参数个数，可以是0（不传），1，2.....多个。
 */
public class Demo01Args {
    public static void main(String[] args) {
        int i =add(10,30,30);
        System.out.println(i);
    }
    /*
        定义0-n个整数和的方法，
        已知：计算整数的和，数据类型确定，但是参数个数不确定，就可以使用可变参数
     */
    //定义一个方法，定义两个int的和
     public  static int add(int a,int b){
        return a+b;
     }
     public static int add(int...arr){
//         System.out.println(arr);
//         return 0;//不加返回值会报错
         int sum = 0;
         for (int i:arr
              ) {
                sum+=i;
         }
         return sum;
     }
     /*
        可变参数注意事项：
        1.一个方法的参数列表，只能有一个可变参数
        2.如果方法的参数有多个，那么可变参数必须写在参数列表的末尾
        public static void add(int a,String b,double ...arr)
        可变参数终极写法
        public static void add(object...obj)
      */
}
