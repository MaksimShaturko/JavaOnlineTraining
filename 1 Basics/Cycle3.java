package by.jonline.module01.tasks;

import java.util.Scanner;

// ����� ����� ��������� ������ ��� �����

public class Cycle3 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		int x = enterN("������� ������ ����� >> ");
		
		for(int i = x; i <= (x + 100); i++) {
			sum = sum + (int) Math.pow(i, 2);
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
			System.out.println("������� ��� ��� >> ");
		}
		t = sc.nextInt();

		return t;
	}

}
