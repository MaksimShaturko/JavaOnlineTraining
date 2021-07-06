package by.jonline.module01.tasks;

// ��������� �������� �������
//			/
//			| -x^2 + x - 9, ���� x >= 8;
// F(x) = 	|
//			| 1 / (x^4 - 6), ���� x < 8;
//			\

import java.util.Scanner;

public class Branch5 {
	
	@SuppressWarnings("resource")

	public static void main(String[] args) {
		
		double x;
		double fx;

		Scanner sc = new Scanner(System.in);

		System.out.println("������� ��������� �������� x >> ");

		for (int i = 0; i < 3; i++) {

			if (i == 0) {
				System.out.println("������ �������� x >> ");
			}
			if (i == 1) {
				System.out.println("������ �������� x >> ");
			}
			if (i == 2) {
				System.out.println("������ �������� x >> ");
			}

			while (!sc.hasNextDouble()) {
				sc.nextLine();
				System.out.println("�� ����� �������� ��������. ������� ��� ��� ������������ ����� >> ");
			}
			x = sc.nextDouble();
			sc.nextLine();

			if (x <= 3) {
				fx = Math.pow(x, 2) - 3 * x + 9;
			} else {
				fx = 1 / (Math.pow(x, 3) + 6);
			}

			System.out.println("�������� ������� ��� � = " + x + " ����� = " + fx);

		}
		
		System.out.println("��������� ���������");

	}

}
