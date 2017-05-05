package java1702.javase.reflect;

import java.lang.reflect.ParameterizedType;

/**
 * Created by AnLu on
 * 2017/5/5 15:44.
 * JavaSE_20171
 */
public class FatherTest<C> {

    public FatherTest() {
        System.out.println(((Class)(((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0])).getSimpleName());
    }
}

class SonA extends FatherTest<Doctor>{}
class SonB extends FatherTest<Lawyer>{}
class SonC extends FatherTest<Programmer>{}
class SonD extends FatherTest<Programmer>{}

class Doctor{}

class Lawyer{}

class Programmer{}

class SonTest{
    public static void main(String[] args) {
        SonA sonA = new SonA();
        SonB sonB = new SonB();
        SonC sonC = new SonC();
        SonD sonD = new SonD();
//
//        Class clazz = SonA.class;
//        System.out.println(((Class)(((ParameterizedType)clazz.getGenericSuperclass()).getActualTypeArguments()[0])).getSimpleName());
//
//        Class clazz1 = SonB.class;
//        System.out.println(clazz1.getGenericSuperclass());
//
//        Class clazz2 = SonC.class;
//        System.out.println(clazz2.getGenericSuperclass());
//
//        Class clazz3 = SonD.class;
//        System.out.println(clazz3.getGenericSuperclass());
    }
}