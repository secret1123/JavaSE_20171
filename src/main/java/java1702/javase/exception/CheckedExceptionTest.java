package java1702.javase.exception;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * Created by AnLu on
 * 2017/4/18 08:51.
 * JavaSE_20171
 */
public class CheckedExceptionTest {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        System.out.println("input a file name: ");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(fileName,"r");
        }catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.out.println("file not found!");
            test();//递归调用 方法本身,自己调用自己
        }
    }
}
