package java1702.javase.reflect.demo.b;

/**
 * Created by AnLu on
 * 2017/5/5 10:01.
 * JavaSE_20171
 */
public class Service {
    private DeviceWriter deviceWriter;

    public Service(DeviceWriter deviceWriter) {
        this.deviceWriter = deviceWriter;
    }

    public void write(){
        deviceWriter.writeToDevice();
    }
}
