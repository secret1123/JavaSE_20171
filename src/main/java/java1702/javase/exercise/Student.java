package java1702.javase.exercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by AnLu on
 * 2017/4/10 19:42.
 * JavaSE_20171
 */
public class Student {

    private String name;
    private int age;
    private char gender;

    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public static void main(String[] args) {

//        ArrayList<Student> students = new ArrayList<>();
//        students.add(new Student("Tom",20,'M'));
//        students.add(new Student("Ann",22,'F'));

        HashSet<Student> students = new HashSet<>();
        students.add(new Student("Tom",20,'M'));
        students.add(new Student("Ann",22,'F'));

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();

            System.out.println(student.getName());
            System.out.println(student.getAge());
            System.out.println(student.getGender());
        }
//
//        for (Iterator<Student> it = students.iterator(); it.hasNext(); ) {
//            Object o = it.next();
//            System.out.println(o);
//        }
    }
}
