package java1702.javase.exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by AnLu on
 * 2017/3/29 16:59.
 * JavaSE_20171
 */
// 打印出杨辉三角形(要求打印出10行如下图)
public class E33 {
    public static void main(String[] args) {
        int[] l1 = {1};
        int[] l2 = {1, 1};
        int[] l3 = {1, 2, 1};
        int[] l4 = {1, 3, 3, 1};
        int[] l5 = new int[5];
        for (int i = 0; i < l5.length; i++) {
            if (i == 0 || i == l5.length - 1) {
                l5[i] = 1;
            } else {
                l5[i] = l4[i - 1] + l4[i];
            }
        }
        System.out.println(Arrays.toString(l5));

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("请输入需要打印的行数：");




    }
}
