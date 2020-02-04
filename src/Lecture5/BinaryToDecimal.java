package Lecture5;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=32;
       
       int tenpowers=1;
       int dec=0;
       while(n!=0) {
    	   int rem=n%2;
    	   dec=dec+rem*tenpowers;
    	   tenpowers=tenpowers*10;
    	   n=n/2;
       }
       System.out.println(dec);
	}

}
