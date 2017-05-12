package java1702.javase.io;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by AnLu on
 * 2017/5/11 17:41.
 * JavaSE_20171
 */
public class CWTest {
    public static void main(String[] args) throws IOException {

        String path = "word.conf";
        String contentPath = "context.txt";
        FileReader con = new FileReader(contentPath);
        FileReader word = new FileReader(path);
        char[] cs = new char[500];
        int len = 0;
        String contextString = null;
        while ((len = con.read(cs))!=-1){
            contextString = new String(cs,0,len);
            System.out.println("文本内容："+contextString);
        }
        con.close();
        BufferedReader br = new BufferedReader(word);
        String str;
        Map<String,String> map = new HashMap<>();
//        while ()
    }

}
