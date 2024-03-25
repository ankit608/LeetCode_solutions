package solution;
import java.util.Scanner;
import java.util.*; 
public class Solution {
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
   public static int[] reverse(int a[], int n) 
		{   int[] array = new int[n];
			int i, t; 
			for (i = 0; i < n ; i++) { 
				t = a[i]; 
				array[n-1-i] = a[i];
			} 

			return array;
		} 
   public static int trap(int[] height) {
       int a = RainTrapping(height);
       int[] height2= reverse(height,height.length);
	    
       for(int z =0; z<height2.length ; z++) {
    	   System.out.print(height2[z]);
    	  
    	   
       }
       System.out.println();
       for(int z =0; z<height2.length ; z++) {
    	
    	   System.out.print(height[z]);
    	   
       }
       if(Arrays.equals(height,height2)){
           return a;
       }
	      int b = RainTrapping(height2);
	  
	      return a+b;
   }
   
   public static void main(String[]args) {
	   int [] arr = new int[]{2,1,0,2};
	   System.out.println(trap(arr));
   }
}
