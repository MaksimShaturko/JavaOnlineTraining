package by.jonline.lec02.main;

//z = ((a-3)*b/2)+c
public class Linear1 {
	
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		double z;
		
		a = 3.4;
		b = 5.6;
		c = 12.1;
		
		double temp;
		
		temp = a - 3;
		temp = temp * b;
		temp = temp / 2;
		
		z = temp + c;
		
		z = ((a - 3) * b / 2) + c;
		
		System.out.println(z);
	}

}
