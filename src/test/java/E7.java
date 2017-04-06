import java.util.Scanner;

/**
 * Created by AnLu on
 * 2017/4/1 13:45.
 * JavaSE_20171
 */
//2. 从键盘上输入一个字符串，利用字符串类的方法将大写字母转变为小写字母，
// 小写字母转变为大写字母，再将前后字符对换,然后输出最后结果。
public class E7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入： " );
        String s = scanner.nextLine();

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]>='A'&&chars[i]<='Z'){
                chars[i]+=32;
            }else {
                chars[i]-=32;
            }
        }
        System.out.println(chars);

        char charMid = chars[0];
        chars[0] = chars[chars.length-1];
        chars[chars.length-1]=charMid;

        System.out.println(chars);
    }
}
