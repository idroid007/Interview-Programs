package interview;

public class RunLengthEncoding0nComplexity {

	//	Run Length Encoding
	//	Given an input string, write a function that returns the Run Length Encoded string for the input string.
	//   or write a program to compress the string
	//
	//	For example, if the input string is “aaabbcdd”, then the function should return “a3b2c1d2”.
	//
	//	time: O(n)

	static public String compressString(String s){
		if(s == null || s.length() == 0)    return "";
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
				count++;
				i++;
			}  
			sb.append(s.charAt(i));
			sb.append(count);
			count = 1;
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(compressString("helloooo"));

	}

}
