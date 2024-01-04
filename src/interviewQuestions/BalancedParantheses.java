package interviewQuestions;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class BalancedParantheses {

	public static void main(String[] args) {

		Deque<Character> list = new LinkedList<Character>();

		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter :");
			String str = input.next();

			for (char ch : str.toCharArray()) {

				if (ch == '(' || ch == '{' || ch == '[') {
					list.add(ch);
				} else {

					// if list is not empty
					if (!list.isEmpty()) {
						if ((list.peekFirst() == '{' && ch == '}') ||
								   (list.peekFirst() == '[' && ch == ']')
								|| (list.peekFirst() == '(' && ch == ')')) {
							list.removeFirst();
						}
					} else {

						System.out.println("\nUnbalanced Parentheses.");
					}
				}
			}
		}
		System.out.println("Balanced");
	}
}
