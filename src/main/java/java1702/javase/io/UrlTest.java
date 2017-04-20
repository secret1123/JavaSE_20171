package java1702.javase.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by AnLu on
 * 2017/4/18 18:52.
 * JavaSE_20171
 */
public class UrlTest {
    public static void main(String[] args) throws IOException {

        try {
            URL url = new URL("http://localhost:63342/JavaSE_20171/shuixiang.jpg");
            InputStream stream = url.openStream();
            System.out.println(stream.read());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
