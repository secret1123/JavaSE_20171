package java1702.javase.reflect.demo.b;

/**
 * Created by AnLu on
 * 2017/5/5 09:59.
 * JavaSE_20171
 */
public class FloppyWriter implements DeviceWriter {

    @Override
    public void writeToDevice() {

        System.out.println("write to floppy...");
    }
}
