package Lecture7;

public class Ncr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5;
        int r=2;
        
        //compute ncr n!/r!*(n-r)!
        
        int ans=fact(n)/(fact(r)*fact(n-r));
        System.out.println(ans);
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
