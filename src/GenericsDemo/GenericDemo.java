package GenericsDemo;

public class GenericDemo {

	public static void main(String[] args) {
		MemoryCell m = new MemoryCell();
		m.write(37);
		
		Integer val = (Integer) m.read();
		System.out.println("Content is: " + val);
		
	}
	
	// TODO create a totalArea method to calculate the total area of all shapes
	// TODO create a findMax method to find the largest shape (including subtype) based on the area
	
}
