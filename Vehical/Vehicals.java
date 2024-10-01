package Vehical;

public class Vehicals {

	private String carname;
	private String carno;
	
	public Vehicals() {
		this.carname = "BMW";
		this.carno = "MH15EJ222";
	}
	
	public Vehicals(String carname, String carno) {
		this.carname = carname;
		this.carno = carno;
	}
	
	public String getCarname() {
		return carname;
	}
	
	public void setCarname(String carname) {
		this.carname = carname;
	}
	
	public void setCarno(String carno) {
		this.carno = carno;
	}
	
	public String getCarno() {
		return carno;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "carname: "+carname+ " | carno: "+carno;
	}
	
}
