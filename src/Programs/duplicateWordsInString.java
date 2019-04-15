package Programs;

import java.util.HashMap;
import java.util.Set;

public class duplicateWordsInString {
	
	static void duplicateWords(String str) {
		//splitting string into words
		String[] words = str.split(" ");
		
		//creating a hashmap with word as key & count as value
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>(); 
		
		//checking each word
		for(String word: words) {
			//whether it is present in wordCount
			if(wordCount.containsKey(word.toLowerCase())) {
				//if it is present. increment its count by 1
				wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase())+1);
               //If it is not present, put that word into wordCount with 1 as it's value
			}else {
				wordCount.put(word.toLowerCase(),1);
			}
			
		}
		//Extracting all keys of wordCount
		 
        Set<String> wordsInString = wordCount.keySet();
 
        //Iterating through all words in wordCount
 
        for (String word : wordsInString)
        {
            //if word count is greater than 1
 
            if(wordCount.get(word) > 1)
            {
                //Printing that word and it's count
 
                System.out.println(word+" : "+wordCount.get(word));
            }
        }
	}

	public static void main(String[] args) {
		 duplicateWords("Bread butter and bread");
		 
	        duplicateWords("Java is java again java");
	 
	        duplicateWords("Super Man Bat Man Spider Man");
	}

}
