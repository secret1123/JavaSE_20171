package java1702.javase.collection;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by AnLu on
 * 2017/4/11 17:06.
 * JavaSE_20171
 */
public class ArrayListLinkedList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        long m1 = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        System.out.println(m1);
        for (int i = 0; i < 10000000; i++) {
//            arrayList.add(i+"");//600M
            linkedList.add(i+"");//760M
        }
        long m2 = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        System.out.println(m2);

        System.out.println((m2-m1)/1024/1024);
    }
}
