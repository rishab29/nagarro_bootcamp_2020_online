package Lecture22;

import Lecture22.story_dynamic_queue.DynamicQueue;

public class Q3_reverseQueue {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		DynamicQueue q = new DynamicQueue();
		for (int i = 1; i <= 5; i++) {
			q.enqueue(i);
		}
		q.display();
		reverseQueue(q);
		q.display();
	}
	
	public static void reverseQueue(DynamicQueue q) throws Exception {
		if (q.isEmpty()) {
			return;
		}
		int item = q.dequeue();
		reverseQueue(q);
		q.enqueue(item);
	}

}
