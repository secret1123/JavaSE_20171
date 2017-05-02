package java1702.javase.collection;

import java.util.Arrays;

/**
 * Created by AnLu on
 * 2017/5/2 10:04.
 * JavaSE_20171
 */
public class ConvertTest {
    public static void main(String[] args) {
        String s = "1,2,3";
        String[] strings = s.split(",");

//        int[] ints = Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(strings));
//        System.out.println(Arrays.toString(ints));
    }
}
