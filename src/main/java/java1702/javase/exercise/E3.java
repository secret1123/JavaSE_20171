package java1702.javase.exercise;

/**
 * Created by anlu on 2017/3/14.
 */
public class E3 {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            int q = i / 1000;
            int b = i / 100%10;
            int s = i/10%10;
            int g = i %10;
            if (i == q * q * q * q + b * b * b * b + s * s * s * s + g * g * g * g) {
                System.out.println(i);
            }
        }
    }
}
