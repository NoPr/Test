package Demo03Generic;

public class Demo03Test {
    public static void main(String[] args) {
        //不写泛型默认为Object类型
        Demo03GenericClass cl=new Demo03GenericClass();
        cl.setName("只能是字符串");
        Object obj = cl.getName();

        //输出类型随意
        Demo03GenericClass<String> cl1= new Demo03GenericClass<String>();
        Demo03GenericClass<Integer> cl2= new Demo03GenericClass<Integer>();



    }
}
