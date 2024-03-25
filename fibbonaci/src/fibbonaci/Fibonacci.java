package fibbonaci;

import java.util.Scanner;

public class Fibonacci {
 
   static int arr[] = new int[10];
   
    public static boolean isPrime(int n) {
		
    	
    	for(int i = 2 ; i*i<=n; i++) {
    		
    		if(n%i==0) {
    			return false;
    		}
    	}
    	
    	
    	return true;
    	
    }
   
   public static int fib(int n){
	    
	   if(arr[n]!=0) {
		   return arr[n];
	   }
	    if(n==1||n==0) {
	    	return 1;
	    }
	   
	   int a = fib(n-2)+fib(n-1);
	   arr[n] = a;
	   return a;
   }
   
   public static void main(String args[]){
	   
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
