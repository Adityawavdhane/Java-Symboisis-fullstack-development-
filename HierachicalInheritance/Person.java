package HierachicalInheritance;

public class Person {
	
	private String name,city; 
	
	public Person()
	{
	   name="Mayur";
	   city="Nashik";
	}
	
	public Person(String name,String city) {
		this.name = name;
		this.city = city;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity(String city) {
		return city;
	}
	
	public String  getName(String name) {
		return name;
	}
	
	public String toString() {
		return "Name :"+this.name +"| City: "+this.city+"";
	}
}






