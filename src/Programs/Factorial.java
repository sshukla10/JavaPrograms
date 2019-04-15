package Programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int num = 4;
		int fact = num;
		for(int i=num-1; i>=1; i--) {
			fact = fact*i;
		}

		System.out.println("Factorial of "+num +": "+fact);
	}

}
