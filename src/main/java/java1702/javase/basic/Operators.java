package java1702.javase.basic;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created by anlu on 2017/3/7.
 */
public class Operators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(a && b);

        // & && ab都为true,结果为true;
        // | || ab都为false，结果为false;
        // ^ ab不相同，结果为true
        // ! 取反（单目运算符）

        int x = 2;
        int y = 1;

        boolean z = (x < y) && (y++ < x);

        System.out.println(z);
        System.out.println(y);

        System.out.println(Integer.toBinaryString(-10));


    }
}
