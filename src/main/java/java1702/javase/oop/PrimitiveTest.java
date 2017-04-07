package java1702.javase.oop;

/**
 * Created by AnLu on
 * 2017/3/24 11:27.
 * JavaSE_20171
 */
public class PrimitiveTest {

//    private static void method(int i) {
//        System.out.println("b:"+i);
//        i++;
//        System.out.println("c:"+i);
//    }
//
//    public static void main(String[] args) {
//        int i = 0;
//        System.out.println("a:"+i);
//        method(i);
//        System.out.println("d:"+i);
//    }
//
//    private static void method(String s) {
//        System.out.println("b:"+s);
//        s="hi";
//        System.out.println("c:"+s);
//    }
//
//    public static void main(String[] args) {
//        String s = "hello";
//        System.out.println("a:"+s);
//        method(s);
//        System.out.println("d:"+s);
//    }

    public static void method(boolean b) {
        System.out.println("2:"+b);
        b = true;
        System.out.println("3:"+b);
    }

    public static void main(String[] args) {
        boolean b =false;
        System.out.println("1:"+b);
        method(b);
        System.out.println("4:"+b);
    }
}
