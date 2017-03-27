package java1702.javase.oop;

/**
 * Created by AnLu on
 * 2017/3/24 11:27.
 * JavaSE_20171
 */
public class PrimitiveTest {

       private String s;
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
    private static void method(PrimitiveTest primitiveTest) {
        System.out.println("b:"+primitiveTest.s);
        primitiveTest.s="hi";
        System.out.println("c:"+primitiveTest.s);
    }

    public static void main(String[] args) {
        PrimitiveTest primitiveTest=new PrimitiveTest();
        primitiveTest.s = "hello";
        System.out.println("a:"+primitiveTest.s);
        method(primitiveTest);
        System.out.println("d:"+primitiveTest.s);
    }
}
