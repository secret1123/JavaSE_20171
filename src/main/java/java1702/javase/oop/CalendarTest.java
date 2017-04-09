package java1702.javase.oop;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by AnLu on
 * 2017/3/23 13:38.
 * JavaSE_20171
 */
public class CalendarTest {

    static final String WEEK[] = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};

    public static void main(String[] args) {
        int i;
        int year = 2017;
        int month = 12;
        System.out.println(year + "年" + month + "月的日历如下所示：");
//        GregorianCalendar gregorianCalendar = new GregorianCalendar(year,month-1,1);
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month-1,1);
        int totalDays = Calendar.DAY_OF_MONTH;
        int startDay = Calendar.DAY_OF_WEEK - 1;
        for (i = 0; i < WEEK.length; i++) {
            System.out.print(WEEK[i] + "\t");
        }
            System.out.println();

        for (i = 0; i < startDay; i++) {
            System.out.print("\t");
        }
        for (int day = 1; day <= totalDays; day++) {
            if (day <= 10) {
                System.out.print(day + "\t");
            } else {
                System.out.print(day + "\t");
            }
            i++;
            if (i == 7) {
                System.out.println();
                i = 0;
            }
        }
    }
}