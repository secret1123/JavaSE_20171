package java1702.javase.multithreading;

/**
 * Created by AnLu on
 * 2017/5/8 16:45.
 * JavaSE_20171
 */
public class JoinTest implements Runnable{

    public static void main(String[] args) {
        Thread thread =new Thread(new JoinTest());
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("test...");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
