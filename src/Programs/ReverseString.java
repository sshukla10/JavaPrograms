package Programs;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Shubhi";
		char[] arr = s.toCharArray();
		System.out.println(arr);
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(arr[i]);
		}

	}

}
