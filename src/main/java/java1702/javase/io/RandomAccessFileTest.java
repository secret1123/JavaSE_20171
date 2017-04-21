package java1702.javase.io;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by AnLu on
 * 2017/4/21 10:08.
 * JavaSE_20171
 */
public class RandomAccessFileTest {
    public static void main(String[] args) {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile("raf","rw")){
            for (int i = 0; i < 10; i++) {
                randomAccessFile.writeDouble(i*0.5);
            }
            randomAccessFile.seek(32L);//寻求，搜索 第32个字节  一个字符8个字节
            System.out.println(randomAccessFile.readDouble());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
