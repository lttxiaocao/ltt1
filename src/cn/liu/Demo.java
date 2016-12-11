package cn.liu;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student stu1 = new Student("zhangsan",23);
		Student stu2 = new Student();
		
		stu2.setName("lisi");
		stu2.setAge(54);
		
		System.out.println(stu1.toString());
		System.out.println(stu2.getName()+stu2.getAge());
		
		System.out.println("----------------");
		
		Student stu3 = stu1;
		System.out.println(stu1.hashCode());
		System.out.println(stu2.hashCode());
		System.out.println(stu3.hashCode());
		
		System.out.println("----------------");
		
		System.out.println(stu1.toString());
		System.out.println(stu2.toString());
		System.out.println(stu3.toString());
		
		System.out.println("----------------");
		
		Student stu4 = new Student("zhangsan",23);
		System.out.println(stu1.equals(stu4));
		System.out.println(stu1.equals(stu2));
		System.out.println(stu1.equals(stu3));
		
		System.out.println("----------------");
		
		System.out.println(stu4);
		System.out.println(stu4.toString());
		System.out.println(stu4.getClass());
		System.out.println(stu4.getClass().getName());
		
		System.out.println("----------------");
		
		Object stu5 = stu2.clone();
		System.out.println(stu5);
	}
}
