package Demo06Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01personTest {
    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show02() {
        //key:person
        //   person类必须必重写hashcode和equals方法，以保证key唯一
        HashMap<person,String> hashMap = new HashMap<>();

        hashMap.put(new person("女王",18),"英国");
        hashMap.put(new person("秦始皇",18),"秦国");
        hashMap.put(new person("酋长",18),"刚果");
        hashMap.put(new person("女王",18),"法国");
        //使用entrySet和增强FOR遍历吗，
        Set<Map.Entry<person, String>> set = hashMap.entrySet();
        for (Map.Entry<person, String> entry : set) {
            person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"-->"+value);
        }
    }

    /*
        HashMap存储自定义类型键值
        key：
        S
     */
    private static void show01() {
        HashMap<String,person> map = new HashMap<>();

        map.put("beijing",new person("张三",18));
        map.put("sahnghai",new person("李四",19));
        map.put("guangzhou",new person("王五",20));
        map.put("beijing",new person("宋三",18));
        Set<String> set = map.keySet();
        for (String key : set) {
            person p = map.get(key);
            System.out.println(key+"-->"+p);

        }

    }
}
