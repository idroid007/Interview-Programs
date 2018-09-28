package interview;
/*
 * Remove Duplicate Characters from string using 0n complexity By -Ishu Sharma
 * 
 * we are removing Duplicate characters on the basis of its ascii number.
 */
public class RemoveDuplicatesString0nComplexity {
	
	static String removeDuplicate(String str) {
		boolean[] flag = new boolean[128];
		StringBuilder strbr = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			int ascii = str.charAt(i);
		     if(!(flag[ascii])) {
		    	flag[ascii]=true; 
		    	strbr.append(str.charAt(i));
		     }
		     
		     
		}
		
		return strbr.toString();
	}
	

	public static void main(String[] args) {
	
System.out.println(removeDuplicate("hello how are youuu"));
	}

}
