package by.jonline.module01.tasks;

// Вычислить значения функции на отрезке [a,b] с шагом h
//		/
//		| x, x > 2
// y = 	|
//		| -x, x <= 2
//		\

import java.util.Scanner;

public class Cycle2 {

	public static void main(String[] args) {

		double x;

		double y;

		double a;
		double b;
		double h;

		a = enterN("Введите a >> ");
		// System.out.println(a);
		b = enterN("Введите b >> ");
		// System.out.println(b);
		h = enterN("Введите шаг >> ");

		for (x = a; x <= b; x = x + h) {
			y = func(x);
			System.out.println("При х = " + x + ", y = " + y);
		}

	}

	public static double enterN(String s) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double t;

		System.out.println(s);
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Введите еще раз >> ");
		}
		t = sc.nextDouble();

		return t;
	}

	public static double func(double t) {
		double value;
		if (t > 2) {
			value = t;
		} else {
			value = -t;
		}
		return value;

	}

}
