package java1702.javase.collection;

import java.util.TreeMap;

/**
 * Created by AnLu on
 * 2017/4/12 11:02.
 * JavaSE_20171
 */
public class MyTreeMap<K,V> extends TreeMap<K,V> {

    @Override
    public V put(K key, V value) {
        if (value == null) {
            throw new NullPointerException();
        }
        return super.put(key, value);
    }

    public static void main(String[] args) {
        MyTreeMap<Integer,String> map = new MyTreeMap<>();
        map.put(1,null);
    }
}
