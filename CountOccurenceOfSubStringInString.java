package interview;
/*
 * find string occurrence in another string
 */

public class CountOccurenceOfSubStringInString {

	static  int countOccurence(String str,String find) {
		
		
		int lastIndex = 0;
		int count = 0;

		while(lastIndex != -1){

		    lastIndex = str.indexOf(find,lastIndex);

		    if(lastIndex != -1){
		        count ++;
		        lastIndex += find.length();
		    }
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(countOccurence("Mojo jojo & Power puff girls","jo"));
	}

}
