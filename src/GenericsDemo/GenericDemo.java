package GenericsDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Comparator;

public class GenericDemo {

	public static void main(String[] args) {
		/*MemoryCell<Shape> m = new MemoryCell<>();
		Shape r = new Rectangle(56.00, 89.00);
		m.write(r);
		
		Shape val = m.read();
		System.out.println("Content is: " + val.toString());*/

		List<Shape> listShape = new ArrayList<>();
		listShape.add(new Circle(23.00));
		listShape.add(new Triangle(23.00, 98.00));
		listShape.add(new Rectangle(230.00, 56.00));

		System.out.println("The total of the shapes is " + totalArea(listShape));
		System.out.println("The biggest shape is " + findMax(listShape));

	}
	
	// TODO create a totalArea method to calculate the total area of all shapes

	public static double totalArea(List<? extends Shape> listShape) {
		double total = 0.0;
		for (Shape s : listShape)
			if (s != null)
				total += s.calcArea();
		return total;
	}


	// TODO create a findMax method to find the largest shape (including subtype) based on the area

	public static Shape findMax(List<? extends Shape> listShape) {
		Comparator<Shape> compareByArea = Comparator.comparing(Shape::calcArea);
		listShape.sort(compareByArea);
		return listShape.get(listShape.size() - 1);
	}
}
