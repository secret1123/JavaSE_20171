/**
 * Created by AnLu on
 * 2017/4/8 14:14.
 * JavaSE_20171
 */
//有工人,农民,教师,科学家,服务生,其中,工人,农民,服务生只有基本工资.
//        教师除基本工资外,还有课酬(元/天),科学家除基本工资外,还有年终奖,
//        请你写出相关类,并编写测试类将各种类型的员工的全年工资打印出来。
public class Jobs {
    String worker;//工人
    String farmer;//农民
    String waiter;//服务生

    public double salary() {//工资
        return 0.0;
    }


    public String getWorker() {
        return worker;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }

    public String getFarmer() {
        return farmer;
    }

    public void setFarmer(String farmer) {
        this.farmer = farmer;
    }

    public String getWaiter() {
        return waiter;
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }

    public static void main(String[] args) {
        Jobs jobs = new Jobs();

    }
}


