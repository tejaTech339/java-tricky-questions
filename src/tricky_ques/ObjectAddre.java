package tricky_ques;

public class ObjectAddre {

	static ObjectAddre add;
	
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			add=new ObjectAddre();
			System.out.println(add.hashCode());
		}
		add=null;
		System.out.println("object is dereffered :"+add);
	}
}
