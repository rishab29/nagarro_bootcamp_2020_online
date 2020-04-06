package Lecture22.q2;

import Lecture22.story_dynamic_queue.DynamicQueue;

public class PushEfficientSUQ {
	DynamicQueue qPrimary;
	DynamicQueue qSecondary;

	public PushEfficientSUQ() throws Exception {
		this.qPrimary = new DynamicQueue();
		this.qSecondary = new DynamicQueue();
	}

	public int size() {
		return this.qPrimary.size();
	}

	public boolean isEmpty() {
		int currentSize = this.size();

		if (currentSize == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void push(int item) throws Exception {
		this.qPrimary.enqueue(item);
	}

	public int pop() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Stack is empty!");
		}

		while (this.qPrimary.size() != 1) {
			int data = this.qPrimary.dequeue();
			this.qSecondary.enqueue(data);
		}

		int retVal = this.qPrimary.dequeue();

		while (!this.qSecondary.isEmpty()) {
			int data = this.qSecondary.dequeue();
			this.qPrimary.enqueue(data);
		}

		return retVal;
	}

	public int top() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Stack is empty!");
		}

		while (this.qPrimary.size() != 1) {
			int data = this.qPrimary.dequeue();
			this.qSecondary.enqueue(data);
		}

		int retVal = this.qPrimary.dequeue();
		this.qSecondary.enqueue(retVal);

		while (!this.qSecondary.isEmpty()) {
			int data = this.qSecondary.dequeue();
			this.qPrimary.enqueue(data);
		}

		return retVal;
	}

	public void display() throws Exception {
		reverse(this.qPrimary);
		this.qPrimary.display();
		reverse(this.qPrimary);
	}

	private static void reverse(DynamicQueue queue) throws Exception {
		if (queue.isEmpty()) {
			return;
		}

		int item = queue.dequeue();
		reverse(queue);
		queue.enqueue(item);
	}
}
