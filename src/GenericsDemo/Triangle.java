package GenericsDemo;

public class Triangle extends Shape {
	private double height;
	private double base;
	
	public Triangle (double height, double base) {
		setHeight(height);
		setBase(base);
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	
	public double calcArea() {
		return (height * base) / 2;
	}
	
	public String toString() {
		return "Triangle area: " + calcArea();
	}
}
