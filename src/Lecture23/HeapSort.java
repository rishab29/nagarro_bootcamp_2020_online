package Lecture23;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class HeapSort {
	public static void heapSort(ArrayList<Integer> numbers) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		for (int number : numbers) {
			priorityQueue.add(number);
		}

		int i = 0;
		while (!priorityQueue.isEmpty()) {
			int num = priorityQueue.poll();
			numbers.set(i, num);
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		ArrayList<Integer> unsortedNumbers = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			unsortedNumbers.add(s.nextInt());
		}
		heapSort(unsortedNumbers);
		for (int number : unsortedNumbers) {
			System.out.println(number);
		}

	}
}
