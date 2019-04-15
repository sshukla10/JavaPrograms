package Programs;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int len = sc.nextInt();
		int arr[] = new int[len];
		System.out.println("Enter those "+len+" elements: ");
		for(int j=0; j<len; j++) {
			arr[j]=sc.nextInt();
		}
		
		System.out.println("Enter key to search: ");
		int key = sc.nextInt();
		
		for(i=0; i<len; i++) {
			if(arr[i]==key) {
				System.out.println("Search complete: "+i+1+"th location");
				break;
			}
		}
		if(i==len) {
			System.out.println("Key did not match!");
		}

	}

}
