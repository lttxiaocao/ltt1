package cn.liu;

public class EmperorTest {

	public static void main(String[] args) {
		System.out.println("创建1");
		Emperor emperor1 = Emperor.getInstance();
		emperor1.getName();
		System.out.println("创建2");
		Emperor emperor2 = Emperor.getInstance();
		emperor2.getName();

	}

}
