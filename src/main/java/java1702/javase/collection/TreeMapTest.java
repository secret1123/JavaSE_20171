package java1702.javase.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by AnLu on
 * 2017/4/12 11:19.
 * JavaSE_20171
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<>();
        map.put("a",1);
        map.put("bcd",-1);
        map.put("bcde",100);
        map.put("",null);
        System.out.println(map.size());
        System.out.println(map.get("e"));

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(null,null);
        /*
        K-V

        Hashtable
        HashMap
        LinkedHashMap
        TreeMap
         */
    }
}
