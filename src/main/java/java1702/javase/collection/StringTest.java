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
        System.out.println("1->: "+str.toUpperCase());//转成大写
        System.out.println("2->: "+str.toLowerCase());//转成小写
        System.out.println("3->: "+Arrays.toString(str.toCharArray()));//把字符串转成字符数组

        for (char c : str.toCharArray()) {
            System.out.print(c);//遍历输出
        }
        System.out.println();
        String s = "repositories";
        System.out.println("6->: "+s.charAt(s.length()-1));//输出最后一个字符
        String s1 = "to";
        System.out.println("7->: "+s1.concat("get").concat("her").concat("!!!"));//字符串拼接
        System.out.println("8->: "+s.contains("o"));//是否包含某个字符
        System.out.println("9->: "+s.endsWith("e"));//是否是最后一个字符
        System.out.println("10->: "+s1.equals("to"));//是否和指定字符串相等,区分大小写
        String s2 = "TWO";
        /*
          将此 String 与另一个 String 比较，不考虑大小写。如果两个字符串的长度相同，并且其中的相应字符都相等（忽略大小写），则认为这两个字符串是相等的。
         在忽略大小写的情况下，如果下列至少一项为 true，则认为 c1 和 c2 这两个字符相同。
         */
//        System.out.println("11->: "+(s2.equalsIgnoreCase("to")==s1.equalsIgnoreCase("too")));
        System.out.println("12->: "+s.indexOf('t'));// 返回指定字符在此字符串中第一次出现处的索引。
        String s3 = "";
        System.out.println("13->: "+s3.isEmpty());//是否为空字符串
        System.out.println("14->: "+s.length());//字符串长度
        /*
         * \w 任意一个字母或数字或下划线，也就是 A~Z,a~z,0~9,_ 中任意一个
         * + 表达式至少出现1次，相当于 {1,}，比如："a+b"可以匹配 "ab","aab","aaab"...
         */
//        System.out.println("15->: "+str.matches("\\w+"));//告知此字符串是否匹配给定的正则表达式
        System.out.println("16->: "+str.replace('l','a'));//  返回一个新的字符串，它是通过用newChar替换此字符串中出现的所有oldChar
        System.out.println("17->: "+str.replaceAll("ll","x"));// 使用给定的替换元素替换此字符串所有匹配给定的正则表达式的子字符串
        System.out.println("18->: "+str.replaceFirst("l","y"));// 使用给定的replacement替换此字符串匹配给定的正则表达式的第一个子字符串。
        String s4 = "boo:and:too";
        System.out.println("19->: "+Arrays.toString(s4.split("o", -1)));//根据匹配给定的正则表达式来拆分此字符串
        System.out.println("20->: "+s4.startsWith("t",8));//测试此字符串从指定索引开始的子字符串是否以指定前缀开始。测试此字符串从指定索引开始的子字符串是否以指定前缀开始。
        System.out.println("21->: "+s4.substring(0,4));//返回一个新字符串，它是此字符串的一个子字符串。
        System.out.println("22->: "+Arrays.toString(s4.toCharArray()));//把字符串转成字符数组
        String s5 = "     hi     ";
        System.out.println("23->: "+s5.trim());//去掉前后空格
        System.out.println(String.valueOf(new char[]{'t','e','s','t'}));
        StringBuffer s6 = new StringBuffer("hello");
        System.out.println(s6.reverse());//字符串缓冲区方法  倒转字符串
    }
}
