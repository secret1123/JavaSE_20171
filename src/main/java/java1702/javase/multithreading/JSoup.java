package java1702.javase.multithreading;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by AnLu on
 * 2017/5/8 20:51.
 * JavaSE_20171
 */
public class JSoup {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("http://jandan.net/tag/nasa").get();
        Elements elements = document.select("img[class=lazy]");
        for (Element element : elements) {
            System.out.println("http:"+element.attr("data-original"));
        }
    }
}
