package Lecture8;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr;
//		// System.out.println(arr);
//
//		arr = new int[5];
//		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		
//		
//		arr[0]=10;
//		arr[1]=20;
//		System.out.println();
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}

		int[] arr = { 10, 20, 30, 40, 50 };
		int i = 0;
		int j = 1;

		System.out.println(arr[i] + " " + arr[j]);
		System.out.println();
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
		swap(arr, i, j);
		System.out.println();
		System.out.println(arr[i] + " " + arr[j]);
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}

	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
