package Lecture6;

public class FindSquareRootOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int num=10;
         int p=3;
         
         int increment=1;
         double ans=1;
         
         
         while(ans*ans<=num) {
        	 ans=ans+increment;
         }
         
         ans=ans-increment;
         
         double inc=0.1;
         
         for(int i=0;i<p;i++) {
        	 while(ans*ans<=num) {
        		 ans=ans+inc;
        	 }
        	 
        	 ans=ans-inc;
        	 inc=inc/10;
         }
         
         ans=(int)Math.round(ans*1000);
         ans=ans/1000;
         System.out.println(ans);
         
         
	}

}
