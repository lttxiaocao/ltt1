package cn.liu;

public class HanoiTower {

	public static void moveDish(int level,char from,char inter,char to){
		if(level==1){
			System.out.println(from+"µ½"+to);
		}else{
			moveDish(level-1,from,to,inter);
			System.out.println(level+"²ã"+from+"µ½"+to);
			moveDish(level-1,inter,from,to);
		}
	}
	public static void main(String[] args) {
		moveDish(3,'A','B','c');
	}
}
