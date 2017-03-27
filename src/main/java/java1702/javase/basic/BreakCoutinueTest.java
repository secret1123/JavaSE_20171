package java1702.javase.basic;

/**
 * Created by anlu on 2017/3/10.
 */
public class BreakCoutinueTest {
    public static void main(String[] args) {
      outer:
        for ( int i = 0;i < 10;i++) {
          System.out.println("i:"+i);
          for (int j = 0;j<10;j++) {
              System.out.println("\tj:"+j);
              if (j == 5) {
                  continue outer;
              }
          }
      }
    }
}
