package HierachicalInheritance;

public class StudentClass extends Person {
		private int marks;
		private String div;
		
		public StudentClass() {
			this.marks = 11;
			this.div = "class a";
		}
		
		public  StudentClass(int marks, String div) {
			this.marks = marks;
			this.div= div;
		}
		
		public int getMarks(int marks) {
			return marks;
		}
		
		public String getDiv(String div) {
			return div;
		}
		
		public String toString() {
			return "Marks: "+this.marks+" | Div "+this.div;
		}
	
}
