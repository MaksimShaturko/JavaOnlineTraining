package by.jonline.module01.tasks;

import java.util.Scanner;

/*Для каждого натурального числа в промежутке от m до n вывести
 * все делители, кроме единицы и самого числа.
 * m и n вводятся с клавиатуры
 */

public class Cycle7 {

	public static void main(String[] args) {

		int m;
		int n;

		m = enterN("Введите m >> ");
		n = enterN("Введите n >> ");

		if (m < n) {
			for (int i = m; i <= n; i++) {
				divisor(i);
			}
		} else {
			for (int i = n; i <= m; i++) {
				divisor(i);
			}
		}

	}

	public static void divisor(int x) {
		System.out.print("Делитель числа " + x + ": ");

		int n = 0;
		for (int i = 2; i < x; i++) {

			if (x % i == 0) {
				System.out.print(i + " | ");
				n = n + 1;
			}

		}
		if (n == 0) {
			System.out.print("отсутствует");

		}
		System.out.println();

	}

	public static int enterN(String s) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int t;

		System.out.println(s);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Введите еще раз >> ");
		}
		t = sc.nextInt();

		return t;
	}

}
