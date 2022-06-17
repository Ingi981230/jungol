package Day0615;

import java.util.Scanner;

public class P524 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		boolean a = (s.nextInt() != 0);
		boolean b = (s.nextInt() != 0);
		System.out.println((a && b) + " " + (a || b));

	}

}
