package tricky_ques;

public class SingletonType {

	int age;

	static {
		SingletonType obj = new SingletonType();
	}

	private SingletonType() {
		age = 30;
	}

	public static int createObject() {
		SingletonType obj = new SingletonType();
		obj.age = 20;
		return obj.age;
	}

	public static void main(String[] args) {
		SingletonType s = new SingletonType();
		System.out.println(s.age);
	}
}
