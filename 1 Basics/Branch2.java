package by.jonline.module01.tasks;

// Ќайти max {min(a,b), min(c,d)}

public class Branch2 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double d;

		a = 119.8;
		b = 124.15;

		c = 119.6;
		d = 134.8;

		double max = Math.max(Math.min(a, b), Math.min(c, d));

		System.out.println(max);
		
		// ≈сли задача в теме ветвлени€, то веро€тно есть смысл сделать через ветвлени€
		
		double min1;
		double min2;
		
		if (a <= b) {
			min1 = a;
		}
		else {
			min1 = b;
		}
		
		if (c <= d) {
			min2 = c;
		}
		else {
			min2 = d;
		}
		
		if (min1 >= min2) {
			max = min1;
		}
		else {
			max = min2;
		}
		
		System.out.println(max);

	}

}
