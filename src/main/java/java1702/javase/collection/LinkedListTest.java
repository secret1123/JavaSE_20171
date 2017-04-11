package java1702.javase.collection;

import java.util.LinkedList;

/**
 * Created by AnLu on
 * 2017/4/11 09:52.
 * JavaSE_20171
 */
public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList<String> strings = new LinkedList<>();
        strings.add("monday");
        strings.add("tuesday");
        strings.add("wednesday");

        System.out.println(strings.size());
        System.out.println(strings.get(2));

        for (String s : strings) {
            System.out.println(s);
        }

        System.out.println(strings.getFirst());
        System.out.println(strings.getLast());
    }
}
