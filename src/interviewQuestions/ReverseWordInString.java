package interviewQuestions;

public class ReverseWordInString {

	public static void main(String[] args) {

		//Approach-1
		/*
		String str = "welcome to java";

		String[] words = str.split(" ");

		String result = "";

		for (String word : words) {

			String reverseWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				reverseWord = reverseWord + word.charAt(i);
			}
			result = result + reverseWord + " ";
		}
		System.out.println("result is: " + result);
		*/
		
		//Approach-2:
		String str = "welcome to java";

		String[] words = str.split("\\s");
		
		String result = "";
		
		for(String word:words) {
			StringBuilder sbl=new StringBuilder(word);
			sbl.reverse();
			result=result+sbl.toString()+" ";
		}
		System.out.println(result);
	}
}
