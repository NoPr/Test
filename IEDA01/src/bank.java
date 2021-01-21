/**
 *
 *
 * 静态方法调用向上转型向下转型
 */
public class bank {
    public static void main(String[] args) {
        Son son = new Son();
        son.one();
        Son.mehtod();

        Father father =new Son();
        father.one();
        Father.mehtod();

        Son son1 = (Son) father;//向下转型
        Son.mehtod();
        son1.two();





    }

}

class Father{
    public static void mehtod(){
        System.out.println("this is father static");
    }
    public void one(){
        System.out.println("asdasd");
    }
}

class Son extends Father{
    public static void mehtod(){
        System.out.println("this is son static");
    }
    @Override
    public void one(){
        System.out.println("32313");
    }
    public void two(){
        System.out.println("asdasdasdasdas");
    }
}