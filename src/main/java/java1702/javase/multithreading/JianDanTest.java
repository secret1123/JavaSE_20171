package java1702.javase.multithreading;

/**
 * Created by AnLu on
 * 2017/5/8 10:37.
 * JavaSE_20171
 */
public class JianDanTest implements Runnable {

    private static int counter = 0;
    private static final String PAGE_URL = "http://jandan.net/tag/%E5%A4%A9%E6%96%87/page/";

    public static void main(String[] args) {

        Thread thread = new Thread(new JianDanTest());
        thread.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 22; i++) {
            System.out.println("page:"+(i+1));
        }
    }
}
