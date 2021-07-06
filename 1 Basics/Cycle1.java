package by.jonline.module01.tasks;

import java.util.Scanner;

// Пользователь вводит любое целое положительное число. Программа считает 
// сумму чисел от 1 до введенного числа

public class Cycle1 {

	public static void main(String[] args) {

		int a;

		int sum;

		a = enterNumber();

		sum = sumCalc(a);

		System.out.println("Сумма = " + sum);
	}

	public static int enterNumber() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int x;

		System.out.println("Введите целое положительное число >> ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Введите еще раз >> ");
		}
		x = sc.nextInt();

		return x;
	}

	public static int sumCalc(int x) {

		int sum;

		sum = 0;

		for (int i = 1; i <= x; i++) {
			sum = sum + i;
		}

		return sum;
	}

}
