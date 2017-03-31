package java1702.javase.collection;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by AnLu on
 * 2017/3/31 11:43.
 * JavaSE_20171
 */
public class ListTest extends ArrayList{
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("applet");
        arrayList.add("main");
        arrayList.add("args");
        arrayList.add("args");
        arrayList.add("args");
        arrayList.add("args");
        arrayList.add("args");
        arrayList.add("args");
        arrayList.add("args");
        arrayList.add("args");
        arrayList.add("args");
        arrayList.add("args");
        arrayList.add("args");
        arrayList.add("args");
        arrayList.add("args");
        arrayList.add("args");
        arrayList.add("args");
        arrayList.add("args");
        arrayList.add("args");
        arrayList.add("args");
        arrayList.add("args");
        arrayList.add("args");
        arrayList.add("args");
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.contains("main"));
        System.out.println(arrayList.indexOf("applet"));
        System.out.println(arrayList.lastIndexOf("args"));
        System.out.println(arrayList.isEmpty());
//        System.out.println(arrayList.set(2,"me"));
//        for (String string : arrayList) {
//            System.out.println(string);
//        }
        System.out.println(Arrays.toString(arrayList.toArray()));
        arrayList.ensureCapacity(15);

        ListTest listTest = new ListTest();
        for (int i = 0; i < 10; i++) {
            listTest.add(""+i);
        }
        listTest.removeRange(5,10);
        for (Object o : listTest) {
            System.out.println(o);
        }
    }



}
