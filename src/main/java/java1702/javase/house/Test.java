package java1702.javase.house;

/**
 * Created by AnLu on
 * 2017/5/5 19:36.
 * JavaSE_20171
 */
public class Test{
    private static final String[] AREA={
            "dongcheng",
            "xicheng",
            "chaoyang",
            "haidian",
            "fengtai",
            "shijingshan",
            "tongzhou",
            "changping",
            "daxing",
            "yizhuangkaifaqu",
            "shunyi",
            "fangshan",
            "mentougou",
            "pinggu",
//            "huairou",
            "miyun",
            "yanqing",
            "yanjiao"
    };
    private static final int[] PAGES={
            35,
            35,
            100,
            100,
            67,
            21,
            46,
            94,
            42,
            6,
            29,
            17,
            14,
            1,
//            0,
            1,
            1,
            100
    };

    private static final String DONGCHENG_URL="http://bj.lianjia.com/ershoufang";
    private static final String IMAGE_REGEXP="<div class=\"totalPrice\"><span>(\\d+)</span>";
    private static int counter;

    public static void main(String[] args) {
        for (int i = 0; i < AREA.length; i++) {
            counter=0;
            System.out.println("area:"+AREA[i]);
            for (int j = 0; j < PAGES[i]; j++) {
                System.out.println("\t page:"+(j+1));

            }
        }
    }
}
