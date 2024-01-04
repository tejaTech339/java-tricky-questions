package tricky_ques;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String str=sc.nextLine();
		
		char[] ch=str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			System.out.print(ch[i]+" ");
		}
	}
}
