package java1702.javase.basic;

/**
 * Created by anlu on 2017/3/15.
 */
public class Vehicle {
    String name;
    double weight;
    double price;
    char color;

    public Vehicle(String name, double weight, double price, char color) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.color = color;
    }


    public Vehicle() {
        System.out.println("Vehicle is running.");
    }

    public void start() {
        System.out.println("vehicle is starting.");
    }
    public void stop() {
        System.out.println("vehicle is stopped.");
    }
}

class Bicycle extends Vehicle {

    int  pedal;//脚蹬子

    @Override
    public void start() {
        System.out.println("Bicycle is starting.");
    }



    public Bicycle(String name, double weight, double price, char color, int pedal) {
        super(name, weight, price, color);
        this.pedal = pedal;
    }


//    public Bicycle() {
//        System.out.println("Bicycle is running");
//    }

    public void ride() {
        System.out.println("ride a bicycle. ");//蹬自行车
    }
}
//class Ship extends Vehicle {
//    String oar;//船桨
//
//    public void anchor() { //停泊
//        System.out.println("to board a ship");//登船
//    }
//}
//class Plane extends Vehicle {
//    String wing;//翼
//
//    public void fly() {
//        System.out.println("The plane flew from New York to Paris.");//飞机从纽约飞往巴黎。
//    }
//}
//
class VehicleTest {


    public static void main(String[] args) {

//        Vehicle human = new Vehicle();//("神六",1000,10000,'白');
//        System.out.println(human.color);
//        System.out.println(human.weight);
//        System.out.println(human.name);
//        human.start();
//        human.stop();

        Bicycle bicycle = new Bicycle("GiANT",10,1000,'白',2);
//        System.out.println(bicycle.name);
//        System.out.println(bicycle.pedal);
//        System.out.println(bicycle.getClass());
        bicycle.start();

//        Bicycle girl = new Bicycle();
//        System.out.println(girl.pedal);
//        System.out.println(girl.price);
//        girl.stop();
//        girl.ride();
//
//        Ship crew = new Ship();//船员
//        System.out.println(crew.weight);
//        System.out.println(crew.oar);
//        crew.stop();
//        crew.anchor();
//
//        Plane boy = new Plane();
//        System.out.println(boy.wing);
//        System.out.println(girl.weight);
//        boy.start();
//        boy.fly();
    }
}
