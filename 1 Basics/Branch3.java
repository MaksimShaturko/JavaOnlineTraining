package by.jonline.module01.tasks;

// Даны три точки А(x1,y1), B(x2,y2) и C(x3,y3). Определить, 
// будут ли они расположены на одной прямой

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

		// Прямая строится через две точки. Берем точку А и В и пишем 
		// уравнение прямой,проходящей через 2 точки
		// (х - х1)/(х2 - х1) = (у - у1)/(у2 - у1)
		// Подставляем х1 х2 у1 у2 и получаем общее уравнение прямой
		// подставляем в него х3 и у3 и проверяем
		// Либо же просто подставляем все три точки

		sc = new Scanner(System.in);

		for (i = 0; i < 6; i++) {
			if (i == 0) {
				System.out.println("Введите х1 >> ");
			}
			if (i == 1) {
				System.out.println("Введите y1 >> ");
			}
			if (i == 2) {
				System.out.println("Введите x2 >> ");
			}
			if (i == 3) {
				System.out.println("Введите y2 >> ");
			}
			if (i == 4) {
				System.out.println("Введите x3 >> ");
			}
			if (i == 5) {
				System.out.println("Введите y3 >> ");
			}
			
				while (!sc.hasNextDouble()) {
					String t = sc.nextLine();
					System.out.println("Введите еще раз >>");
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
		
		// (х3 - х1)/(х2 - х1) = (у3 - у1)/(у2 - у1)
		
		if((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
			System.out.println("Точки лежат на одной прямой");
		} else {
			System.out.println("Точки не лежат на одной прямой");
		}

		// можно проверить. Точки, лежащие на одной прямой:
		// A (0,4) B(-8,0) C(-4,2), еще вариант C(2,5)

	}

}
