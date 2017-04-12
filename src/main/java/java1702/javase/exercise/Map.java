package java1702.javase.exercise;

import java.util.HashMap;

/**
 * Created by AnLu on
 * 2017/4/12 15:50.
 * JavaSE_20171
 */
public class Map {

    public static void main(String[] args) {

        HashMap<String, Double> hashMap = new HashMap<>();
        hashMap.put("Tom", 1500d);
        hashMap.put("Jerry", 900d);
        hashMap.put("Jack", 1000d);

        for (String s : hashMap.keySet()) {
            System.out.println(s);
        }

        System.out.println(hashMap.entrySet());
        hashMap.remove("Tom");
        System.out.println(hashMap);

        hashMap.put("Jack", 1500d);
        System.out.println(hashMap.get("Jack"));

        for (String s : hashMap.keySet()) {
            if (hashMap.get(s) < 1000d) {
                hashMap.put(s, hashMap.get(s) * 1.2);
            }
        }
        System.out.println(hashMap);
    }
}
