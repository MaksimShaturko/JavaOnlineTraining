package by.jonline.module01.tasks6_10;

// (b + sqrt(b^2 + 4ac))/2a - a^3c + b^-2

public class Linear2 {

	public static void main(String[] args) {

		double b;
		double a;
		double c;

		double sl1; // ������ ���������
		double sl2; // ������ ���������
		double sl3; // ������ ���������

		double znach; // ��������� ���������

		a = 22.3;
		b = 10.4;
		c = 3.0;

		sl1 = Math.sqrt((Math.pow(b, 2) + 4 * a * c));
		sl1 = sl1 + b;
		sl1 = sl1 / (2 * a);

		sl2 = Math.pow(a, 3) * c;

		sl3 = Math.pow(b, -2);

		znach = sl1 + sl2 + sl3;

		System.out.println(sl1 + "; " + sl2 + "; " + sl3 + "; ");

		System.out.println(znach);

	}

}
