package java1702.javase.basic;

import java.util.Scanner;

/**
 * Created by anlu on 2017/3/10.
 */
public class SwitchCaseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input A B C D :");
        String s = scanner.nextLine();

        switch (s) {
            case "A":
                System.out.println("90-100");
                break;

            case "B":
                System.out.println("80-90");
                break;

            case "C":
                System.out.println("60-80");
                break;

            case "D":
                System.out.println("0-60");
                break;

            default:
                System.out.println("null");
                break;
        }
            int i = 90;
            if (i >= 90) {
                System.out.println("A");
            }else if (i <= 89 && i>= 80) {
                System.out.println("B");
            }else if (i >= 60 && i <= 80) {
                System.out.println("C");
            } else {
                System.out.println("D");
            }
        }
    }