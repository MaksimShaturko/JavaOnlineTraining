package by.jonline.module01.tasks;

import java.math.BigInteger;
import java.util.Scanner;

// Произведение квадратов первых двухсот чисел

public class Cycle4 {

	public static void main(String[] args) {

		BigInteger sum = BigInteger.valueOf(1);
		BigInteger a = BigInteger.valueOf(1);

		int x;

		do {
			x = enterN("Введите первое число не равное нулю>> ");
		} while (x == 0);

		for (int i = x; i <= (x + 200); i++) {
			a = BigInteger.valueOf((long) Math.pow(i, 2));
			sum = sum.multiply(a);
			System.out.println(sum);
		}
		System.out.println(sum);

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
