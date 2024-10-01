package ExceptionExamples;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100, b=0;
		try {
		int	c=a/b;
		System.out.println("C: "+c);
		int d = a+b;
		System.out.println("d: "+d);
		int e = a-b;
		System.out.println("e: "+e);
		}catch(Exception e) {
			System.out.println("Number can not be divided by zero");
			System.out.println(e.getMessage());
		}
	}

}
