package Programs;

public class UniqNumber {

	public static void main(String[] args) {
		int arr[] = {2,3,2,3,4,5,4,3};
		
		for(int i=0; i<arr.length; i++) {
			int j;
			for(j=0; j<i; j++) 
				if(arr[i] == arr[j])
					break;
				if(i == j) {
					System.out.print(" "+arr[i]);
				}
			
		}

	}

}
