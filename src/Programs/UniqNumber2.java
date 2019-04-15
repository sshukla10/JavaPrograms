package Programs;

import java.util.Arrays;

public class UniqNumber2 {

	public static void main(String[] args) {
		int arr[] = {2,3,2,3,4,5,4,3};
		int n = arr.length;
		//Sort the array first so that all occurrences become consecutive
		Arrays.sort(arr);
		
		//traverse the sorted array
		for(int i=0; i<n; i++) {
			//Move the index ahead while there are duplicates
			while(i<n-1 && arr[i]==arr[i+1])
				i++;
			System.out.print(" "+arr[i]);
		}

	}

}
