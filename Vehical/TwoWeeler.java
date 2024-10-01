package Vehical;

public class TwoWeeler extends Vehicals {
	
	private String vehical_Company,name,no;
	private String vehical_price;
	
	public TwoWeeler() {
		this.name = "UNICON";
		this.no = "MH15AJ2132";
		this.vehical_Company = "Honda";
		this.vehical_price = "120000";
	}
	
	public TwoWeeler(String name,String no,String company,String price) {
		this.name = name;
		this.no = no;
		this.vehical_Company = company;
		this.vehical_price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getNo() {
		return no;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNo(String no) {
		this.no = no;
	}
	
	public String getVehical_Company() {
		return vehical_Company;
	}
	
	public String getVehical_price() {
		return vehical_price;
	}
	
	public void setVehical_Company(String vehical_Company) {
		this.vehical_Company = vehical_Company;
	}
	
	public void setVehical_price(String vehical_price) {
		this.vehical_price = vehical_price;
	}
	
	
	public String toString() {
		return "Vehical Name: "+name+" | Vehical No "+no+" | Vehical Company: "+this.vehical_Company+" | Vehical Price "+this.vehical_price;
	}
	
}
