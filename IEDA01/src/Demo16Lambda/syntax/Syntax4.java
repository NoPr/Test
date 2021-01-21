package Demo16Lambda.syntax;

import Demo16Lambda.data.Person;

/**
 *
 *
 */
public class Syntax4 {
    public static void main(String[] args) {

        PersonCreater personCreater =()->new Person();
        //构造方法的引用

        PersonCreater creater= Person::new;
        Person a=   creater.getPerson();

        PersonCreater2 creater2 =Person::new;
        Person b = creater2.getPerson("haha",20);
    }
}

interface PersonCreater{
    Person getPerson();
}
interface PersonCreater2{
    Person getPerson(String name,int age);
}
