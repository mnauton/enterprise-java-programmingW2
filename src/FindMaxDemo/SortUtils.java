package FindMaxDemo;

import java.util.Comparator;

public class SortUtils {
/*	public static Comparable findMax(Comparable [] a) {
		int maxIndex = 0;
		for (int i = 1; i < a.length; i++)
			if (a[i].compareTo(a[maxIndex]) > 0)
				maxIndex = i;
		return a[maxIndex];
	}*/

	public static <T> T findMax(T[] a, Comparator<T> compare) {
		int maxIndex = 0;
		for (int i = 1; i < a.length; i++) {
			if (compare.compare(a[i], a[maxIndex]) > 0)
				maxIndex = i;
		}
		return a[maxIndex];
	}
}
