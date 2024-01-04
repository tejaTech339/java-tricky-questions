package tricky_ques;

public class StaticBlock {

	static {
		System.out.println("static block");
	}
	static {
	}

	public static void main(String[] args) {
		System.out.println("main");
	}
}
