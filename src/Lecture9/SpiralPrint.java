package Lecture9;

public class SpiralPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{11,12,13,14},
				       {21,22,23,24},
				       {31,32,33,34},
				       {41,42,43,44}};
		spiralPrint(arr);
	}

	public static void spiralPrint(int[][] arr) {
       int left=0,right=arr[0].length-1;
       int top=0,bottom=arr.length-1;
       int count=(bottom+1)*(right+1);
       int dir=1;
       
       while (left <= right && top <= bottom) {
			if (count > 0) {
				if (dir == 1) {
					for (int i = left; i <= right; i++) {
						System.out.print(arr[top][i] + " ");
					}
				}
				top++;
				dir = 2;
			}

			if (count > 0) {
				if (dir == 2) {
					for (int i = top; i <= bottom; i++) {
						System.out.print(arr[i][right] + " ");
						count--;
					}
					dir = 3;
					right--;
				}
			}

			if (count > 0) {
				if (dir == 3) {
					for (int i = right; i >= left; i--) {
						System.out.print(arr[bottom][i] + " ");
						count--;
					}
					dir = 4;
					bottom--;
				}
			}

			if (count > 0) {
				if (dir == 4) {
					for (int i = bottom; i >= top; i--) {
						System.out.print(arr[i][left] + " ");
						count--;
					}
					dir = 1;
					left++;
				}
			}
		}
	}

}
