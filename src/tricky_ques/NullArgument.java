package tricky_ques;

public class NullArgument {

	// pass a null-arg to the string and object to a overloading method

	public static void test(Object obj) {

		System.out.println("object null");
	}

	public static void test(String str) {

		System.out.println("string null");// compiler gives chance to a Child type
	}

	// if we use StringBuffer or StringBuilder we get ambiguity problem

	// if we remove Object type and kept only String types compiler agian gives
	// Ambiguity error

//	public static void test(StringBuffer sbf) {
//
//		System.out.println("StringBuffer null");
//	}
//
//	public static void test(StringBuilder sbl) {
//
//		System.out.println("StringBuilder null");
//	}

	public static void main(String[] args) {

		test(null);
	}
}
