package cn.liu;

public class Demo {

	public static void main(String[] args) {
		Zi zi = new Zi();
		zi.test();
		zi.method();
		Fu fu = new Fu();
		fu.test();
		
		Fu fu2 = new Zi();
		fu2.test();
		((Zi)fu2).method();
	}
}
