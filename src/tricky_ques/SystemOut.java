package tricky_ques;

import java.io.IOException;
import java.io.PrintStream;

public class SystemOut {

	public static void main(String[] args) throws IOException {
		
		String msg="hello world";
		
		PrintStream out = System.out;
		
		out.write(msg.getBytes());
		
		
	}
}
