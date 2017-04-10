package java1702.javase.collection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by AnLu on
 * 2017/3/31 11:43.
 * JavaSE_20171
 */
public class ListTest<E> extends ArrayList<E>{
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("one");
        arrayList1.add("two");
        arrayList1.add("three");
        System.out.println(arrayList1);

        List<String> arrayList = new ArrayList<>();
        arrayList.add("applet");
        arrayList.add("main");
        arrayList.add("args");
        arrayList.add("args");
        arrayList.add(2,"call");
        System.out.println(arrayList.addAll(3,arrayList1));
        System.out.println(arrayList);
        System.out.println("1： "+arrayList.size());
        System.out.println("2： "+arrayList.get(2));
        System.out.println("3： "+arrayList.contains("main"));
        System.out.println("4： "+arrayList.indexOf("applet"));//返回此列表中第一次出现的指定元素的索引；如果此列表不包含该元素，则返回 -1
        System.out.println("5： "+arrayList.lastIndexOf("args"));//返回此列表中最后出现的指定元素的索引
        System.out.println("6： "+arrayList.isEmpty());
        System.out.println("7： "+arrayList.set(2,"me"));
//        for (String string : arrayList) {
//            System.out.println("8： "+string);
//        }
        System.out.println("9： "+arrayList.remove(4));
//        Object[] objects = arrayList.toArray();
        arrayList.add("main");
        System.out.println("10： "+arrayList.size());
        System.out.println("11： "+arrayList);
        String[] strings = arrayList.toArray(new String[0]);
//        arrayList.removeAll(strings);
        System.out.println("->"+strings.length);
        System.out.println("12： "+arrayList);
        System.out.println("13： "+arrayList.size());
        System.out.println("14： "+arrayList.size());
        System.out.println(Arrays.toString(arrayList.toArray()));
        arrayList1.ensureCapacity(10);

        List<String> strings1 = arrayList.subList(2,4);
        System.out.println("15： "+strings1);

        ListTest<Integer> listTest = new ListTest<>();
        listTest.add(1);
        listTest.add(2);
        listTest.add(3);
        listTest.add(3);
        listTest.add(3);
        listTest.add(3);
        listTest.add(3);


//        listTest.removeRange(5,10);
        for (Object o : listTest) {
            System.out.println("16： "+o);
        }

        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        System.out.println("capacity1:"+((Object[])field.get(listTest)).length);

        listTest.trimToSize();
        System.out.println("capacity2:"+((Object[])field.get(listTest)).length);
        System.out.println(listTest.size());
    }
}
