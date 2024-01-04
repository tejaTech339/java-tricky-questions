package tricky_ques;

class This{
	
	This getRef1() {
		
		This th=new This();
		// in this case JVM encounters NEW-keyword every time it creates and returns
		//  a new object.
		// so duplicate objects are going to increased and heap memory waste.
		return th;
	}
	
	This getRef2() {
		// Here we are returning current class object so there is no duplicate objects
		// only single copy.
		return this;
	}
}
public class ThisDemo {

	public static void main(String[] args) {
		
		This th=new This();
		System.out.println(th);//tricky_ques.This@1d251891
		System.out.println();
		
		System.out.println(th.getRef1());//tricky_ques.This@2133c8f8
		System.out.println(th.getRef1());//tricky_ques.This@43a25848
		System.out.println(th.getRef1());//tricky_ques.This@3ac3fd8b
		System.out.println();
		
		System.out.println(th.getRef2());//tricky_ques.This@1d251891
		System.out.println(th.getRef2());//tricky_ques.This@1d251891
		System.out.println(th.getRef2());//tricky_ques.This@1d251891
		
	}
}
