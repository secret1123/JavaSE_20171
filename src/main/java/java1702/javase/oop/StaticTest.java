package java1702.javase.oop;

import java.security.PublicKey;

/**
 * Created by AnLu on
 * 2017/3/22 09:07.
 * JavaSE_20171
 */
public class StaticTest {
    public static void main(String[] args) {
        Mankind mankind = new Mankind();
        mankind.setName("tom");
        mankind.age=20;
        Mankind.married=true;
        System.out.println(mankind.getName());
        System.out.println(mankind.getAge());
        System.out.println(Mankind.married);


        Mankind jerry = new Mankind();
        jerry.age = 22;
        jerry.setName("jerry");
//        mankind.married = true;
        System.out.println(jerry.getAge());
        System.out.println(jerry.getName());
        System.out.println(Mankind.married);

    }
}

class Mankind {
    private String name;
    public int age;
    public static boolean married;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static boolean isMarried() {
        return married ;
    }

    public static void setMarried(boolean married) {
        Mankind.married = married;
    }
}
