package Day0614;

import java.util.Scanner;

public class P540 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while (true) {
			int num = s.nextInt();
			if (num ==-1)
				break;
			if (num % 3 == 0)
				System.out.println(num / 3);

		}
		s.close();

	}

}
