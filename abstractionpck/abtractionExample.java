package abstractionpck;

abstract class GeometricShape{
	protected String nameOfShape;

	abstract double calculateArea();
	public abstract String toString();
	
	public GeometricShape(String nameOfShape) {
		System.out.println("Inside th constructor of geometricShapes class");
		this.nameOfShape = nameOfShape;
	}
	
	public String grtNameofShape() {
	    return nameOfShape;
	}
}

class Circle extends GeometricShape{
	
	double radius;

	public Circle(String nameOfShape,double radius) {
		super(nameOfShape);
		System.out.println("Inside the Constructor of circle class");
		this.radius = radius;
	}
	@Override
	double calculateArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	@Override
	public String toString() {
		return "Name of the shape is "+super.nameOfShape + "and its area is: "+calculateArea();
	}
}

class Square extends GeometricShape{
	
	double length;
	public Square(String nameOfShape, double length) {
		super(nameOfShape);
		System.out.println("Inside the Constructor if Square class");
		this.length = length;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	double calculateArea() {
		return length * length;
	}
	
	@Override
	public String toString() {
		return "Name of the shape is "+super.nameOfShape + "and its area is: "+calculateArea();
	}
}

public class abtractionExample {
	public static void main(String[] args) {
		
		GeometricShape shpobj1 = new Circle("Circle", 6.5);
		System.out.println(shpobj1.toString());
		GeometricShape shpobj2 = new Square("Rectangle", 8);
		System.out.println(shpobj2.toString());
	}
}
