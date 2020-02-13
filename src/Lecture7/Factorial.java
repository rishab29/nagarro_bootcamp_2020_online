package Lecture7;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fact(5));
       
	}
	
	public static int fact(int n) {
		int ans=1;
		while(n>0) {
			ans=ans*n;
			n--;
		}
		
		return ans;
		
	}
	

}
