package by.jonline.module01.tasks21_25;

// ���� �������������� ����� R ���� nnn.ddd (��� �������� ������� � ������� � ����� ������).
// �������� ������� ������� � ����� ����� ����� � ������� ���������� �������� �����

public class Linear4 {
	
	public static void main(String[] args) {
		
		// �������� �����
		double a = 123.456;
		System.out.println("�������� ����� = " + a);
		
		// ����� ����� ��������� �����
		int b = (int) a;
		System.out.println("����� ����� ��������� ����� = " + b);
		
		// ������� ����� ��������� �����
		double c = a - b;
		
		// ������� ����� ��������� ����� � ���� ������ �����
		int d = (int) (c * 1000);
		System.out.println("������� ����� ��������� ����� � ���� ������ ����� = " + d);
		
		//������ ������ �������
		
		// ����� �����, ������������ � �������
		c = b / 1000.0;
		System.out.println("����� ����� ������������ � ������� = " + c);
		
		// �������� �����
		a = d + c;
		System.out.println("�������� ����� = " + a);
		
		
			
			
			
			
		
	}

}
