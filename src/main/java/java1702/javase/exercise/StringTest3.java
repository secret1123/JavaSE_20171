package java1702.javase.exercise;

import java.util.Arrays;

/**
 * Created by AnLu on
 * 2017/4/19 19:04.
 * JavaSE_20171
 */
// 拆分字符串，字符串中含有逗号和数字，对数字排序并输出
//例如：String s0=”123,45,25,85”;
//        输出：25 45 85 123
public class StringTest3 {
    public static void main(String[] args) {

        String s = "123,45,25,85";
        String [] s1 = s.split(",") ;
        System.out.println(Arrays.toString(s1));
        int[] num = new int[s1.length];
        for (int i = 0; i < num.length; i++) {
            num[i]= Integer.parseInt(s1[i]);
        }
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
    }
}
