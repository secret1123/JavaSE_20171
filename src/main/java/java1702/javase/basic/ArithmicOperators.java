package java1702.javase.basic;

/**
 * Created by anlu on 2017/3/7.
 */
public class ArithmicOperators {
    public static void main(String[] args) {

    int x = 1;
    int y = 2;
    int z = x + y;// int z = x - y; int z = x * y; int z = x/y;
    int z1 = 8/9;

    double d1 = 1;
    double d2 = 2;

        System.out.println(d1/d2);

        System.out.println(z);

        System.out.println(x + y);

        System.out.println(x/d2);//结果是浮点型

        System.out.println(d1/y);//结果是浮点型

        //整型和整型运算，结果只能是整型，如果结果有小数，小数点后面全部忽略不计
        //整型和浮点型运算，结果就是浮点型

        double m = 2;
        double n = 5;

        System.out.println(m % n);
    }
}
