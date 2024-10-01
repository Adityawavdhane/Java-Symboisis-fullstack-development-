/* Use Static block in program */

package io;

public class StaticBlock {
	
	static int section;
	private static int srno;
	
	// static Block
	static {
		System.out.println("---------------withInStaticBlock--------------------");
		srno=1000;
	}
	
	// static method
	static void display() {
		//can't access without static method
		System.out.println("Serial No "+srno);
	}
	
	StaticBlock(){
		System.out.println("------------withInDefaultConstructor---------------");
		srno++;
		section++;
	}
	
	public String toString() {
		return "MyClass [Serial No"+srno+", Section="+ section+"]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticBlock stb = new StaticBlock();
		System.out.println(stb);
		StaticBlock.display();
		
		StaticBlock stb1 = new StaticBlock();
		System.out.println(stb1);
		StaticBlock.display();
		
		StaticBlock stb2 = new StaticBlock();
		System.out.println(stb2);
		StaticBlock.display();
	}
}
