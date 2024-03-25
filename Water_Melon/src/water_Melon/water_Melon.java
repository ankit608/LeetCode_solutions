package water_Melon;

import java.util.Scanner;

public class water_Melon {
	
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

	 public static String IsDivided(int n) {
		 
		 while(n%2==0) {
		   n= n/2;
		    
		   if(n==1) {
			  return "Yes" ; 
		   }
		   }
		 return "false";
	 }
	 
	 public static String IsEven(int n) {
		if(n==2) {
			return "NO";
		}
		 if(n%2==0){
			 return "YES";
		 }else {
			 return "NO";
		 }
	 }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	int input = sc.nextInt();
	boolean[] arr = new boolean[input+2];
	  
	 //System.out.println(IsEven(input));
	 
	 printPath(0,arr);
		
	}
	
}

