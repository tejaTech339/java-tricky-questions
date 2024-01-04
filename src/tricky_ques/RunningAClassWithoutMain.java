package tricky_ques;

public class RunningAClassWithoutMain {

	static {
		System.out.println("hello");
	}
	static {
		System.out.println("world");
		//System.exit(0);
	}
	public static void main(String[] args) {
		System.out.println("----");
	}
}
