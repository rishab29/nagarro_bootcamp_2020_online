package Lecture1;

public class CheckWhetherPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=27;      
        int divisor=2;
        while(divisor<n) {
        	if(n%divisor==0) {
        		System.out.println("Not Prime");
        	    return;
        	}
        	divisor++;
        }
        
        System.out.println("Prime");
        
        
	}

}
