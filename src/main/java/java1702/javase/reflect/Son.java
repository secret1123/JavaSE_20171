package java1702.javase.reflect;

import java.util.Arrays;

/**
 * Created by AnLu on
 * 2017/5/5 15:20.
 * JavaSE_20171
 */
public class Son extends Father implements InterfaceTest{

    public static void main(String[] args) {

        Class clazz = Son.class;
        System.out.println(clazz.getSuperclass().getSimpleName());
        System.out.println(Arrays.toString(clazz.getInterfaces()));

    }
}

interface InterfaceTest{

}
