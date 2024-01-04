package interviewQuestions;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7,8,9};
		
		int searchEle=19;
		
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++) {
			
			if(searchEle==arr[i]) {
				System.out.println("Elemnet found at index no:"+i);
				flag=true;
				break;
			}
		}
		if(flag==false)
			System.out.println("Element not found");
	}
}
