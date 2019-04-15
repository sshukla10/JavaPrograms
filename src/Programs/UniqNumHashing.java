package Programs;

import java.util.HashSet;

public class UniqNumHashing {
	public static void main(String[] args) {
		int arr[] = {2,3,4,6,7,7,4,3,4,5,5};
		
		//creates an empty hashset
		HashSet<Integer> set = new HashSet<>();
		
		//traverse the array
		for(int i=0; i<arr.length; i++) {
			//if not present add in set
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
				System.out.print(" "+arr[i]);
			}
		}
	}

}
