package za.ac.wsu.s216268931;

public class CircleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Circle c1=new Circle(6,8,9);
		
		c1.getRadius();
		c1.getX();
		c1.getY();
		
		System.out.println("Radius : "+c1.getRadius());
		System.out.println("X : "+c1.getX());
		System.out.println("Y : "+c1.getY());
		c1.calculateArea();
		c1.calculateCircumference();
		c1.calculateDiameter();

	}

}
