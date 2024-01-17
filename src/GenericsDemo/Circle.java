package GenericsDemo;

public class Circle extends Shape {
	private double radius;

	public Circle (double radius) {
		setRadius(radius);
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double calcArea() {
		return radius * radius * PI;
	}
	
	public String toString() {
		return "Circle area: " + calcArea();
	}
}
