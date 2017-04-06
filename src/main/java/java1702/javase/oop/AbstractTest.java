package java1702.javase.oop;

/**
 * Created by AnLu on
 * 2017/3/21 08:56.
 * JavaSE_20171
 */
public abstract class AbstractTest {
    private int i;
    private double d;

    public abstract void method(int i);

    public abstract void method();

    abstract void method2();

    public void method3(){

    }

    public AbstractTest(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        SubAbstractTest subAbstractTest = new SubAbstractTest(1);
        System.out.println(subAbstractTest);
        subAbstractTest.method();
        subAbstractTest.method3();

    }
}
class SubAbstractTest extends AbstractTest {

    public SubAbstractTest(int i) {
        super(i);
    }

    @Override
    public void method(int i) {

    }

    @Override
    public void method() {

    }

    @Override
    void method2() {

    }

}