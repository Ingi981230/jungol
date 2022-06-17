package Day0616;

import java.util.Scanner;

public class D153 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int arr[] = new int[100];

		int i = 0;
		do {
			arr[i] = s.nextInt();
		} while (arr[i++] != -1);
		s.close();
		
		if(i-4<0) {
			for(int j =0; j<i-1; j++) {
				System.out.print(arr[j]+" ");
			}
		}else {
			for(int j=i-4; j<i-1;j++) {
				System.out.print(arr[j]+" ");
			}
		}

//		for (int j = i - 4; j < i - 1; j++) {
//			System.out.print(arr[j] + " ");
//		}

	}

}
