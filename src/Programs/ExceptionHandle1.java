package Programs;

public class ExceptionHandle1 {

	public static void main(String[] args) {
		int i = 5, j=0;
		try{
			System.out.println(i/j);
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("error Arithmetic");
		}
		catch (Exception e) {
			System.out.println("Main Exception catch");
		}

	}

}
