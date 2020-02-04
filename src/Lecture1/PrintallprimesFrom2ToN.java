package Lecture1;

public class PrintallprimesFrom2ToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=50;
       //Print primes from 2 to 50.
       
       int num=2;
       while(num<=n) {
    	   int divisor=2;
    	   boolean flag=true; //It is already prime
    	   while(divisor<num) {
    		   if(num%divisor==0) {
    			   flag=false;
    			   break;
    		   }
    		   divisor++;
    	   }
    	   if(flag==true) {
    		   System.out.println(num);
    	   }
    	   
    	   num++;
       }
       
	}

}
