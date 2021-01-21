package Demo06Map;
//遍历方式一
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo01Mapbianli {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
        //通过键查找值
        hm.put("霞","ADC");
        hm.put("洛","辅助");
        hm.put("卡萨丁","中单");
        hm.put("刀妹","上单");
        hm.put("皇子","打野");
        //找出所有的键
        Set<String> keys = hm.keySet();
        //遍历所有的键
        for (String key:keys
             ) {
            String value = hm.get(key);
            System.out.println(keys+"的对应位置是"+value);
        }
        System.out.println("=============");
        Iterator<String> it  = keys.iterator();
        while (it.hasNext()){
            String i = it.next();
            String value = hm.get(i);
            System.out.println(keys+"的对应位置是"+i);
        }
    }
}
