package java1702.javase.oop;

/**
 * Created by AnLu on
 * 2017/3/27 13:57.
 * JavaSE_20171
 */
public class CastTest {
    public static void main(String[] args) {
        //整型转为字符串
        int x = 1;
        int y = 2;
        //a
        Integer integer = new Integer(x);
        String s1 = integer.toString();
        System.out.println(s1);
        //b
        String s2 = String.valueOf(x);
        System.out.println(s2);
        //c
        String s3 = "" + x + y;
        System.out.println(s3);
        //d
        String s4 = Integer.toString(x);
        System.out.println(s4);


        //字符串转整型
        String string = "123";
        //a
        int y1 = Integer.valueOf(string);
        System.out.println(y1);
        //b
        int y2 = Integer.parseInt(string);
        System.out.println(y2);
        //c
        int y3 = new Integer(string);
        System.out.println(y3);
    }
}
