package Exam1;

import java.util.Scanner;

public class Example1 {

	
	//�ﰢ���� �� �������� ���� ��ǥ�� �Է¹޾� �ﰢ���� �����߽��� �Ǽ� ��ǥ�� ���Ͽ�
	//�Ҽ� ù°�ڸ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
