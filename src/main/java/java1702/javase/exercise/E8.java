package java1702.javase.exercise;

/**
 * Created by anlu on 2017/3/17.
 */
// 构造一个日期类,包含年、月、日的属性和以下构造方法:
// 不带参数
// 包含年月日三个参数
// yyyy-MM-dd 格式的字符串
// 提供存取日期的方法,实例化一个该类后,输入一个日期,
// 可以计算出该日期是当年的第几天,要求计算天数的方法由日期类提供,可直接通过该类的实例去调用
public class E8 {
    public static void main(String[] args) {

    }
}
class Date {
    int year;
    int month;
    int day;

    public Date() {
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}