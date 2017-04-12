package java1702.javase.collection;

import java.util.HashMap;

/**
 * Created by AnLu on
 * 2017/4/12 09:00.
 * JavaSE_20171
 */
public class HashMapTest {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(2,"two");
        map.put(4,"four");
        map.put(6,"six");

        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(1,"one");
        map1.put(3,"three");
        map1.put(5,"five");

        map.putAll(map1);
        System.out.println(map);

        System.out.println(map.get(4));
        System.out.println(map.entrySet());

        for (Integer integer : map.keySet()) {
            System.out.println(integer+"-"+map.get(integer));
        }
    }
}
