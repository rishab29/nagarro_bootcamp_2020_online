package Lecture23;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KLargestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		Scanner s = new Scanner(System.in);
		int count = 0;
		int k = s.nextInt();
		while (true) {
			int n = s.nextInt();
			// Print k largest numbers and terminate
			if (n == -1) {
				printLargestElements(minHeap);
				break;
			} else if (count < k) { // if(entered elements is less than k then add to heap)
				minHeap.add(n);
				count++;
			} else {
				if (minHeap.peek() < n) { // If n is lesser than top element in min heap then ignore
											// else pop top element and push n to heap.
					minHeap.poll();
					minHeap.add(n);
				}
			}
		}

	}

	public static void printLargestElements(PriorityQueue<Integer> minHeap) {

		// O(klogn) extracting k elements from heap
		// minHeap remaining with k largest elements.
		while (!minHeap.isEmpty()) {
			System.out.println(minHeap.poll());
		}
	}

}
