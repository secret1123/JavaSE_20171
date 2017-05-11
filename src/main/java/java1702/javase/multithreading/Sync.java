package java1702.javase.multithreading;

/**
 * Created by AnLu on
 * 2017/5/10 21:27.
 * JavaSE_20171
 */
public class Sync {
    public synchronized void test(){
        System.out.println(Thread.currentThread().getName()+"start...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"end...");
    }
}

class SyncTest implements Runnable{

    private static Sync sync = new Sync();

    @Override
    public void run() {
        sync.test();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new SyncTest(),"thread"+i);
            thread.start();
        }
    }
}