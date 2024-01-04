package tricky_ques;

public class ParameterLimitForMethds {

	/*  **int,boolean,float,Class-type
	 for static method 255 is limit
	 for non-static method 254 is the limit */
	
	// for ***long,double only 127 is for the both methods
	
	public static void m1(int a255) {
		System.out.println("255 is the parameter limit for static");
	}
	public  void m2(int a254) {
		System.out.println("254 is the parameter limit for non static");
	}

	
	public static void main(String[] args) {
		
		new ParameterLimitForMethds().m2(254);
		m1(255);
	}
}
