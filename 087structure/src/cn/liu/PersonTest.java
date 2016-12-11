package cn.liu;

public class PersonTest {

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person("张三","男",11);
		System.out.println("员工1"+person1.getName()+person1.getGender()+person1.getAge());
		System.out.println("员工2"+person2.getName()+person2.getGender()+person2.getAge());

	}

}
