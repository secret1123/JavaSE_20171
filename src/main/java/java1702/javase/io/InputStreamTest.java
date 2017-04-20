package java1702.javase.io;

import java.io.*;

/**
 * Created by AnLu on
 * 2017/4/18 10:35.
 * JavaSE_20171
 */
public class InputStreamTest {

    public static void main(String[] args) {
        FileInputStream inputStreamTest = null;
        try {
            inputStreamTest = new FileInputStream("test");

            int i;
            while ((i = inputStreamTest.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (inputStreamTest!=null) {
                try {
                    inputStreamTest.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
