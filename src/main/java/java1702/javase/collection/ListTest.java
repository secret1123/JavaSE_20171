package java1702.javase.collection;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.contains("main"));
        System.out.println(arrayList.indexOf("applet"));
        System.out.println(arrayList.lastIndexOf("args"));
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.set(2,"me"));
        for (String string : arrayList) {
            System.out.println(string);
        }
        System.out.println(arrayList.remove(4));
        Object[] objects = arrayList.toArray();
        arrayList.add("main");
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        ArrayList<String> strings = new ArrayList<>();
        arrayList.removeAll(strings);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        arrayList.trimToSize();
        System.out.println(arrayList.size());
//        System.out.println(Arrays.toString(arrayList.toArray()));
//        arrayList.ensureCapacity(15);

        List<String> strings1 = arrayList.subList(2,4);
        System.out.println(strings1);

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
