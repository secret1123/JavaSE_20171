package java1702.javase.multithreading;

/**
 * Created by AnLu on
 * 2017/5/9 09:13.
 * JavaSE_20171
 */
public class YieldTest implements Runnable {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new YieldTest(), "thread 1");
        Thread thread2 = new Thread(new YieldTest(), "thread 2");

        thread1.start();
        thread2.start();

        System.out.println("test...");
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0) {
                Thread.yield();
            }
        System.out.println(i);
        }
    }
}
