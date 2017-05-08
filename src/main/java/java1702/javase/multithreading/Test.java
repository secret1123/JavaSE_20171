package java1702.javase.multithreading;

/**
 * Created by AnLu on
 * 2017/5/8 09:36.
 * JavaSE_20171
 */
public class Test implements Runnable{
    public static void main(String[] args) {

//        Test test = new Test();
        Thread thread = new Thread(new Test());
        thread.start();

        System.out.println("test...");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
