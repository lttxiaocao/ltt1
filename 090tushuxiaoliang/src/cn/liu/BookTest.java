package cn.liu;

import java.util.Random;

public class BookTest {
	public static void main(String[] args) {
		String[] titles = {"c","c++","c#"};
		for(int i=0;i<5;i++){
			new Book(titles[new Random().nextInt(3)]);
		}
		System.out.println("ÏúÊÛÁË"+Book.getCounter());
	}

}
