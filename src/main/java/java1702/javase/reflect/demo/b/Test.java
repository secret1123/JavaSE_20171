package java1702.javase.reflect.demo.b;

/**
 * Created by AnLu on
 * 2017/5/5 10:05.
 * JavaSE_20171
 */
public class Test {
    public static void main(String[] args) {
        Service service = new Service(new FloppyWriter());

        service.write();
    }
}
