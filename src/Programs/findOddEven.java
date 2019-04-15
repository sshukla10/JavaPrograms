package Programs;

import java.util.Scanner;

public class findOddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size or array");
		int len = sc.nextInt();
		int arr[] = new int[len];
		for(int i=0; i<len; i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<len; i++) {
			if(arr[i]%2==0) {
				System.out.println("even: "+arr[i]);
				break;
			}else{
				System.out.println("Odd");
			}
		}
	}

}
