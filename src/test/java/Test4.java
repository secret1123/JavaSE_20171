import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by AnLu on
 * 2017/4/22 09:44.
 * JavaSE_20171
 */
public class Test4 {
    public static void main(String[] args) {
        Writer writer = null;
        try {
            writer = new FileWriter("a.txt");
            int i;
            for (i = 0; i < 5000; i++) {
                writer.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
