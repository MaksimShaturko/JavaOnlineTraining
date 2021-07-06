package by.jonline.module01.tasks;

import java.util.Scanner;

// Даны два числа. Определить цифры, входящие в запись как первого, так и второго
// числа

public class Cycle8 {

	public static void main(String[] args) {

		int m;
		int n;

		m = enterN("Введите m >> ");
		n = enterN("Введите n >> ");

		digits(m, n);

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

	public static void digits(int x, int y) {

		int[] ostM = new int[10];

		while (x != 0) {
			int ost = x % 10;
			if (ostM[ost] != 1) {
				ostM[ost] = 1;
			}
			x /= 10;
		}

		while (y != 0) {
			int ost = y % 10;
			if (ostM[ost] != 0) {
				ostM[ost] = 2;
			}
			y /= 10;
		}

		System.out.println("Общие цифры: ");

		for (int i = 0; i < 10; i++) {
			if (ostM[i] == 2) {
				System.out.print("[" + i + "] ");
			}
		}

	}
}
