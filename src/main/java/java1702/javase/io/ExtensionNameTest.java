package java1702.javase.io;

/**
 * Created by AnLu on
 * 2017/4/21 11:04.
 * JavaSE_20171
 */
public class ExtensionNameTest {
    public static void main(String[] args) {
        String s = "123.gif";
        System.out.println(s.substring(s.lastIndexOf('.')));
    }
}
