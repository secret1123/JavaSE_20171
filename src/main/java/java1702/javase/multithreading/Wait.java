package java1702.javase.multithreading;

/**
 * Created by AnLu on
 * 2017/5/12 15:25.
 * JavaSE_20171
 */
public class Wait {
    synchronized void waitTest(){
        System.out.println(Thread.currentThread().getName()+"wait start...");
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"wait end...");
    }

    synchronized void notifyTest(){
        System.out.println(Thread.currentThread().getName()+"notify start...");
        this.notify();
        System.out.println(Thread.currentThread().getName()+"notfy end...");
    }
}

class SyncTest1 implements Runnable {

    private static Wait wait = new Wait();

    @Override
    public void run() {
        if (Thread.currentThread().getName().endsWith("3")) {
            wait.notifyTest();
            return;
        }
        wait.waitTest();
    }

    public static void main(String[] args) {
        SyncTest1 syncTest1 = new SyncTest1();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(syncTest1,"thread" + i);
            thread.start();
        }
    }
}