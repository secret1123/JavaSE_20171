import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/**
 * Created by AnLu on
 * 2017/4/22 10:02.
 * JavaSE_20171
 */
public class Test5 {
    public static void main(String[] args) {
            try (
                    RandomAccessFile randomAccessFile = new RandomAccessFile("raf.txt","rw")){

                for (int i = 1; i < 20; i++) {
                    randomAccessFile.write(i*2);
                    System.out.println(randomAccessFile.read());
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
