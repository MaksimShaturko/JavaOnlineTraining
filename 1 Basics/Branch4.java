package by.jonline.module01.tasks;

// Заданы размеры A и B прямоугольного отверстия и размеры x, y, z кирпича.
// Пройдет ли кирпич в отверстие

import java.util.Scanner;

public class Branch4 {

	@SuppressWarnings("resource")

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double a;
		double b;

		double x;
		double y;
		double z;

		double min;
		double max;

		boolean t = false;

		// БЛОК ВВОДА ДАННЫХ

		System.out.println("Введите размеры прямоугольного отверстия");

		System.out.println("Введите A >> ");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("Введите вещественное число! Еще раз >> ");
		}
		a = sc.nextDouble();
		sc.nextLine();

		System.out.println("Введите B >> ");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("Введите вещественное число! Еще раз >> ");
		}
		b = sc.nextDouble();
		sc.nextLine();

		System.out.println("Введите первую сторону кирпича >> ");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("Введите вещественное число! Еще раз >> ");
		}
		x = sc.nextDouble();
		sc.nextLine();

		System.out.println("Введите вторую сторону кирпича >> ");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("Введите вещественное число! Еще раз >> ");
		}
		y = sc.nextDouble();
		sc.nextLine();

		System.out.println("Введите третью сторону кирпича >> ");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("Введите вещественное число! Еще раз >> ");
		}
		z = sc.nextDouble();
		sc.nextLine();

		// КОНЕЦ БЛОКА ВВОДА ДАННЫХ

		// System.out.println(a);
		// System.out.println(b);
		// System.out.println(x);
		// System.out.println(y);
		// System.out.println(z);

		if (a < b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}

		if (x < min || y < min || z < min) {
			if (x < min) {
				if (z < max || y < max) {
					t = true;
				} else {
					t = false;
				}
			}
			if (y < min) {
				if (x < max || z < max) {
					t = true;
				} else {
					t = false;
				}
			}
			if (z < min) {
				if (x < max || y < max) {
					t = true;
				} else {
					t = false;
				}
			}
		} else {
			t = false;
		}

		if (t) {
			System.out.println("Кирпич проходит в отверстие");
		} else {
			System.out.println("Кирпич не проходит в отверстие");
		}

	}

}
