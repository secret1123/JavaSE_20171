package java1702.javase.reflect.demo.c;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by AnLu on
 * 2017/5/5 10:51.
 * JavaSE_20171
 */
public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        //properties  属性
        Properties properties = new Properties();
        properties.load(new FileReader("src/main/java/java1702/javase/reflect/demo/c/config.properties"));
        System.out.println(properties.getProperty("key"));
        System.out.println(properties.getProperty("k"));
    }
}
