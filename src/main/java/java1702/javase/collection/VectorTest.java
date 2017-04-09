package java1702.javase.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

/**
 * Created by AnLu on
 * 2017/3/29 14:02.
 * JavaSE_20171
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("hi");
        vector.add("hello");
        vector.add("test");
        vector.add("hi");

        System.out.println(vector.get(0));
        System.out.println(vector.size());

        for (String s : vector) {
            System.out.println(s);
        }

        System.out.println(vector.size());
        System.out.println(vector.capacity());

//        Set<String> strings = new HashSet<>();
//        strings.add("a");
//        strings.add("aa");
//        strings.add("aaa");
//        strings.add("aaa");
//        System.out.println(strings.size());

        Vector<Integer> integers = new Vector<>(1000,100);
        integers.add(1);
        integers.add(10);
        integers.add(100);
        integers.add(1000);
        System.out.println(integers.size());
        System.out.println(integers.capacity());
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        System.out.println(integers.set(3,30));
        integers.setElementAt(20,2);
        System.out.println("->"+integers);
        integers.remove(0);
        System.out.println(integers);
//        integers.removeAllElements();
//        System.out.println(integers);
        integers.clear();
        integers.add(3);
        for (int i = 0; i < 3333; i++) {
            integers.add(1);
        }
        System.out.println(integers.size());
        System.out.println(integers.capacity());
    }
}
//class VectorDome extends Vector {
//    public static void main(String[] args) {
//        VectorDome vectorDome = new VectorDome();
//        int i = vectorDome.elementData.length;
//        System.out.println(Arrays.toString(vectorDome.elementData));
//    }
//}