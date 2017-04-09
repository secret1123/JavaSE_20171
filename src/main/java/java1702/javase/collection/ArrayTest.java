package java1702.javase.collection;

/**
 * Created by AnLu on
 * 2017/3/27 15:34
 * JavaSE_20171
 */
public class ArrayTest {
    public static void main(String[] args) { //args arguments 参数
        String[] strings = new String[10];
        System.out.println(strings[0]);
        strings[0] = "test...";
        System.out.println(strings[0]);

        boolean[] booleans = new boolean[100];
        System.out.println(booleans[99]);

        int[] ints =  {1,2,3,4,5,6,67,888};
        System.out.println(ints[6]);

        double[] doubles= new double[10];
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = i + 1;
        }
        System.out.println("----->"+doubles[doubles.length-1]);
        for (int i = 0; i < doubles.length; i++) {
            System.out.println(doubles[i]);
        }

        ArrayTest[] arrayTests = {new ArrayTest(),new ArrayTest(),new ArrayTest()};
        System.out.println(arrayTests[0]);
        System.out.println(arrayTests[1]);
        System.out.println(arrayTests[2]);
        System.out.println(arrayTests.length);

        String[] months = {"Jan","Feb","Mar","Apr","May"};

        //itar + tab   iterate 迭代 array 数组  对数组进行迭代循环赋值
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }

        System.out.println("---------------");

        //iter + tab
        for (String month : months) {
            System.out.println(month);
        }
    }
}
