package java1702.javase.oop;

/**
 * Created by AnLu on
 * 2017/3/24 08:58.
 * JavaSE_20171
 */
public class ScopeTest {
    public static void main(String[] args) {
        ScopeTest scopeTest = new ScopeTest();
        scopeTest.method();
    }
    public void method() {
    int j;
    j = 0;
        System.out.println(j);
        for (int k = 2; k < 10; k++) {
            System.out.println(k);
        }
        for (int k = 0; k < 20; k++) {
            k=5;
            System.out.println(k);
        }
    }

    private int i;
    public void exceptionTest(){

            String s;
        try {
             s = "hi";
        }catch (Exception e){

        }finally {

        }
    }
}
