package by.jonline.module01.tasks6_10;

// (sin x + cos y) / (cos x - sin y) * tg xy;

public class Linear3 {
	
	public static void main(String[] args) {
		
		double x = 0.89;
		double y = 3.25;
		
		double rez = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		
		System.out.println(rez);
	}

}
