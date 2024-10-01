package ExceptionExamples;

public class HandleMultiException {

	public static void method1() {
		
	}
	public static void method2() {
	    try {	
	    	int a=0;
	    	int b= 10/a;
	    	System.out.println("b: "+b);
	    	int c[] = {1,2,3,4,5};
	    	c[15] = 15;
	    	System.out.println("c[15] "+c[15]);
	    }
	    catch(ArithmeticException e2) {
	    	System.out.println(e2.getMessage());
	    }
	    catch(ArrayIndexOutOfBoundsException e1){
	    	System.out.println(e1.getMessage());
	    }
	    catch(Exception e3) {
	    	System.out.println(e3.getMessage());
	    }
	}
	
	public static void method3() {
		try {	
			    int a=0;
			   	int b= 10/a;
			   	System.out.println("b: "+b);
			   	int c[] = {1,2,3,4,5};
			   	c[15] = 15;
			    System.out.println("c[15] "+c[15]);
			 }
			 catch(ArithmeticException e2) {
			    System.out.println(e2.getMessage());
			 }
		finally {
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method2();
	}

}
