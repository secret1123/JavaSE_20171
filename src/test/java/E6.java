import sun.security.util.Length;

import java.util.Scanner;

/**
 * Created by AnLu on
 * 2017/4/1 13:44.
 * JavaSE_20171
 */
//1. 从键盘上输入 4 行 4 列的一个实数矩阵到一个二维数组中,然后求出主对角线（从左上角到右下角）
//   上元素之和以及副对角线上元素之乘积。
public class E6 {

    public static void main(String[] args) {

        int[][] ints = new int[4][4];
        System.out.println("请输入16个数字：");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int x = scanner.nextInt();
                ints[i][j]=x;
            }
        }
        System.out.println();
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
//                ints[i][j] = (int) (Math.random() * 4);

                System.out.print(ints[i][j] + "\t");
            }
            System.out.println();
        }
        int n = ints[0][0] * ints[1][1] * ints[2][2] * ints[3][3];
        int m = ints[3][0] * ints[2][1] * ints[1][2] * ints[0][3];
        System.out.println("主对角线乘积：" + n);
        System.out.println("副对角线乘积：" + m);
    }
}