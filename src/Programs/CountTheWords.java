package Programs;

public class CountTheWords {

	public static void main(String[] args) {
		String s = "Hi am  a java programming";
		String[] words = s.trim().split(" ");
		System.out.println("----"+words.length);

	}

}
