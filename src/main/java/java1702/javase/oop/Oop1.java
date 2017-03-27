package java1702.javase.oop;

import java.util.Scanner;

/**
 * Created by anlu on 2017/3/15.
 */
// 闰年 year 除以4余数为0或者除以100余数不为0的
public class Oop1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input year : ");
        int year = scanner.nextInt();
        Oop1 oop1 = new Oop1();
        oop1.checkLeapYear(year);
    }

    public void checkLeapYear(int year) {


        if ((year % 400 == 0)||((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + "is leap year");
        } else {
            System.out.println(year + "is not leap year");
        }
    }
}
