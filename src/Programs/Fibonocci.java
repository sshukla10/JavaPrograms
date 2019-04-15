package Programs;

import java.util.Scanner;

public class Fibonocci {

	public static void main(String[] args) {
		int length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Fibonocci series.");
		length = sc.nextInt();
		int[] arr = new int[length];
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i=2; i<length; i++) {
			arr[i] = arr[i-2]+arr[i-1];
		}
		System.out.println("Fibonocci series: ");
		
		for(int i=0; i<length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
