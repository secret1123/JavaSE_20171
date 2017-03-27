package java1702.javase.basic;

/**
 * Created by anlu on 2017/3/7.
 */
public class CharTest {
    public static void main(String[] args) {
        char c1 = 12345;//ascii 表 对应的字符
        System.out.println(c1); //可以做强制转换 （（int）c1)-转换成整型

        char c2  = '中';//单引号里面只能是一个字符，任意语言的单个字符 unicode表
        System.out.println(c2);//也可以做强制转换 （（int）c2)

        char c3 = '\123';//三位八进制字符 \000-\377
        System.out.println(c3);

        char c4 = '\u9fbb';//四位十六进制字符(汉字）0-9 a-f 【第一个汉字4E00，最后一个汉字9FBB】
        System.out.println(c4);

        char c5 ='\t';// \ 反斜线是转义字符
        System.out.println(c5);// println后面的ln就是line行的意思 每一行，独占一行，print就是行内

        // \t tab 制表符，空格   \b  backspace  \n newline 新的一行  \' 单引号本身 \" 双引号本身 \\反斜线本身


    }
}
