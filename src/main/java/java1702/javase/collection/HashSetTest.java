package java1702.javase.collection;

import java.util.HashSet;

/**
 * Created by AnLu on
 * 2017/4/11 19:55.
 * JavaSE_20171
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("hello");
        strings.add("hi");
        strings.add("test");
        strings.add("Test");

        System.out.println(strings.size());
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
