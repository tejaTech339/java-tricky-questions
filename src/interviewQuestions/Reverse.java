package interviewQuestions;

public class Reverse {


	public static void main(String[] args) {
		
		//1.Using Algorithm
		int num=1234;
	/*	
		int rev=0;
		while(num!=0) {	
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("reverse number is :"+rev);
		*/
		
		/*
		//2.String Buffer
		StringBuffer sbf=new StringBuffer(String.valueOf(num));
		StringBuffer reverse = sbf.reverse();
		System.out.println(reverse);
		*/
		
		//String Builder
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder reverse = sbl.reverse();
		System.out.println(reverse);
		
	}
}
