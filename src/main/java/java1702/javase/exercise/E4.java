package java1702.javase.exercise;

/**
 * Created by anlu on 2017/3/16.
 */
//将一个正整数分解质因数。
//例如：输入90，打印出90=2*3*3*5
public class E4 {
    public void get(int n) {
        for (int i = 2; i < n + 1; i++) {
            if (n % i == 0) {
                if (i == n) {
                    System.out.println(i);
                    break;
                } else {
                    System.out.println(i + "*");
                    get(n / i);
                }
                break;
            }

        }
    }

    public static void main(String[] args) {
        E4 e4 = new E4();
        int n = 90;
        System.out.println(n +"*");
        e4.get(90);
    }
}
