package Lecture8;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         int[] myarr=takeInput();
//         display(myarr);

		// int[] arr= {30,20,50,15,46};
		// System.out.println(max(arr));
		// System.out.println(Integer.MIN_VALUE);
		// System.out.println(linearSearch(arr, 100));

		int[] arr = { 60, 50, 40, 30, 20, 10 };
		// System.out.println(binarySearch(arr, 25));
		// System.out.println(sum(arr));
		// reverse(arr);
		// display(arr);

		// bubbleSort(arr);
		//selectionSort(arr);
		//insertionSort(arr);
		Arrays.sort(arr);
		display(arr);
		
		System.out.println();
		int a=10;
		
		int b=--a;
		
		System.out.println(a);
		System.out.println(b);
		
		
		
		
	}

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = s.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		return arr;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int max(int[] arr) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}

	public static int linearSearch(int[] arr, int data) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == data) {
				return i;
			}
		}

		return -1;
	}

	public static int binarySearch(int[] arr, int data) {
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == data) {
				return mid;
			} else if (arr[mid] > data) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return -1;
	}

	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		return sum;
	}

	public static void reverse(int[] arr) {

		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			swap(arr, left, right);
			left++;
			right--;
		}

	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void bubbleSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}
	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}

			}

			swap(arr, min, i);
		}
	}

	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
				swap(arr, j, j - 1);
			}
		}
	}
}
