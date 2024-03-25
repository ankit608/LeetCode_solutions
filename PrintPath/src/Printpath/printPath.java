package Printpath;

import java.util.Scanner;
import java.util.*; 

public class printPath {
	
	// Java Program that reverses array 
	// in less number of swaps 

	

		// function swaps the array's first element with last 
		// element, second element with last second element and 
		// so on 
		public static int[] reverse(int a[], int n) 
		{  int [] array = new int[n];
			int i, t; 
			for (i = 0; i < n ; i++) { 
				t = a[i]; 
				
                 array[n-1-i]= a[i];
                
               
			} 

		    
		     
		     return array;
		} 

	
	
	public static int RainTrapping(int[]arr) {
		  int i = 0;
		    int volume = 0;
		    int bucket = 0;
		    int max = 0;
		    max = arr[i];
		    	for(int j = i+1 ; j<=arr.length-1;j++) {
		    		
		    	 bucket = bucket+arr[j];
		    	    
		    	 if(arr[j]>=max) {
		    		 bucket = bucket-arr[j];
		    		volume = (max)*(j-i-1)-bucket+volume;
		    		if(volume<0) {
		    			volume = 0;
		    		}
		    		i=j;
		    		max = arr[i];
		    		bucket = 0;
		    	 }
		    	
		    	}
		    	
		    
		    
		  return volume;
		
	}

	public static void printPath(int n,boolean[] arr) {
		if(n>9) {
			return;
		}
		if(n<=9) {
			arr[n] = true;
		}
		if(n==9) {
			int i = 0;
			while(i<=n){
				if(arr[i]==true) {
					System.out.print(i);
					
				}
				i++;
				
			}
			System.out.println("");
		}
		
		printPath(n+1,arr);
		arr[n+1]=false;
		printPath(n+2,arr);
		arr[n+2]=false;
		printPath(n+3,arr);
		arr[n+3]=false;
	}
	
	public static void main(String[]args) {
		
		 int [] arr = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
		 int a = RainTrapping(arr);
         int [] arr2= reverse(arr,arr.length);
	      
         int b = RainTrapping(arr2);
        if(Arrays.equals(arr, arr2)) {
        	System.out.print(a);
        }else {
        	System.out.print(a+b);
        }
        
	}
}
