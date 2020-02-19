package Lecture9;

import java.util.Scanner;


public class TwoDArrayOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         int[][] arr=takeInput();
//         display(arr);
		
		int[][] arr= {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
		wavePrint(arr);
	}
	
	public static int[][] takeInput(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows=s.nextInt();
		int[][] arr=new int[rows][];
		for(int row=0;row<rows;row++) {
			System.out.println("Enter the number of columns");
			int cols=s.nextInt();
			arr[row]=new int[cols];
			for(int col=0;col<cols;col++) {
				System.out.println("Enter the element at "+row+" and "+col);
				arr[row][col]=s.nextInt();
			}
		}
		
		return arr;
	}
	
	public static void display(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
	}
	
	public static void wavePrint(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
			}else {
				for(int j=arr[i].length-1;j>=0;j--) {
					System.out.print(arr[i][j]+" ");
				}
			}
		}
		
		System.out.println("END");
	}

}
