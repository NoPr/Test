package Demo11Thread;

public class person {
    private  String name;

    public void run(){
        //定义循环，执行20次
        for (int i = 0; i < 20; i++) {
            System.out.println(name+i);
        }
    }

    public person(String name) {
        this.name = name;
    }

    public person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
