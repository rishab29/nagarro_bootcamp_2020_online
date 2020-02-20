package Lecture10;

public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s1="abc";
         String s2="bca";
         
         int[] arr=new int[27];
         
         for(int i=0;i<s1.length();i++) {
        	 char cc=s1.charAt(i);
        	 arr[cc-96]=arr[cc-96]+1;
         }
         
         
         for(int i=0;i<s2.length();i++) {
        	 char cc=s2.charAt(i);
        	 arr[cc-96]=arr[cc-96]-1;
         }
         
         for(int i=1;i<arr.length;i++) {
        	 if(arr[i]!=0) {
        		 System.out.println("Not Permutation");
        		 return;
        	 }
         }
         
         System.out.println("Permutation");
         
	}

}
