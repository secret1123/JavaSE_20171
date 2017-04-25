package java1702.javase.io;

/**
 * Created by AnLu on
 * 2017/4/21 11:04.
 * JavaSE_20171
 */
public class ExtensionNameTest {
//    public static void main(String[] args) {
//        String s = "123.gif";
//        System.out.println(s.substring(s.lastIndexOf('.')));

        public static long fibonacii(int n){
            if (n == 1 || n == 2) {
                return 1;
            }
            return fibonacii(n-2)+fibonacii(n-1);
        }
        public static void main(String[] args) {
            for (int i = 0; i < 5; i++) {
                System.out.println(fibonacii(i));
            }
            System.out.println(fibonacii(6));
        }
    }
