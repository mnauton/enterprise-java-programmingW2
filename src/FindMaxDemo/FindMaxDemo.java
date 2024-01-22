package FindMaxDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FindMaxDemo {

	public static void main(String[] args) {
		/*List<Shape> listShape = new ArrayList<>();
		listShape.add(new Circle(3.0));
		listShape.add(new Rectangle(40.0, 5.0));
		listShape.add(new Triangle(2.0, 4.0));
		
		System.out.println("Total area for all shapes: " + totalArea(listShape));
		System.out.println("The largest shape is " + findMax(listShape).toString());*/

		/*String[] str = {"f", "b", "h", "a"};
		System.out.println("The largest string is " + SortUtils.findMax(str));*/

		Shape [] arrShape = {new Circle(3.0), new Rectangle(40.0, 5.0), new Triangle(2.0, 4.0)};
		System.out.println("The largest shape is " + SortUtils.findMax(arrShape, new OrderByArea()));

		Triangle [] triangles = { new Triangle(2.00, 58.00), new Triangle(8, 89.00), new Triangle(5.00, 66.00)};
		System.out.println("The biggest height is " + SortUtils.findMax(triangles, new OrderByHeight()).getHeight());
	}
	
	// TODO create a totalArea method to calculate the total area of all shapes
	public static double totalArea(List<? extends Shape> listShape) {
		double total = 0.0;
		for (Shape s: listShape) 
			if (s != null)
				total += s.calcArea();
		return total;
	}
	
	// TODO create a findMax method to find the largest shape (including subtype) based on the area
	public static Shape findMax(List<? extends Shape> listShape) {
		Comparator<Shape> compareByArea = Comparator.comparing(Shape::calcArea);
		Comparator<Triangle> CompareByHeight = Comparator.comparing(Triangle::getHeight);
		listShape.sort(compareByArea);
		return listShape.get(listShape.size() - 1);
	}
}
