package project;

public class project {
public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		 int [] arr2 = {6,7,8,9,1,16} ;
		
		
		BinarySearch(arr, 5);
		merge(arr,arr2);
		
		
		
	}
	
	 public static void mergeSort(int[] arr) {
		 
		 
		 
	 }
	 
	 public static void merge(int[]arr,int[]arr1) {
		 int [] result = new int[arr.length+arr1.length];
		  int pointer = 0;
		  int k =0;
		  int l =0;
		 
		 for(int i = k ; i<arr.length ; i++) {
			 
			 
			 for(int j = l ;j<arr1.length; j++) {
				 
				 if(arr[i]>arr1[j]) {
					result[pointer] = arr[i]; 
					pointer++;
					k++;
					if(k==arr.length) {
						 
						 for(int p = l ;p<arr1.length;p++) {
							 result[pointer++]= arr1[p];
						 }}
					break;
					 
				 }else {
					 
					 result[pointer] = arr1[j];
					 pointer++;
					 l++;
                       if(l==arr1.length) {
						 
						 for(int p = k ;p<arr.length;p++) {
							 result[pointer++]= arr[p];
						 }
					 }
					 
					 break;
					 
				 }
				 
					 
				 }
				 
			 }
		 for(int i=0;i<result.length;i++) {
			 System.out.println(result[i]);
		 }
			 }
	 public static void BinarySearch(int[] arr,int a) {
			
		   int low = 0;
		   int  high = arr.length;
		    int mid = (low+high)/2;
		    
		    
		    while(low<mid&& mid<high) {
		    	
		    	if(arr[mid]==a) {
		    		
		    	   System.out.println("Found on position"+ mid);
		    	   break;
		    	   
		    	}
		    	
		    	if(a<arr[mid]) {
		    		
		    		high = mid;
		    		mid = (high+low)/2;
		    	}
		    	
		    	if(a>arr[mid]) {
		    		low = mid;
		    		mid  = (high+low)/2;
		    		
		    	
		    	}
		    	
		    	if(mid==low || mid==high) {
		    		if(arr[mid]==a) {
		    			System.out.println("Found on position...." + mid);
		    			break;
		    			
		    		}
		    	}
		    }
		   
		   
		}
	}

	 
		 
		 
		 
		 

	 
	 
	
	