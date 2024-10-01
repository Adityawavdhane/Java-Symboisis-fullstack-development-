package Vehical;

public class FourWheeler extends Vehicals {
      
	   private String colour;
	   private String model;
	   
	   public FourWheeler() {
		   this.colour = "Black";
		   this.model = "2023 A";
	   }
	   
	   public FourWheeler(String colour, String model) {
		   this.colour = colour;
		   this.model = model;
	   }
	   
	   public String getColour() {
		   return colour;
	   }
	   
	   public void setColour(String colour) {
		   	this.colour = colour;
	   }
	   
	   public String getModel() {
		   return model;
	   }
	   
	   public void setModel(String model) {
		   this.model = model;
	   }
	   
	   
	   public String toString() {
		   return "Colour: "+this.colour +" |  Model: "+this.model;
	   }   
}
