package java1702.javase.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by AnLu on
 * 2017/4/27 08:48.
 * JavaSE_20171
 */
public class Test {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(?i)c");
        Matcher matcher = pattern.matcher("www.w3school.com.Cn");

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
