package java1702.javase.reflect.demo.c;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Created by AnLu on
 * 2017/5/5 11:00.
 * JavaSE_20171
 */
public class Service {

    public void write() {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("src/main/java/java1702/javase/reflect/demo/c/config.properties"));
            String className = properties.getProperty("className");
            String methodName = properties.getProperty("methodName");

            Class clazz = Class.forName(className);
            Method method = clazz.getMethod(methodName);
            Constructor constructor = clazz.getConstructor();
            method.invoke(constructor.newInstance());
        } catch (IOException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
