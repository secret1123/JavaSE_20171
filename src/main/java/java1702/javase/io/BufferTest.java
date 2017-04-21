package java1702.javase.io;

import java.io.*;

/**
 * Created by AnLu on
 * 2017/4/21 09:55.
 * JavaSE_20171
 */
public class BufferTest {
    public static void main(String[] args) {
        try (
            BufferedInputStream in = new BufferedInputStream(new FileInputStream("/Users/anlu/Desktop/疯狂Java讲义  第3版 PDF电子书下载 带书签目录 完整版.pdf"));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("/Users/anlu/Desktop/疯狂Java讲义  第3版 PDF电子书下载 带书签目录 完整版1.pdf"));
        ){
            int i;
                while ((i = in.read())!=-1){
                    out.write(i);
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
