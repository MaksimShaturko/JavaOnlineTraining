package by.jonline.module01.tasks;

// Даны два угла треугольника (в градусах). Определить, существует ли такой 
// треугольник, и если да, то будет ли он прямоугольным

public class Branch1 {

	public static void main(String[] args) {

		// углы треугольника
		double alfa;
		double beta;

		double gamma; // неизвестный угол

		alfa = 80;
		beta = 10;

		// сумма углов треугольника равна 180
		// если alfa + beta < 180, то такой треугольник существует
		// находим третий угол и проверяем все углы на равенство 90 градусам

		if ((alfa + beta) < 180 && alfa > 0 && beta > 0) {

			gamma = 180 - alfa - beta;

			System.out.println("Треугольник существует, его углы равны: \n" + alfa + "\n" + beta + "\n" + gamma);
			if (alfa == 90 || beta == 90 || gamma == 90) {
				System.out.println("Такой треугольник прямоугольный");
			} else {
				System.out.println("Треугольник не прямоугольный");
			}
		} else {
			System.out.println("Треугольник с такими углами не существует");
		}

	}

}
