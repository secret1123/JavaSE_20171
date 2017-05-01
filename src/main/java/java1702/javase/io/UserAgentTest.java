package java1702.javase.io;

import sun.net.www.protocol.http.HttpURLConnection;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by AnLu on
 * 2017/4/28 15:49.
 * JavaSE_20171
 */
public class UserAgentTest {
    private static final String USER_AGENT = "test";

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://wallpapers.wallhaven.cc/wallpapers/full/wallhaven-509708.jpg");
        System.setProperty("http.agent", USER_AGENT);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        try (
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("test1.jpg"))) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
        }
    }
}
