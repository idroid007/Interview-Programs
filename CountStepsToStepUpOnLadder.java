package interview;

/*
 * Q- A child is running up a staircase with n steps and 
 * can hop either 1 step, 2 steps, or 3 steps at a time. Implement a method to count how many possible ways the child can run up the stairs.
 * 
 */

public class CountStepsToStepUpOnLadder {
	 public static int findStep(int n) 
	    { 
	        if (n == 1 || n == 0)  
	            return 1; 
	        else if (n == 2)  
	            return 2; 
	       
	        else
	            return findStep(n - 3) +  
	                   findStep(n - 2) + 
	                   findStep(n - 1);     
	    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int n = 10; 
        System.out.println(findStep(n)); 
	}

}
