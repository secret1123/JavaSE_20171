package java1702.javase.basic;

/**
 * Created by anlu on 2017/3/17.
 */
public class StaticPolymorphism {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("input : ");
//        int s = scanner.nextInt();
        CaculatorTest caculatorTest = new CaculatorTest();
        System.out.println(caculatorTest.add(1, 2));
        System.out.println(caculatorTest.add(1d, 1));
    }
}

class CaculatorTest {

    public int add(int x, int y) {
        return x + y;
    }

    public int add(int x, int y, int z) {
        return x + y + z;
    }

    public double add(double x, double y) {
        return x + y;
    }
}
