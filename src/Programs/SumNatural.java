package Programs;

public class SumNatural {
	public static void main(String[] args) {
		int num = 10, count = 1, total=0;
		while(count<=num) {
			total = total + count;
			count++;
		}
		System.out.println("sum: "+total);
	}

}
