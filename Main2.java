import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = new int[10];
		int sum = 0;
		int sum2 = 0;
		
		for(int i =0; i<arr.length; i++) {
			arr[i]=s.nextInt();
		}
		
//		0~9
//		È¦¼ö ÀÎµ¦½º 0 2 4 6 8
//		Â¦¼ö ÀÎµ¦½º 1 3 5 7 9
		
		//Â¦¼ö 1 3 5 7 9
		for(int i=1; i<arr.length; i=i+2) {
			sum += arr[i];
		}
		
		for(int i=0; i<arr.length; i=i+2) {
			sum2 += arr[i];
		}
		double avg = (double)sum2 / (arr.length/2);
		
		System.out.println("sum : "+sum);
		System.out.printf("avg : %.1f", avg);
		
		
		
	}
}
