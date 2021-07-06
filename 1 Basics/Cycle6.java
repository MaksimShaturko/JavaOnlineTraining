package by.jonline.module01.tasks;

// Вывести на экран соответствий между символами и их численными 
// обозначениями в памяти компьютера (Таблица ASCII)

public class Cycle6 {

	public static void main(String[] args) {

		System.out.println("Dec" + "   " + "Char");
		System.out.println("---" + "   " + "---");

		for (char c = 32; c <= 126; c++) {
			int i = c;
			System.out.println(i + "    " + "'" + c + "'");
		}

	}

}
