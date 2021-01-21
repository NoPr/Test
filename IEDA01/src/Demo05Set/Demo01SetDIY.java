package Demo05Set;

import java.util.Objects;

/*
    使用hashset存储自定义类型元素

    给HashSet中存放自定义类型元素时，需要重写对象中的hashCode和equals方法，
    建立自己的比较方式，才能保 证HashSet集合中的对象唯一
 */
//要求：同名同年的人，视为同一个人，只能存储一次
public class Demo01SetDIY {
    private String name;
    private  int age;

    @Override
    public String toString() {
        return "Demo01SetDIY{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Demo01SetDIY() {
    }

    public Demo01SetDIY(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demo01SetDIY that = (Demo01SetDIY) o;
        return age == that.age &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
