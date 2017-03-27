package java1702.javase.exercise;

/**
 * Created by AnLu on
 * 2017/3/21 14:44.
 * JavaSE_20171
 */
// 9*9 乘法表
public class E16 {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i >= j) {
                    System.out.print("" + i + "*" + j + "=" + (i * j) + "\t");
                }
            }
            System.out.println();
        }
    }
}