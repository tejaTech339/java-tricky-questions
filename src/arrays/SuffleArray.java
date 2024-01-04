package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SuffleArray {

	public static void main(String[] args) {
		
		Integer[] arr= {1,2,3,4,5};
		
		List<Integer> list=Arrays.asList(arr);
		
		Collections.shuffle(list);
		
		list.toArray(arr);
		
		System.out.println(Arrays.toString(arr));
	}
}
