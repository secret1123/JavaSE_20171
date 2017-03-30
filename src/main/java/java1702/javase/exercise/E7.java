package java1702.javase.exercise;

import java.util.Scanner;

/**
 * Created by AnLu on
 * 2017/3/29 16:58.
 * JavaSE_20171
 */
//输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
public class E7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string:");
        String string = scanner.nextLine();

        char[] chars = string.toCharArray();
        int english = 0;
        int space = 0;
        int digit = 0;
        int special = 0;

        for (char aChar : chars) {
            if ((aChar >= 'A' && aChar <= 'Z') || (aChar >='a'&&aChar<='z')){
                english++;
            }else if (aChar == ' '){
                space++;
            }else if (aChar>='0'&&aChar<='9'){
                digit++;
            }else {
                special++;
            }
        }
        System.out.println(english);
        System.out.println(space);
        System.out.println(digit);
        System.out.println(special);
    }
}
