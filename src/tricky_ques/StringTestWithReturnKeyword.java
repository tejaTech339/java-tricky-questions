package tricky_ques;

public class StringTestWithReturnKeyword {

	public static String m(String str) {
		
		System.out.println("m()-method");
		
		try {	
			System.out.println("im try");
			return "A";
		}catch (Exception e) {
			System.out.println("im catch");
			return "B";
		}
		finally {
			System.out.println("im finally");
			return "c";
		}
		
	}
	public static void main(String[] args) {
		
		System.out.println(m("hello"));
	}
}
