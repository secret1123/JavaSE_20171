package java1702.javase.collection;

import java.util.LinkedHashSet;

/**
 * Created by AnLu on
 * 2017/4/12 15:46.
 * JavaSE_20171
 */
public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.add("d");
        strings.add("c");
        strings.add("b");
        strings.add("a");

        System.out.println(strings.size());
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
