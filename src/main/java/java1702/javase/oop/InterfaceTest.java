package java1702.javase.oop;

/**
 * Created by AnLu on
 * 2017/3/23 09:29.
 * JavaSE_20171
 */
public interface InterfaceTest {
    int ONE = 1;

    void o1();


}

interface I {

    void o2();
}

interface M {

    void o3();
}

class InterfaceTestImpl implements InterfaceTest,I,M {

    @Override
    public void o1() {

    }

    @Override
    public void o2() {

    }

    @Override
    public void o3() {

    }
}