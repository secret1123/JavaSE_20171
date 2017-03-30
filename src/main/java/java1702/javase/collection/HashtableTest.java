package java1702.javase.collection;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by AnLu on
 * 2017/3/29 15:47.
 * JavaSE_20171
 */
// put get size keySet value entrySet remove
    //set 集合，设置
public class HashtableTest {
    public static void main(String[] args) {
        Hashtable<Integer,String>hashtable = new Hashtable<>();
        hashtable.put(1,"hi");
        hashtable.put(2,"hello");
        hashtable.put(3,"hello");
        hashtable.put(3,"test");

        System.out.println("size:"+hashtable.size());
        System.out.println(hashtable.get(3));
        System.out.println(hashtable.contains("hi"));
//        hashtable.remove(1);
        System.out.println(hashtable.size());

        for (Integer integer : hashtable.keySet()) {
            System.out.println(integer+"->"+hashtable.get(integer));
        }

        for (String s : hashtable.values()) {
            System.out.println(s);
        }

        for (Map.Entry<Integer, String> integerStringEntry : hashtable.entrySet()) {
            System.out.println(integerStringEntry.getKey()+"->"+integerStringEntry.getValue());
        }
    }
}
