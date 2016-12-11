package cn.liu;

public class Emperor {

	private static Emperor emperor = null;

	private Emperor() {
	}

	public static Emperor getInstance() {
		if (emperor == null) {
            emperor = new Emperor();
		}
		return emperor;
	}
	
	public void getName(){
		System.out.println("Œ“ «ª µ€");
	}
}
