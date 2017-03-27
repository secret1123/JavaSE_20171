package java1702.javase.exercise;

/**
 * Created by anlu on 2017/3/16.
 */
public class E21 {
    long one(int o) {
        if (0 == 1){
            return 1;
        }
        return one(o-1)*o;
    }

    public static void main(String[] args) {
        E21 e21 = new E21();
        long sum = 0;
        for (int i = 1; i < 21; i++) {
            sum += e21.one(i);
        }
        System.out.println(e21.one(20));
    }
}
