package java1702.javase.collection;

import java1702.javase.exercise.E2;

/**
 * Created by AnLu on
 * 2017/3/29 11:48.
 * JavaSE_20171
 */
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer);

        String s = "hello";
        StringBuffer stringBuffer1 = new StringBuffer(s);
        String s1 = stringBuffer1.toString();

        //append 在后面追加  prepend 前缀，在前面添加
        //string pool 字符串池
        String s2 = "true";
        s2 += "123";

        System.out.println(stringBuffer.append(true).append(123));
        System.out.println(stringBuffer.delete(4,6));

        //insert 插入     offset  偏移，位移
        System.out.println(stringBuffer.insert(4,false));

        //reverse 颠倒，倒转
        System.out.println(stringBuffer.reverse());

        stringBuffer.reverse().setCharAt(0,'T');//setCharAt 没有返回值，所以不能直接输入，要先赋值再输出
        System.out.println(stringBuffer);
    }
    private static String reverse(String origin) {

        return origin;
    }
}
