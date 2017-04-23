import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by AnLu on
 * 2017/4/22 10:02.
 * JavaSE_20171
 */
public class Test5 {
    public static void main(String[] args) {
        final int M = 20;
        int[] fib = new int[M];
        int[] fib2 = new int[M];
        long fp;
        fib[0] = 1;
        fib[1] = 1;
        int i;
        for (i = 2; i < M; i++)
            fib[i] = fib[i - 1] + fib[i - 2];
        try {
            RandomAccessFile raf = new RandomAccessFile("fout.txt", "rw");
            System.out.println("fout.txt中的内容为： ");
            for (i = 0; i < M; i++) {
                raf.writeInt(fib[i]);
                System.out.println(fib[i] + "\t");
            }
            for (i = 1; i < M; i += 2) {
                fp = i * 4;
                raf.seek(fp);
                fib2[i / 2] = raf.readInt();
            }
            raf.close();
            raf=new RandomAccessFile("fin.txt","rw");
            System.out.println("fin.txt中的内容为： ");
            for (i=0;i<M/2;i++) {
                System.out.println(fib2[i] + "\t");
                raf.writeInt(fib2[i]);
            }
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
