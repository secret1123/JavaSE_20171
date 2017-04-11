package java1702.javase.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AnLu on
 * 2017/4/11 09:01.
 * JavaSE_20171
 */
public class ArrayListTest {

    public static void main(String[] args) {
        List<String>  s1 = new ArrayList<>();
        s1.add("a");
        s1.add("b");
        List<String> s2 = new ArrayList<>();
        s2.add("a");
        s2.add("b");
        s2.add("c");

        System.out.println(s1.equals(s2));

        List<String> s3 = s2.subList(1,3);
        System.out.println(s3);//b c

        System.out.println(s3.containsAll(s2));

        s2.removeAll(s3);
        System.out.println(s2);//a

        s1.retainAll(s2);
        System.out.println(s1);
    }
}
