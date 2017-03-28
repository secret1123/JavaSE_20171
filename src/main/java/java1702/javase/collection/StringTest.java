package java1702.javase.collection;

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
            System.out.println(c);
        }


    }
}
