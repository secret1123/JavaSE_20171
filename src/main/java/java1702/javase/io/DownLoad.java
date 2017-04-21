package java1702.javase.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by AnLu on
 * 2017/4/21 11:55.
 * JavaSE_20171
 */
public class DownLoad{
    public static void main(String[] args) {
        try {
            URL url = new URL("http://jandan.net/tag/nasa");
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))){
                String line;
                while ((line = reader.readLine())!=null){
                    if (line.contains("data-original=\"//")){
                        String imgURL=line.substring(line.indexOf("//tankr"),line.indexOf("jpg"));
                        System.out.println(imgURL);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}