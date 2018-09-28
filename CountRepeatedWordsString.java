package interview;

import java.util.HashMap;
import java.util.Map;

public class CountRepeatedWordsString {
	  public static void countAndPrintRepeatedWordOccurences(String strContent) {
		  
	        // Step 1: create Map of String-Integer
	        Map<String, Integer> mapOfRepeatedWord = new HashMap<String, Integer>();
	 
	        // Step 2: split line using space as delimiter
	        String[] words = strContent.split(" ");
	 
	        // Step 3: iterate through String[] array
	        for(String word : words) {
	 
	            // Step 4: convert all String into lower case, before comparison
	            String tempUCword = word.toLowerCase();
	 
	            // Step 5: check whether Map contains particular word, already 
	            if(mapOfRepeatedWord.containsKey(tempUCword)){
	 
	                // Step 6: If contains, increase count value by 1
	                mapOfRepeatedWord.put(tempUCword, mapOfRepeatedWord.get(tempUCword) + 1);
	            } 
	            else {
	 
	                // Step 7: otherwise, make a new entry
	                mapOfRepeatedWord.put(tempUCword, 1);
	            }
	        }
	        System.out.println("\t\t word \t\t count");
	        for(String str: mapOfRepeatedWord.keySet()  ) {
	        	System.out.println("\t\t  "+str+"\t\t    "+mapOfRepeatedWord.get(str));
	        }
	 
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
countAndPrintRepeatedWordOccurences("hello hello name is world hi hi");
	}

}
