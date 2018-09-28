package interview;

import java.util.HashSet;
/*
 * Finding pair elements in an array whose sum = x value
 * x could be anything like 10 or 20
 * 
 */


public class ArrayElementsPairSumWithSameValueOf_X_0n_complexity {
	static void getPairs(int arr[],int sum) 
    {        
        HashSet s = new HashSet(); 
        for (int i=0; i<arr.length; ++i) 
        { 
            int temp = sum-arr[i]; 
  
            // checking for condition 
            if (temp>=0 && s.contains(temp)) 
            { 
                System.out.println("Pair with given sum " + 
                                    sum + " is (" + arr[i] + 
                                    ", "+temp+")"); 
            } 
            s.add(arr[i]); 
        } 
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int A[] = {1, 4, 45, 6, 10, 9}; 
	        int n = 10; 
	        getPairs(A,  n); 
	}

}
