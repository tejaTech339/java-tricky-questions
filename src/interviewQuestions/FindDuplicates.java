package interviewQuestions;

import java.util.HashSet;

public class FindDuplicates {

	public static void main(String[] args) {

		String[] str = { "java", "c", "c++", "java" };

		boolean flag = false;
		/*
		 * for(int i=0;i<str.length;i++) 
		 * { for(int j=i+1;j<str.length;j++) 
		 * {
		 * 
		 * if(str[i]==str[j])
		 *  { System.out.println("Duplicate found :"+str[i]);
		 * flag=true; 
		 * } } } 
		 * if(flag==false) {
		 * System.out.println("Duplicates not found");
		 *  }
		 */

		// Approach-2:
		HashSet<String> hs = new HashSet<String>();

		for (String x : str) {

			if (hs.add(x) == false) {
				System.out.println("Duplicate Ele found :"+x);
			}
		}
		if(flag==true) {
			System.out.println("Element not found");
		}
	}
}
