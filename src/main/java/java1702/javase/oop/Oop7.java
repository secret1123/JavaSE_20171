package java1702.javase.oop;

/**
 * Created by AnLu on
 * 2017/4/1 08:58.
 * JavaSE_20171
 */
public class Oop7 {
    private String name;
    private int  age;
    private double height;

    public Oop7(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void eat() {

    }

    public void sleep() {

    }

    public void study() {

    }

    public static void main(String[] args) {
        Oop7 oop7 = new Oop7("zhangsan",18,45.5);

        System.out.println(oop7.name);
        System.out.println(oop7.age);
        System.out.println(oop7.height);
    }
}
