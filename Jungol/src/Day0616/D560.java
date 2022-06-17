package Day0616;

import java.util.Scanner;

public class D560 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int [] arr =  new int[10];
		for(int i =0; i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		int min = 1000;
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);
		s.close();
	}

}
