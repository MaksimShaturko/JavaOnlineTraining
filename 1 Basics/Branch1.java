package by.jonline.module01.tasks;

// ���� ��� ���� ������������ (� ��������). ����������, ���������� �� ����� 
// �����������, � ���� ��, �� ����� �� �� �������������

public class Branch1 {

	public static void main(String[] args) {

		// ���� ������������
		double alfa;
		double beta;

		double gamma; // ����������� ����

		alfa = 80;
		beta = 10;

		// ����� ����� ������������ ����� 180
		// ���� alfa + beta < 180, �� ����� ����������� ����������
		// ������� ������ ���� � ��������� ��� ���� �� ��������� 90 ��������

		if ((alfa + beta) < 180 && alfa > 0 && beta > 0) {

			gamma = 180 - alfa - beta;

			System.out.println("����������� ����������, ��� ���� �����: \n" + alfa + "\n" + beta + "\n" + gamma);
			if (alfa == 90 || beta == 90 || gamma == 90) {
				System.out.println("����� ����������� �������������");
			} else {
				System.out.println("����������� �� �������������");
			}
		} else {
			System.out.println("����������� � ������ ������ �� ����������");
		}

	}

}
