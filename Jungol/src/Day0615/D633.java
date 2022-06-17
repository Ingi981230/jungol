package Day0615;

import java.util.Scanner;

public class D633 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (;;) {
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.print("number? ");
			int a = s.nextInt();

			if (a == 1) {
				System.out.println();
				System.out.println("Seoul");
				System.out.println();
			} else if (a == 2) {
				System.out.println();
				System.out.println("Washington");
				System.out.println();
			} else if (a == 3) {
				System.out.println();
				System.out.println("Tokyo");
				System.out.println();
			} else if (a == 4) {
				System.out.println();
				System.out.println("Beijing");
				System.out.println();
			} else {
				System.out.println();
				System.out.println("none");
				System.out.println();
				break;
			}
		}

	}

}
