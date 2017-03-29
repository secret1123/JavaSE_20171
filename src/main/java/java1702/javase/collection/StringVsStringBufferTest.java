package java1702.javase.collection;

/**
 * Created by AnLu on
 * 2017/3/29 10:55.
 * JavaSE_20171
 */
public class StringVsStringBufferTest {

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {

        String s = "";
        StringBuffer stringBuffer = new StringBuffer("");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
//            s += ALPHABET;
            stringBuffer.append(ALPHABET);
        }
        System.out.println("time:"+(System.currentTimeMillis()-start));
//        System.out.println(s.length());//42s
        System.out.println(stringBuffer.length());//0s
    }
}
