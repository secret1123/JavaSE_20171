package java1702.javase.collection;

import java.util.Arrays;

/**
 * Created by AnLu on
 * 2017/3/28 10:56.
 * JavaSE_20171
 */
public class StringTest {
    public static void main(String[] args) {
        char [] chars = {'H','e','l','l','o'};
        String str = new String(chars);
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        for (char c : str.toCharArray()) {
            System.out.print(c);
        }
        System.out.println();
        String s = "repositories";
        System.out.println(s.charAt(s.length()-1));
        String s1 = "to";
        System.out.println(s1.concat("get").concat("her").concat("!!!"));
        System.out.println(s.contains("o"));
        System.out.println(s.endsWith("e"));
        System.out.println(s1.equals("to"));
        String s2 = "TWO";
        System.out.println(s2.equalsIgnoreCase("to")==s1.equalsIgnoreCase("too"));
        System.out.println(s.indexOf('t'));
        String s3 = "";
        System.out.println(s3.isEmpty());
        System.out.println(s.length());
        System.out.println(str.matches("\\w+"));
        System.out.println(str.replace('l','a'));
        System.out.println(str.replaceAll("ll","x"));
        System.out.println(str.replaceFirst("l","y"));
        String s4 = "boo:and:too";
        System.out.println(Arrays.toString(s4.split("o", -1)));
        System.out.println(s4.startsWith("t",8));
        System.out.println(s4.substring(0,4));
        System.out.println(Arrays.toString(s4.toCharArray()));
        String s5 = "   hello,java  ";
        System.out.println(s5.trim());
        System.out.println(String.valueOf("hi"));
    }
}
