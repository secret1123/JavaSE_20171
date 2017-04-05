package java1702.javase.exercise;

/**
 * Created by AnLu on
 * 2017/4/5 20:10.
 * JavaSE_20171
 */
public class _T1 {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};

        for (int x : numbers) {
            if (x == 30){
                continue;
            }
            System.out.print(x);
            System.out.print(",");

        }
        System.out.println("\t");
        String[] names = {"james","larry","tom","lacy"};
        for (String name : names) {
            System.out.print(name);
            System.out.print(",");
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i="+i+",j="+j);
            }
        }

    }
}
