package Programs;

import java.util.Scanner;

public class PositiveorNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:" );
		int num = sc.nextInt();
		if(num > 0) {
			System.out.println("Positive");
		}else if(num < 0){
			System.out.println("Negative");
		}else {
			System.out.println("Niether negative nor Positive");
		}

	}

}
