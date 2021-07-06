import java.util.Scanner;

// Для данной области составить линейную программу, которая печатает true, 
// если точка с координатами (x, y) принадлежит закрашенной области и 
// false в противном случае

public class Linear6 {

	public static void main(String[] args) {

		int x = enterN("Ââåäèòå x >> ");
		int y = enterN("Ââåäèòå y >> ");

		checkB(x, y);
		checkC(x, y);

	}

	public static int enterN(String s) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int t;

		System.out.println(s);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Ââåäèòå åùå ðàç >> ");
		}
		t = sc.nextInt();

		return t;
	}
	
	// метод checkB проверяет принадлежит ли точка области b) в задаче

	public static void checkB(int a, int b) {

		boolean check = false;

		if (b > 0 & b <= 4 & a >= -2 & a <= 2) {
			check = true;
		}
		if (b <= 0 & b >= -3 & a >= -4 & a < 4) {
			check = true;
		}
		System.out.println(check);
	}

	// метод checkC проверяет принадлежит ли точка области b) в задаче

	public static void checkC(int a, int b) {

		boolean check = false;

		if (a > 0 & a <= 5 & b <= 0 & b >= -5 & (a * a + b * b) <= 5 * 5) {
			check = true;
		}
		if (a > 0 & a <= 4 & b > 0 & b <= 4 & (a * a + b * b) <= 4 * 4) {
			check = true;
		}
		System.out.println(check);
	}

}
