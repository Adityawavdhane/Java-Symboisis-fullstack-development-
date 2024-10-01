package ObjectClassExamples;


import java.lang.reflect.Constructor;

class cloneExample implements Cloneable{

	public void testClone() {
		// TODO Auto-generated method stub
		
	}
	
	
}

public class ObjectClassExample {
	
	String str="hello";
	public static void objMethod1() {
		ObjectClassExample obj = new ObjectClassExample();
		System.out.println(obj.str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cloneExample cobj = new cloneExample();
		cobj.testClone();
	}
	
	public static void method3() {
		try {
			Constructor<ObjectClassExample> obj = ObjectClassExample.class.getConstructor();
			ObjectClassExample obj1 = obj.newInstance();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void method2() {
		try {
			ObjectClassExample obj = ObjectClassExample.class.newInstance();
			System.out.println(obj.str);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
