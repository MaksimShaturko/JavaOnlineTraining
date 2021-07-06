package by.jonline.module01.tasks;

import java.util.Scanner;

// Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда, модуль которых 
// больше либо равен заданному e
// Общий член ряда имеет вид an = (-1)^(n-1) / n
// Числовой ряд: 1 + (-1/2) + 1/3 - 1/4 + 1/5 - 1/6 + 1/7 - 1/8 + 1/9 - 1/10 ...

public class Cycle5 {

	public static void main(String[] args) {

		double e;
		double total;

		do {
			e = enterN("Введите значение e (0 < e < 1) >> ");
		} while (e >= 1 || e <= 0);

		System.out.println(e);

		total = calcSum(e);

		System.out.println(total);

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

	public static double calcSum(double eCalc) {

		double a;
		double sum;

		sum = 0;

		for (int n = 1; n > 0; n++) {
			a = Math.pow(-1, n - 1) / n;
			if (Math.abs(a) >= eCalc) {
				sum = sum + a;
			} else {
				break;
			}
		}
		return sum;
	}
}
