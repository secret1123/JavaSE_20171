package java1702.javase.java1707;

public class Demo {
    public static void main(String[] args) {

		/*Test t = new Test();
		//3次向上转型，2次装箱操作
		t.str="你好";
		t.str=123;
		t.str='你';
		//向上转型 子类转成父类
		//向下转型 父类转换成子类
		
		
		Test<String> t1 = new Test<String>();
		t1.str="你好";
		t1.str="a";
		t1.str="b";*/
		/*int[] nums=new int[3];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		
		nums[2]=0;*/
        //创建集合对象
        //添加5个人的名字，然后输出
		/*ArrayList<String> list= new ArrayList<String>();
		System.out.println(list.size());
		
		//将字符串转换成了object并存储在list集合中
		//向上转型
		list.add("张三");
		System.out.println(list.size());
		list.add("李四");
		
	
		
		
		//从集合中读取
		//System.out.println(list.get(5));
	
		for(int i=0;i<list.size();i++)
		{
			//Type mismatch: cannot convert from Object to String
			//cannot convert from Object to int
			//将Object转换成String--->向下转型
			//int number=Integer.parseInt(list.get(i).toString());
			String name = list.get(i);
		}
		list.clear();
		System.out.println(list.size());*/
		
		
		/*ArrayList<Person> personList = new ArrayList<Person>();
		//构造人的对象
		Person p1 = new Person("张三",20,"110110110110110","北京海淀");
		Person p2 = new Person("乔二",35,"119119119119119","上海崇明岛");
		Person p3 = new Person("@@",35,"112112112112121","新疆");
		
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		
		
		//正常的循环
		//for(int i=0;i<personList.size();i++)
		//{
			//1:从集合中获取对象
		//	Person p =personList.get(i);
		//	System.out.println(p.get_name()+"--"+p.get_age()+"--"+p.get_phone()+"--"+p.get_address());/
		//}
		
		//增强的for循环  效率稍微高一丢丢
		//一般用于泛型集合，对象数组
		//从personList中按照先后顺序，读取Person对象，然后将读取的对象存入p中
		
		
		//操作集合的时候，防御式编程
		if(personList!=null&&personList.size()>0)
		{
			for(Person p:personList)
			{
				System.out.println(p.get_name()+"--"+p.get_age()+"--"+p.get_phone()+"--"+p.get_address());
			}
		}*/
		
		/*
		 * 1:创建数据源
		 * 2:用户选择相应的分类 input jude
		 * 3:通过用户选择的分类去集合中找对应的数据 getItemByName
		 *    如果找到了就输出商品名称
		 *    如果没找到就输出没找到
		 * 
		 * */
        Tools.input();


    }

}
