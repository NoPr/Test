package Demo16Lambda.data;

public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("person类的无参构造方法执行了");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("person类的有参构造方法执行了");
    }
}
