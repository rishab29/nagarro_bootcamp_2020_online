package Lecture9;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr1= {2,5,17};
        
        int[] arr2= {11,13,16,18,0,0,0};
        
        int i=arr1.length-1;
        int j=arr2.length-arr1.length-1;
        int k=arr2.length-1;
        
        while(i>=0&&j>=0) {
        	if(arr1[i]<arr2[j]) {
        		arr2[k]=arr2[j];
        		j--;
        		k--;
        	}else {
        		arr2[k]=arr1[i];
        		i--;
        		k--;
        	}
        }
        
        while(i>=0) {
        	arr2[k]=arr1[i];
    		i--;
    		k--;
        }
        
        while(j>=0) {
        	arr2[k]=arr2[j];
    		j--;
    		k--;
        }
        display(arr2);
        
	}
	
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	
	

}
