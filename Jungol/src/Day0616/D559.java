package Day0616;

import java.util.Scanner;

public class D559 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double []avg = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		int a = s.nextInt();
		int b = s.nextInt();
		double sum = avg[a-1]+avg[b-1];
		System.out.printf("%.1f",sum);
	}

}
