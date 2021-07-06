package by.jonline.module01.tasks;

// Вычислить значение функции
//			/
//			| x^2 - 3 * x - 9, если x <= 3;
// F(x) = 	|
//			| 1 / (x^3 + 6), если x > 3;
//			\

import java.util.Scanner;

public class Branch5 {

	@SuppressWarnings("resource")

	public static void main(String[] args) {

		double x;
		double fx;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите несколько значений x >> ");

		for (int i = 0; i < 3; i++) {

			if (i == 0) {
				System.out.println("Первое значение x >> ");
			}
			if (i == 1) {
				System.out.println("Второе значение x >> ");
			}
			if (i == 2) {
				System.out.println("Третье значение x >> ");
			}

			while (!sc.hasNextDouble()) {
				sc.nextLine();
				System.out.println("Вы ввели неверное значение. Введите еще раз ВЕЩЕСТВЕННОЕ число >> ");
			}
			x = sc.nextDouble();
			sc.nextLine();

			if (x <= 3) {
				fx = Math.pow(x, 2) - 3 * x + 9;
			} else {
				fx = 1 / (Math.pow(x, 3) + 6);
			}

			System.out.println("Значение функции при х = " + x + " равно = " + fx);

		}

		System.out.println("Программа завершена");

	}

}
