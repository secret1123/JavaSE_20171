package java1702.javase.exercise;

import sun.security.util.Length;

/**
 * Created by AnLu on
 * 2017/3/30 13:56.
 * JavaSE_20171
 */
//使用数组来模拟向量
public class ArrayVector {

    private static final int DEFAULT_CAPACITY = 10;
    private String[] strings;
    private int size;
    private int initialCapacity;
    private int arrayList[][];

    public ArrayVector() {
        strings = new String[DEFAULT_CAPACITY];
    }

    public ArrayVector(int initialCapacity) {
        strings = new String[initialCapacity];
    }

    public void add(String string) {
        strings[size] = string;
        size++;
    }


    public String get (int index) {
        return strings[index];
    }

    public String remove(int index,String element){
        return strings[index];
    }

    public String set(int index) {
        return strings[index];
    }

    public int size() {
        return strings.length;
    }


    public static void main(String[] args) {
        ArrayVector arrayVector = new ArrayVector();
        arrayVector.add("hello");
        System.out.println(arrayVector.get(0));
    }
}
