package java1702.javase.exercise;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by AnLu on
 * 2017/3/21 16:42.
 * JavaSE_20171
 */
public class Ee1 {

    private static int x;
    private static int counter;
    private static String result;

    public static void main(String[] args) {
        Random random = new Random();
        x = random.nextInt();
        System.out.println(x);
        guess();
    }

        private static void guess() {
//            System.out.println("请输入一个数： ");
//            Scanner scanner = new Scanner(System.in);
//            int y = scanner.nextInt();

        int y = ai(result);

            if (y >x) {
                System.out.println("大了");
                counter++;
                result = "大了";
                guess();
            }else if (x > y) {
                System.out.println("小了");
                counter++;
                result = "小了";
                guess();
            }else {
                System.out.println("猜对了");
                counter++;
                System.out.println(counter);
            }
        }

        private static int ai(String result) {
        return 0;
        }
    }
