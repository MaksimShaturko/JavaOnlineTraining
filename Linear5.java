package by.jonline.module01.tasks21_25;

// ���� ����������� ����� T, ������� ������������ ������������ ���������� �������
// � ��������. ������� ������ ��������  ������������ � �����, ������� � ��������
// � ��������� �����: ��� ����� SS�

public class Linear5 {

	public static void main(String[] args) {
		
		// ���������� ������� � ��������
		int t = 55399;
		
		// ���������� �����
		int h = t / 3600;
		
		//������� �� �������. ��� �����, �� �������� � ����� ����, ������ 1 ����.
		int ost1 = t % 3600;
		
		// ���������� ����� � ���� �������
		int m = ost1 / 60;
		
		// ���������� ������ ��� ������� � �������� ����� ����� � �����
		int s = t - (h * 3600 + m * 60);
		
		System.out.println("���������� ������� � �������� = " + t);
		System.out.println(h + "� " + m + "��� " + s + "� ");
		

	}

}
