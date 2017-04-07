package java1702.javase.collection;

/**
 * Created by AnLu on
 * 2017/3/28 09:11.
 * JavaSE_20171
 */
public class _2DArray {
    public static void main(String[] args) {
        int [] [] ints = new int[3][5];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j]=i+j;
                System.out.print(ints[i][j]+"\t");
            }
            System.out.println();
        }

        /*
        1,2,3,4,5
        1
        1,2,3
        1,2,3,4
         */
        String[][] strings = new String[4][];//要自定义每一行的数组，后面的不写具体值
        strings[0] = new String[5];
        strings[1] = new String[1];
        strings[2] = new String[3];
        strings[3] = new String[4];

        double[][] doubles =
                {
                        {1d,2d,3d,4d,5d},
                        {1d},
                        {1d,2d,3d},
                        {1d,2d,3d,4d}
                };

        for (int i = 0; i < doubles.length; i++) {
            for (int j = 0; j < doubles[i].length; j++) {
                doubles[i][j]=i+j;
                System.out.print(doubles[i]+"\t");
            }
            System.out.println();
        }
    }
}
