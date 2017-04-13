package java1702.javase.generci;

import java.util.Vector;

/**
 * Created by AnLu on
 * 2017/4/13 11:40.
 * JavaSE_20171
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("test");
        vector.add("123");
        vector.add("true");
        vector.add("456");

        String s = vector.get(2);
        System.out.println(s);
    }
}
