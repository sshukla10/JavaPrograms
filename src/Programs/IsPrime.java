package Programs;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		int num, temp;
		boolean isPrime = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = sc.nextInt();
		
		for(int i=2; i<num/2; i++) {
			temp = num % i;
			if(temp==0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("prime");
		}else {
			System.out.println("Not Prime");
		}

	}

}
