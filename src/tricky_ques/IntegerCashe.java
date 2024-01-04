package tricky_ques;

public class IntegerCashe {

	public static void main(String[] args) {
		
		Integer i=100;
		Integer k=100;
		
		if(i==k) {
			System.out.println("both are equal");
		}else {
			System.out.println("both are not");
		}
		
		// Integer cache range is -128 to 127
		
		Integer a=300; 
		Integer b=300;
		
		if(a==b) {
			System.out.println("both are equal");
		}else {
			System.out.println("both are not");
		}

	}
}
