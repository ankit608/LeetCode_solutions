package print_all_factors;

import java.util.Scanner;

public class PrintFactors {
	 public static boolean isPrime(int n) {
			
	    	
	    	for(int i = 2 ; i*i<=n; i++) {
	    		
	    		if(n%i==0) {
	    			return false;
	    		}
	    	}
	    	
	    	
	    	return true;
	    	
	    }

	public static void main(String[]args) {
		 Scanner sc = new Scanner(System.in);
		 int c = sc.nextInt();
		
		
				 
		    for(int i = 2 ; i<=c ;i++) {
		    	
		    boolean Is_prime = isPrime(i);
		  
		    
		    if(Is_prime) {
		    	
		    	while(c%i==0) {
		    		c = c/i;
		    		
		    		System.out.print(i+" ");
		    	}
		    }
		      
		  
		    }
	}
}
