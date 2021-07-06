package by.jonline.module01.tasks;

import java.util.Scanner;

// ������������ ������ ����� ����� ������������� �����. ��������� ������� 
// ����� ����� �� 1 �� ���������� �����

public class Cycle1 {

	public static void main(String[] args) {

		int a;

		int sum;

		a = enterNumber();

		sum = sumCalc(a);

		System.out.println("����� = " + sum);
	}

	public static int enterNumber() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int x;

		System.out.println("������� ����� ������������� ����� >> ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("������� ��� ��� >> ");
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
