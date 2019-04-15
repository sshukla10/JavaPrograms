package Programs;

public class SearchTextInString {

	public static void main(String[] args) {
	String s = "Hi am shubhi";
	System.out.println(s.contains("am"));
	if(s.indexOf("hffi")>=0) {
		System.out.println("word present");
	}
	System.out.println(s.indexOf("am"));
	}

}
