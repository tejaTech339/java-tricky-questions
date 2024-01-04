package tricky_ques;

class Static{
	
	public static final int x=100;
	
	static {
		System.out.println("Static class static-block");
	}
}
public class StaticBlockAndFinalStaticVariable {

	public static void main(String[] args) {
		
		System.out.println(Static.x);
		
		// 1. in case-1 if we execute the x only x value will prints
		//2. in this case if we remove final-keyword static block will also prints
	}
}


