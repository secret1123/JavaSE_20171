package java1702.javase.exercise;
import java.util.Random;
/**
 * Created by AnLu on
 * 2017/3/20 15:51.
 * JavaSE_20171
 */
public class E34 {

    public static void main(String[] args) {
        Random random = new Random();


        for (int i = 0; i < 10000; i++) {
//            int r = (int) (Math.random() * 20) + 1;
//            System.out.println(r);
            int r = random.nextInt(20)+1;
            System.out.println(r);
        }
    }
}
