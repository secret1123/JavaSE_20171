package io;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by AnLu on
 * 2017/4/18 11:43.
 * JavaSE_20171
 */
public class ReaderTest {

    public static void main(String[] args) {

        try {
            Reader reader = new FileReader("test");
            int i;
            while ((i = reader.read())!= -1){
                System.out.println(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
