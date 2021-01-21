package Demo16Lambda;

public class TestLanbda {
    //3.实现接口 ,静态内部类
    static class Like2 implements ilike{

        @Override
        public void lambda() {
            System.out.println("i like lambda2");
        }
    }
    public static void main(String[] args) {

        ilike ilike = new Like();
        ilike.lambda();

        ilike= new Like2();
        ilike.lambda();

        //4.局部内部类
        class Like3 implements ilike{

            @Override
            public void lambda() {
                System.out.println("i like lambda3");
            }
        }

        ilike=new Like3();
        ilike.lambda();

        //5.匿名内部类,没有类的名称，借助接口或者父类
        ilike=new ilike() {
            @Override
            public void lambda() {
                System.out.println("i like lambda4");
            }
        };
        ilike.lambda();

        //6.lambda简化
        ilike =()->{
            System.out.println("i like lambda5");
        };
        ilike.lambda();

    }

}


//1.定义一个函数式接口
@FunctionalInterface
interface ilike{
    void lambda();
}

//2.实现接口
class Like implements ilike{

    @Override
    public void lambda() {
        System.out.println("i like lambda");
    }
}