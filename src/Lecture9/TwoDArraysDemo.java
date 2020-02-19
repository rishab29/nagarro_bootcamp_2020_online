package Lecture9;

public class TwoDArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[][] arr;
      // System.out.println(arr);
       
       arr=new int[4][3];
       System.out.println(arr.length);
       System.out.println(arr[0].length);
       display(arr);
       
       arr=new int[3][];
       System.out.println(arr[0]);
       System.out.println(arr);
       
      // arr=new int[][4];
       
       arr[1]=new int[3];
       arr[2]=new int[5];
       arr[0]=new int[2];
       display(arr);
       
	}
	
	public static void display(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
	}
	


}
