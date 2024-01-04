package tricky_ques;

public class PrintOneToHundWithOutNumber {

	public static void main(String[] args) {
		
		int one='A'/'A';
		
		String s="..........";
		
		for(int i=one;i<=(s.length()*s.length());i++) {
			
			System.out.print(i+",");
		}
		System.out.println();
		
		/////////////////////////////
		for(int i=one;i<='d';i+=one) {
			System.out.print(i+" ");
		}
	}
}
