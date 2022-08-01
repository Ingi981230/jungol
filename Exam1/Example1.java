package Exam1;

import java.util.Scanner;

public class Example1 {

	
	//삼각형의 세 꼭지점의 정수 좌표를 입력받아 삼각형의 무게중심의 실수 좌표를 구하여
	//소수 첫째자리까지 출력하는 프로그램을 작성하시오.
	class Triangle {
		int x1, x2, x3, y1, y2, y3;

		public Triangle(double x1, double x2, double x3, double y1, double y2, double y3) {
			x1 = x1;
			x2 = x2;
			x3 = x3;
			y1 = y1;
			y2 = y2;
			y3 = y3;
		}
	}

	public class Main {

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			double x1, x2, x3, y1, y2, y3;
			
			x1 = s.nextDouble();
			y1 = s.nextDouble();
			x2 = s.nextDouble();
			y2 = s.nextDouble();
			x3 = s.nextDouble();
			y3 = s.nextDouble();
			
			double g = ((x1+x2+x3)/3.0);
			double h = ((y1+y2+y3)/3.0);
			
			System.out.println((String.format("(%.1f",g)+", "+(String.format("%.1f)",h))));
			
			
			
			
			
			

		}
	}

}
