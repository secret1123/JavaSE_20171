package java1702.javase.collection;

import java.util.Arrays;

/**
 * Created by AnLu on
 * 2017/3/31 09:58.
 * JavaSE_20171
 */
public class StringCopyTest {
    public static void main(String[] args) {
        int[] srcArray = {1,2,3,4,5,6};
        int[] destArray = new int[10];

        System.out.println(Arrays.toString(destArray));
        System.arraycopy(srcArray,1,destArray,6,4);
        System.out.println(Arrays.toString(destArray));
    }
}
