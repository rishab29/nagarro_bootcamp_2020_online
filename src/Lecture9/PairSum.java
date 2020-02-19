package Lecture9;

import java.util.Arrays;

public class PairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {3,5,1,4,6,7};
        int sum=10;
        Arrays.sort(arr);
        
        int left=0,right=arr.length-1;
        while(left<right) {
        	if(arr[left]+arr[right]==sum) {
        		System.out.println(arr[left]+" and "+arr[right]);
        		left++;
        		right--;
        	}else if(arr[left]+arr[right]<sum) {
        		left++;
        	}else {
        		right--;
        	}
        }
	}

}
