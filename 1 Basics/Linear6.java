package by.jonline.module01.tasks26_30;

import java.util.Scanner;

// ��� ������ ������� ��������� �������� ���������, ������� �������� true, 
// ���� ����� � ������������ (x, y) ����������� ����������� ������� � 
// false � ��������� ������

public class Linear6 {

	public static void main(String[] args) {

		int x = enterN("������� x >> ");
		int y = enterN("������� y >> ");

		checkB(x, y);
		checkC(x, y);

	}

	public static int enterN(String s) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int t;

		System.out.println(s);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("������� ��� ��� >> ");
		}
		t = sc.nextInt();

		return t;
	}

	// ����� checkB ��������� ����������� �� ����� ������� b) � ������

	public static void checkB(int a, int b) {

		boolean check = false;

		if (b > 0 & b <= 4 & a >= -2 & a <= 2) {
			check = true;
		}
		if (b <= 0 & b >= -3 & a >= -4 & a < 4) {
			check = true;
		}
		System.out.println(check);
	}

	// ����� checkC ��������� ����������� �� ����� ������� b) � ������

	public static void checkC(int a, int b) {

		boolean check = false;

		if (a > 0 & a <= 5 & b <= 0 & b >= -5 & (a * a + b * b) <= 5 * 5) {
			check = true;
		}
		if (a > 0 & a <= 4 & b > 0 & b <= 4 & (a * a + b * b) <= 4 * 4) {
			check = true;
		}
		System.out.println(check);
	}

}
