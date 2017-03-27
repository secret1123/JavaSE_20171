package java1702.javase.oop;

import java.awt.*;

/**
 * Created by AnLu on
 * 2017/3/21 10:44.
 * JavaSE_20171
 */
public interface Shape {

    double getPerimeter();

    double getArea();

//    public static void main(String[] args) {
//        CircleTest circleTest = new CircleTest(6);
//        System.out.println(circleTest.getPerimeter());
//        System.out.println(circleTest.getArea());
//
//        Triangle triangle = new Triangle(3,4,5);
//        System.out.println(triangle.getPerimeter());
//        System.out.println(triangle.getArea());
//
//        Square square = new Square(5);
//        System.out.println(square.getPerimeter());
//        System.out.println(square.getArea());
//
//        Rectangle rectangle = new Rectangle(2,4);
//        System.out.println(rectangle.getPerimeter());
//        System.out.println(rectangle.getArea());
//
//        Quadrangle quadrangle = new Quadrangle(1,2,3,4);
//        System.out.println(quadrangle.getPerimeter());
//    }
}
 class CircleTest implements Shape {

    private double pi = 3.14;
    private double radius;

    public CircleTest(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * pi * radius;
    }

    @Override
    public double getArea() {
        return pi * Math.pow(radius, 2);
    }
}

class Triangle implements Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if ((a + b) > c && (b + c) > a && (a + c) > b) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            System.out.println("error.");
            System.exit(0);
        }
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        return s * Math.sqrt((s - a) * (s - b) * (s - c));
    }
}
class Square implements Shape,Rectangle,Quadrangle{
    double a = 0;

    @Override
    public void rectangle(double width, double height) {

    }

    @Override
    public void quadrangle(double a, double b, double c, double d) {

    }

    @Override
    public double getPerimeter() {
        return a * 4;
    }

    @Override
    public double getArea() {
        return a * a;
    }
}

interface Rectangle extends Shape {
     double width = 0;
     double height = 0;

    void rectangle(double width, double height);

    @Override
    double getPerimeter();

    @Override
    double getArea();
}
interface Quadrangle extends Rectangle {
     double a = 0;
     double b = 0;
     double c = 0;
     double d = 0;

    void quadrangle(double a, double b, double c, double d);

    @Override
    double getPerimeter();

    @Override
    double getArea();
}
