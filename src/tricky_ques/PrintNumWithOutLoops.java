package tricky_ques;

import java.util.stream.IntStream;

public class PrintNumWithOutLoops {

	public static void printNum(int num) {

		if (num <= 100) {
			System.out.print(num + " ");
			num++;
			printNum(num);
		}
	}
	public static void printNu(int stNum,int endNum) {

		if (stNum <= endNum) {
			System.out.print(stNum + " ");
			stNum++;
			printNu(stNum,endNum);
		}
	}


	public static void main(String[] args) {
		int num = 1;
		//printNum(num);
		//printNu(1, 50);
		
		// java-8
		IntStream.range(1, 10).forEach(
				                e->System.out.println(e+" "));
		
		System.out.println("=====");
		
		IntStream.rangeClosed(1, 10).forEach(
				e->System.out.println(e+" "));
	}
}
