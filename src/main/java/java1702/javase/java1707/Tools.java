package java1702.javase.java1707;

import java.util.ArrayList;
import java.util.Scanner;

public class Tools {
    private static ArrayList<Item> itemList;


    //初始化数据，学了数据库以后，替换成连接数据库，并且读取数据的代码
    private static void initData() {

		/*
		 * 创建数据源
		 * 1:创建分类的对象
		 * 2:床品商品的对象
		 * */
        Classify c1 = new Classify();
        c1.set_name("食品");

        Classify c2 = new Classify();
        c2.set_name("电器");

        Classify c3 = new Classify();
        c3.set_name("生活用品");

        Classify c4 = new Classify();
        c4.set_name("三无产品");


        //创建商品
        itemList = new ArrayList<Item>();


        Item item1 = new Item();
        item1.set_name("可乐");
        item1.set_price(3);
        item1.set_desc("可以喝的,还挺好喝");
        item1.set_expiration("24个月");
        item1.set_classify(c1);


        Item item2 = new Item();
        item2.set_name("芬达");
        item2.set_price(3);
        item2.set_desc("橙子味的汽水");
        item2.set_expiration("24个月");
        item2.set_classify(c1);


        Item item3 = new Item();
        item3.set_name("iPhone9 Plus");
        item3.set_price(9000);
        item3.set_desc("可以打电话，也可以打架");
        item3.set_expiration("24个月");
        item3.set_classify(c2);

        Item item4 = new Item();
        item4.set_name("乔二");
        item4.set_price(200);
        item4.set_desc("不太好用");
        item4.set_expiration("24个月");
        item4.set_classify(c4);

        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
    }


    //遍历整个集合，通过给定的条件，来查找对应的数据
    private static void getItemByName(String typeName) {
        //通过指定的分类名称，来查找集合中对应的数据
        int count = 0;//用来记录是否有相应的商品
        for (Item item : itemList) {
            //判断分类的名称是否和用户输入的一致
            //获取某一个商品的分类的名称，和用户输入的分类进行判断
            if (item.get_classify().get_name().equals(typeName)) {
                count++;
                outPut(item.get_name());
            }
        }
        if (count == 0) {
            outPut("没有找到商品");
        }
    }

    private static void jude(int i) {
        String typeName = "";
        switch (i) {
            case 1:
                typeName = "食品";
                //1:循环整个集合列表，找出分类是食品的

                break;
            case 2:
                typeName = "电器";

                break;
            case 3:
                typeName = "生活用品";

                break;
            case 4:
                typeName = "三无产品";

                break;
            default:
                break;
        }
        getItemByName(typeName);
    }

    public static void input() {

        //创建数据
        initData();
        Scanner scanner = new Scanner(System.in);
        outPut("请选择要购买的商品类别");
        outPut("1:食品\t2:电器\t3:生活用品\t4:三无产品\n");
        int i = scanner.nextInt();
        jude(i);
		
		/*
		 * 1:录入产品的信息
		 * 2:对产品做一个分类
		 *   家电类，食品，服装，
		 * */
		
		
		
		/*Scanner scanner = new Scanner(System.in);
		list = new ArrayList<Person>();
		for(int i=0;i<5;i++)
		{
			outPut("请输入第:"+(i+1)+"个人的信息");
			Person p = new Person();
			p.set_name(scanner.nextLine());
			p.set_age(scanner.nextInt());
			scanner.nextLine();
			p.set_phone(scanner.nextLine());
			p.set_address(scanner.nextLine());
			list.add(p);
		} 
		outPut("人创建完毕，集合中有:"+list.size()+"个人");
		outPut(list);*/
    }


    private static void outPut(ArrayList<Item> itemList, int i) {
        for (Item item : itemList) {
            System.out.println(item.toString());
        }
    }

    private static void outPut(ArrayList<Person> persons) {
		/*if(persons!=null&&persons.size()>0)
		{
			for(Person p :persons)
			{
				System.out.println(p.get_name()+"--"+p.get_age()+"--"+p.get_phone());
			}
		}
		else
		{
			outPut("不存在或为空");
		}*/
    }

    private static void outPut(String message) {
        System.out.println(message);
    }

}
