package tricky_ques;

public class SingletonTypeTest {

	public static void main(String[] args) {
		
		//SingletonType s1=new SingletonType();
		
		int res=SingletonType.createObject();
		System.out.println(res);
	}
}
