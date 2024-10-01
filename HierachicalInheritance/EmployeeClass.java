package HierachicalInheritance;

public class EmployeeClass extends Person{
	
	private int empId;
	private String dept;
	
	public EmployeeClass() {
		this.empId = 12;
		this.dept = "cs";
	}
	
	public EmployeeClass(int empId,String dept) {
		this.empId = empId;
		this.dept = dept;
	}
	
	public String getDept(String dept) {
		return dept;
	}
	
	public void setDept(String dept) {
	   this.dept = dept;
	}
	
	public void getEmpid(int empId){
		this.empId = empId;
	}
	
	public String toString() {
		return "Department: "+this.dept+" | Employee Id:"+this.empId;
	}
}
