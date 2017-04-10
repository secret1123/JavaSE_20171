package java1702.javase.exercise;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by AnLu on
 * 2017/4/10 19:42.
 * JavaSE_20171
 */
public class Student {

//    private String name;
//    private int age;
//    private char gender;
//
//    public Student(String name, int age, char gender) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;

//        Iterator it = new Iterator() {
//            @Override
//            public void remove() {
//
//            }
//
//            @Override
//            public boolean hasNext() {
//                return false;
//            }
//
//            @Override
//            public Object next() {
//                return null;
//            }
//        };
//    }


    public static void main(String[] args) {

        ArrayList<String> List = new ArrayList<>();
        List.add("name");
        List.add("age");
        List.add("gender");

        for (Iterator<String> it = List.iterator(); it.hasNext(); ) {
            Object o = it.next();
            System.out.println(o);
        }

    }

}
