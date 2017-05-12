package java1702.javase.multithreading;

import java.util.Stack;

/**
 * Created by AnLu on
 * 2017/5/12 19:29.
 * JavaSE_20171
 */
public class StackTest {
    public static void main(String[] args) {
        //stack 堆栈
        //queue 队列
        Stack<String> strings = new Stack<>();
        strings.push("hello");
        strings.push("test");
        strings.push("hi");

        System.out.println(strings.pop());
        System.out.println(strings.pop());
        System.out.println(strings.pop());
    }
}
