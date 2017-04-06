import java.util.Scanner;

/**
 * Created by AnLu on
 * 2017/4/6 19:56.
 * JavaSE_20171
 */
public class Exercise {
    public static void main(String[] args) {
        String str;
        str = "浮点型变量的值为" +
                "%f"+"\n整型变量的值为" +
                "%d"+"\n字符串变量的值为" +
                "%s";
        System.out.println(str);
        Scanner scanner = new Scanner(System.in);
        System.out.println("next方式接受：");
        if (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            System.out.println("输入的数据为："+ s);
        }

        double sum = 0;
        int m = 0;

        while (scanner.hasNextDouble()) {
            double x = scanner.nextDouble();
            m = m + 1;
            sum = sum + x;
        }
        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的平均值是" + (sum/m));
    }
}
