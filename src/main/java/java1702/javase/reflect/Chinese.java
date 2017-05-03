package java1702.javase.reflect;

import java1702.javase.basic.Human;

/**
 * Created by AnLu on
 * 2017/5/3 16:55.
 * JavaSE_20171
 */
public class Chinese extends Human {
    private int i;

    public Chinese(int i) {
        this.i=i;
    }

    public void m(String s){
        System.out.println(s);
    }
}

class ChineseTest{
    public static void main(String[] args) throws ClassNotFoundException {
        Chinese chinese = new Chinese(1);
        Class<Chinese> chineseClass1 = Chinese.class;
        Class chineseClass2 = chinese.getClass();
        Class chineseClass3 = Class.forName("java1702.javase.reflect");
    }
}
