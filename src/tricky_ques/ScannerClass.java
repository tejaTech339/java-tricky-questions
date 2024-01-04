package tricky_ques;

import java.lang.reflect.Method;
import java.util.Scanner;

public class ScannerClass {
	/*
	 * Scanner class is predefined class which is available in the java.util
	 * package. It was introduced in java 1.5 version The Scanner is mostly used to
	 * receive user input and parse them into primitive data types such as int,
	 * double or default String. It's a utility class to parse data using regular
	 * expressions by generating tokens
	 */

	public static void main(String[] args) {

		// valid syntax but not recomonded
		// java.util.Scanner sc=new java.util.Scanner(System.in);

		// recomonded
		Scanner sc = new Scanner(System.in);

		// System.out.println("Printing Scanner Class ref :-"+"\n"+sc);
		// System.out.println(sc.getClass());
		// System.out.println(sc.hashCode());

		// System.out.println(sc.toString());
		// System.out.println(sc.equals(""));
		// System.out.println(sc.equals(sc));

		// how to find all the declared methods in a class?
		Class c = java.util.Scanner.class;
		Method[] methods = c.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println("The method is: " + methods[i].toString());
		}

	}
}
