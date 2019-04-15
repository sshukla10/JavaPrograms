package Programs;

import java.util.Scanner;
import java.util.Stack;

public class StackPalindrome {

	public static void main(String[] args) {
		String rev = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		
		Stack stack = new Stack();
		for(int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}
		
		while(!stack.isEmpty()) {
			rev = rev + stack.pop();
		}
		
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

		

	}

}
