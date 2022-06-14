package Day0614;

import java.util.Scanner;

//		Scanner s = new Scanner(System.in);
//		int x1 = s.nextInt();
//		int y1 = s.nextInt();
//		int x2 = s.nextInt();
//		int y2 = s.nextInt();
//		int x3 = s.nextInt();
//		int y3 = s.nextInt();
//		
//		System.out.printf("(%.1f, %.1f)", (double)(x1+x2+x3)/3,(double)(y1+y2+y3)/3);

public class D616 {
	public static void main(String[] args) {

Scanner s = new Scanner(System.in);
int [inp] = new int[6];
for(int i =0; i<inp.length; i++) {
	inp[i] = s.nextInt();
}
s.close();
Triangle tri = new Triangle(inp);

tri.print();
	}
}

class Triangle {
	private Point[] p;

	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		p = new Point[3];
		for(int i =0; j = 0; i<p.length; i++, j+=2) {
			p[i] = new Point(xy[j], xy[j+1]);
		}
		
	}

}

	public void print() {
		for (int i = 0; i < p.length; i++) {
			p[i].print();
		}
	}

	public void getCoG() {
		double cgx = 0.0, cgy = 0.0;

		for (int i = 0; i < p.length; i++) {
			cgx += p[i].getX();
			cgy += ][i].getY();
		}
		System.out.println("(");
	}

class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void print() {
		System.out.println(x+ " ");
	}
}
