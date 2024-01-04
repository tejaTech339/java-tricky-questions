package tricky_ques;

public class PrintHelloWorldWithOutSemiColon {

	public static void main(String[] args) {

		if (System.out.printf("hello world"+"\n") == null) {

		}

		if (System.out.append("hello world"+"\n") == null) {

		}
		
		if (System.out.append("hello world"+"\n").equals(null)) {

		}
		
		for(int i=0;i<1;System.out.println("hello world")) {
			i++;
		}

	}
}
