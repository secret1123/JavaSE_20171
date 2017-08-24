package java1702.javase.basic;

/**
 * Created by anlu on 2017/3/16.
 */
public class Father {
    int money;

    public void coding() {
        System.out.println("father is coding...");
    }
}

class Son extends Father {
    String buy;

    public Son(String buy) {
        this.buy = "i can fly";
    }

    public void run() {
        System.out.println("I can fly");
    }

    public static void main(String[] args) {
        Father father = new Father();
        System.out.println(father.money);
        father.coding();

        Son son = new Son("FLY");
        System.out.println(son.buy);
        son.run();

        Son sister = new Son("FLY");
        System.out.println(sister.buy);
        sister.run();
  }

}

class  ExtendsTest {
    public static void main(String[] args) {
        Son brother = new Son("FLY");
        System.out.println(brother.money);
        System.out.println();
        brother.coding();

    }
}
