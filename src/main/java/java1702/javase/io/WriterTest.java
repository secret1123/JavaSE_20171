package java1702.javase.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by AnLu on
 * 2017/4/20 09:05.
 * JavaSE_20171
 */
public class WriterTest {
    public static void main(String[] args) {
        Writer writer = null;
        try {
            writer = new FileWriter("new");
                writer.write(0x4e01);
            System.out.println(011);
            writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
            if (writer!=null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
