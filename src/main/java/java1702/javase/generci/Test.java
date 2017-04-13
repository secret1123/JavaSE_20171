package java1702.javase.generci;

import java.util.Date;

/**
 * Created by AnLu on
 * 2017/4/13 08:55.
 * JavaSE_20171
 */
public class Test<T> {

    public static void main(String[] args) {

        Test test = new Test();
        System.out.println(test.concat(true,false));
        System.out.println(test.concat(1.2,3.4));
        System.out.println(test.concat("one","three"));
        System.out.println(test.concat(new Date(),new Date()));
    }

    private String concat(T x,T y) {
        return String.valueOf(x).concat(String.valueOf(y));
    }
}
