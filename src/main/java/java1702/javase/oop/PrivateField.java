package java1702.javase.oop;

/**
 * Created by AnLu on
 * 2017/3/20 14:39.
 * JavaSE_20171
 */
public class PrivateField {
    private int x;
    private int y;

    public int add() {
        return x + y;
    }
    public int divide() {
        return x / y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        if (y == 0) {
            System.out.println("y con't be zero!");
            return;
        }
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class PrivateFieldTest {
    public static void main(String[] args) {
        PrivateField privateField = new PrivateField();

        privateField.setX(30);
        privateField.setY(10);

        System.out.println(privateField.add());
        System.out.println(privateField.divide());
    }

    public void mi() {
        m2();
    }

    private void m2() {

    }
}
