package by.jonline.module01.tasks;

// ������ ������� A � B �������������� ��������� � ������� x, y, z �������.
// ������� �� ������ � ���������

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

		// ���� ����� ������

		System.out.println("������� ������� �������������� ���������");

		System.out.println("������� A >> ");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("������� ������������ �����! ��� ��� >> ");
		}
		a = sc.nextDouble();
		sc.nextLine();

		System.out.println("������� B >> ");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("������� ������������ �����! ��� ��� >> ");
		}
		b = sc.nextDouble();
		sc.nextLine();

		System.out.println("������� ������ ������� ������� >> ");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("������� ������������ �����! ��� ��� >> ");
		}
		x = sc.nextDouble();
		sc.nextLine();

		System.out.println("������� ������ ������� ������� >> ");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("������� ������������ �����! ��� ��� >> ");
		}
		y = sc.nextDouble();
		sc.nextLine();

		System.out.println("������� ������ ������� ������� >> ");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("������� ������������ �����! ��� ��� >> ");
		}
		z = sc.nextDouble();
		sc.nextLine();

		// ����� ����� ����� ������

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
			System.out.println("������ �������� � ���������");
		} else {
			System.out.println("������ �� �������� � ���������");
		}

	}

}
