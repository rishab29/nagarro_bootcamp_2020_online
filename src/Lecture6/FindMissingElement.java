package Lecture6;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 5, 5, 4, 6, 4, 6 };
        int ans=0;
        
        for(int i=0;i<arr.length;i++) {
        	ans=ans^arr[i];
        }
        
        System.out.println(ans);
	}

}
