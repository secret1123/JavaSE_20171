package java1702.javase.exercise;

import java.util.Scanner;

/**
 * Created by an lu on 2017/3/8.
 */
public class E5 {
    public static void main(String[] args) {


        // int grade = 88;
        // System.out.println((grade >= 90) ? 'A' : ((grade <= 89 && grade > 60) ? 'B' : 'C'));


        Scanner scanner = new Scanner(System.in);
        System.out.println("input");

        int grade = scanner.nextInt();

        String S = (grade >= 90) ? "A" : ((grade <= 89 && grade >= 60) ? "B" : "C");
        System.out.println(S);
    }
}
