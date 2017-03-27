package java1702.javase.exercise;

/**
 * Created by anlu on 2017/3/16.
 */
public class E22 {
    int five(int f) {
        if (f == 1) {
            return 1;
        }
        return five(f - 1) * f;
    }

    public static void main(String[] args) {
        E22 e22 = new E22();
        System.out.println(e22.five(5));
    }
}
