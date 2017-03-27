package java1702.javase.oop;

/**
 * Created by anlu on 2017/3/16.
 */
//编写一个立方体类，包含属性：长度，宽度，高度，通过方法来计算它的体积
public class Oop2 {
    public static void main(String[] args) {
        Cube cube = new Cube(3d,3d,3d);
        System.out.println(cube.getClass());
    }
}
class Cube {
    double length;
    double width;
    double height;

   Cube(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
}