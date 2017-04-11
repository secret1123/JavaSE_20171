package java1702.javase.collection;

import java.util.TreeSet;

/**
 * Created by AnLu on
 * 2017/4/11 19:58.
 * JavaSE_20171
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet<>();
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
