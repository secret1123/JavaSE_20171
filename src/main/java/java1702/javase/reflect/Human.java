package java1702.javase.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/**
 * Created by AnLu on
 * 2017/5/3 17:32.
 * JavaSE_20171
 */
class Animals{
    public int age;
    private double weight;

    public Animals() {
    }

    public Animals(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public int sleep(int hours){
        return hours;
    }

    public void eat(String food){
        System.out.println("eating"+food);
    }

    private void killHuman(){
        System.out.println("killed a poor guy.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

public class Human extends Animals{
    public String name;
    private boolean married;

    public Human() {
    }

    public Human(String name, boolean married) {
        this.name = name;
        this.married = married;
    }

    public Human(int age, double weight, String name, boolean married) {
        super(age, weight);
        this.name = name;
        this.married = married;
    }

    @Override
    public void eat(String food) {
        System.out.println(name+"is now eating"+food);
    }

    public void study(String course){
        System.out.println(name+"is now studying"+course);
    }

    public void killAnimals(String animal){
        System.out.println(name+"is now killing"+animal);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}

class HumanTest{
    public static void main(String[] args) throws NoSuchMethodException {
//        Human human = new Human();
//        Class clazz = human.getClass();
//        Field[] fields = clazz.getFields();
//        System.out.println("------getFields()-------");
//        for (Field field : fields) {
//            System.out.println(field.getName());
//        }
//
//        Field[] declaredFilds = clazz.getDeclaredFields();
//        System.out.println("------getDeclaredFields()------");
//        for (Field declaredFild : declaredFilds) {
//            System.out.println(declaredFild.getName());
//        }
        Class clazz = Human.class;

        Constructor[] constructors = clazz.getConstructors();
        System.out.println("----getConstructors()----");
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
            for (Parameter parameter : constructor.getParameters()) {
                System.out.println("\t"+parameter);
            }
        }

        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        System.out.println("----getDeclaredConstructors()----");
        for (Constructor constructor : declaredConstructors) {
            System.out.println(constructor.getName());
            for (Parameter parameter : constructor.getParameters()) {
                System.out.println("\t"+parameter.getName());
            }
        }

        Constructor constructor = clazz.getDeclaredConstructor(int.class,double.class,String.class,boolean.class);
        System.out.println(constructor.getName());
        for (Parameter parameter : constructor.getParameters()) {
            System.out.println(parameter);
        }

        try {
            Field field = clazz.getDeclaredField("married");
            System.out.println(Modifier.toString(field.getModifiers()));
        }catch (NoSuchFieldException e){
            e.printStackTrace();
        }
    }
}
