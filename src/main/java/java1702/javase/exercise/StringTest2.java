package java1702.javase.exercise;


/**
 * Created by AnLu on
 * 2017/4/19 10:28.
 * JavaSE_20171
 */
// 找出字符串中出现次数最多的字母和出现的次数
public class StringTest2 {
    public static void main(String[] args) {
        String s = "wshrgusodbnsdjssdlfsdgsheegm";
        int count = 0;
        char res = getMost(s, count);
        System.out.println("出现次数最多字母：" + res);
    }

    public static char getMost(String s, int count) {
        char ret = ' ';
        int[] sum = new int[128];
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if ((65 <= c && c <= 90) || (97 <= c && c <= 122))
                sum[c]++;
            }
            for (int j = 0; j < sum.length; j++)
                if (sum[j] > count) {
                    count = sum[j];
                    ret = (char) j;
                }
                System.out.println("出现最多次数：" + count);
                return ret;
            }
        }