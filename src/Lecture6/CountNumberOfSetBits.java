package Lecture6;

public class CountNumberOfSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int num=5;
         int mask=1;
         int count=0;
         while(num!=0) {
        	 if((num&mask)!=0) {
        		 count++;
        	 }
        	 num=num>>1;
         }
         
         System.out.println(count);
	}

}
