package java1702.javase.basic;

/**
 * Created by anlu on 2017/3/10.
 */
public class WhileTest {
    public static void main(String[] args) {
        int i = 10;
        while (i<20) {
            System.out.println(i);
            i++;
        }
        System.out.println("-------------------");
        int j = 10;
        do {
            System.out.println(j);
            j++;
        }while (j<10);

    }
}
