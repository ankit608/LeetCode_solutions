package Games;

public class game{

	 public static void main(String[]args) throws InterruptedException {
		
		 Thread.sleep(10000);
       play p = new play(2);
       play p1 = new play(3);
       play p3 = new play(4);
       
      p.start();
       p1.start();
       p3.start();
       
       for(int i = 0 ; i<100 ; i++) {
    	   
    	   System.out.println("this is i"+i);
       }
       
	 
	 }     
        
	 
	 }
	 
	
class play extends Thread{
	
	int k = 0;
	play(int a){
		 k =a;
	}
	
	public void run() {
		try {
			sleep((long) (Math.random()*10));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(k);
		k++;
	}
}
