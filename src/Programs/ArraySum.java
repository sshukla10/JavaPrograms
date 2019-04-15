package Programs;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array:" );
		int len = sc.nextInt();
		System.out.println("Enter Array");
		int[] arr = new int[len];
		for(int i=0; i<len; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum=0;
		for (int i : arr) {
			sum = sum+i;
		}
		System.out.println("Sum of array: "+sum);

	}

}
