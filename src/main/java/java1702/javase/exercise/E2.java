package java1702.javase.exercise;

/**
 * Created by An lu on 2017/3/14.
 */
public class E2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i++) {
            boolean b = true;
            for (int j = 2; j < i / 2 + 1; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) { // TODO: 2017/3/14
                System.out.println(i);
            }
        }
    }
}
