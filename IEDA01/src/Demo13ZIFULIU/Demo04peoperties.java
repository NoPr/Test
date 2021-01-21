package Demo13ZIFULIU;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*  java.util.Properties 继承于 Hashtable ，来表示一个持久的属性集。
        它使用键值结构存储数据，每个键及其 对应值都是一个字符串。该类也被许多Java类使用，比如获取系统属性时，
    System.getProperties 方法就是返回 一个 Properties 对象。

    Properties集合是唯一和IO流相结合的集合，
        可以使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘存储。
        可以使用Properties集合中的；load方法把硬盘中保存的文件（键值对），读取到集合中使用，
     属性列表中的每个键及其对应的值都是一个字符串
         Properties集合是一个双列集合，key和value默认的是字符串，
    构造方法
        public Properties() :创建一个空的属性列表。
        基本的存储方法
        public Object setProperty(String key, String value) ： 保存一对属性。
        public String getProperty(String key) ：使用此属性列表中指定的键搜索属性值。
        public Set<String> stringPropertyNames() ：所有键的名称的集合。
 */
public class Demo04peoperties {
    public static void main(String[] args) throws IOException {
        show01();
        show02();
    }

    private static void show02() throws IOException {
        /*
              可以使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘存储
         */
        Properties prop = new Properties();
        prop.setProperty("赵丽颖","168");
        prop.setProperty("迪丽热巴","178");
        prop.setProperty("古力娜扎","188");
//字符流可以写中文
//        FileWriter fw = new FileWriter("D:\\IDEAProject\\IEDA01\\src\\Demo13ZIFULIU\\prop.txt");
//        prop.store(fw,"save data");
//字节流不能写中文
        prop.store(new FileWriter("D:\\IDEAProject\\IEDA01\\src\\Demo13ZIFULIU\\prop2.txt"),"" );

//        w.close();
    }

    /*  使用Properties集合存储数据，遍历取出Properties集合中的数据。
        Properties集合是一个双列集合，key和value默认的是字符串
    
    
     */
    private static void show01() {
        Properties prop = new Properties();
        prop.setProperty("赵丽颖","168");
        prop.setProperty("迪丽热巴","178");
        prop.setProperty("古力娜扎","188");

        Set<String> set =prop.stringPropertyNames();

        for (String key:set
             ) {
            String value = prop.getProperty(key);
            System.out.println(key+"="+value);
        }
    }
}
