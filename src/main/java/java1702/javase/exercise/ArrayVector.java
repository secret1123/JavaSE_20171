package java1702.javase.exercise;


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
    private int capacity;

    public ArrayVector() {
        strings = new String[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }

    public ArrayVector(int initialCapacity) {
        strings = new String[initialCapacity];
        capacity = initialCapacity;
    }

    public void add(String string) {
        if (size == capacity) {
            String[] newStrings = new String[capacity * 2];
            capacity *= 2;
            System.arraycopy(string, 0, newStrings, 0, strings.length);
            strings = newStrings;
        }
        strings[size] = string;
        size++;
    }

    public String get(int index) {
        if (index >= size) {
            System.out.println("error");
            System.exit(0);
        }
        return strings[index];
    }

    public String remove(int index) {
        if (index >= size) {
            System.out.println("error");
            System.exit(0);
        }
        String s = strings[index];
        System.arraycopy(strings, index + 1, strings, index, size - index - 1);
        strings[size - 1] = null;
        size--;
        return s;
    }

    public String set(int index, String element) {
        if (index >= size) {
            System.out.println("error");
            System.exit(0);
        }
        String s = strings[index];
        strings[index] = element;
        return s;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return capacity;
    }

}
