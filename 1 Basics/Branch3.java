package by.jonline.module01.tasks;

// ���� ��� ����� �(x1,y1), B(x2,y2) � C(x3,y3). ����������, 
// ����� �� ��� ����������� �� ����� ������

import java.util.Scanner;



public class Branch3 {

	public static void main(String[] args) {
		
		double x1 = 0;
		double y1 = 0;
		double x2 = 0;
		double y2 = 0;
		double x3 = 0;
		double y3 = 0;

		int i;

		Scanner sc = null;

		// ������ �������� ����� ��� �����. ����� ����� � � � � ����� 
		// ��������� ������,���������� ����� 2 �����
		// (� - �1)/(�2 - �1) = (� - �1)/(�2 - �1)
		// ����������� �1 �2 �1 �2 � �������� ����� ��������� ������
		// ����������� � ���� �3 � �3 � ���������
		// ���� �� ������ ����������� ��� ��� �����

		sc = new Scanner(System.in);

		for (i = 0; i < 6; i++) {
			if (i == 0) {
				System.out.println("������� �1 >> ");
			}
			if (i == 1) {
				System.out.println("������� y1 >> ");
			}
			if (i == 2) {
				System.out.println("������� x2 >> ");
			}
			if (i == 3) {
				System.out.println("������� y2 >> ");
			}
			if (i == 4) {
				System.out.println("������� x3 >> ");
			}
			if (i == 5) {
				System.out.println("������� y3 >> ");
			}
			
				while (!sc.hasNextDouble()) {
					String t = sc.nextLine();
					System.out.println("������� ��� ��� >>");
				}
				if (i == 0) {					
					x1 = sc.nextDouble();
					}
				if (i == 1) {					
					y1 = sc.nextDouble();
					}
				if (i == 2) {					
					x2 = sc.nextDouble();
					}
				if (i == 3) {					
					y2 = sc.nextDouble();
					}
				if (i == 4) {					
					x3 = sc.nextDouble();
					}
				if (i == 5) {					
					y3 = sc.nextDouble();
					}
			
			
		}
		
		// (�3 - �1)/(�2 - �1) = (�3 - �1)/(�2 - �1)
		
		if((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
			System.out.println("����� ����� �� ����� ������");
		} else {
			System.out.println("����� �� ����� �� ����� ������");
		}

		// ����� ���������. �����, ������� �� ����� ������:
		// A (0,4) B(-8,0) C(-4,2), ��� ������� C(2,5)

	}

}
