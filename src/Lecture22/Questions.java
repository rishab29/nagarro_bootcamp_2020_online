package Lecture22;

import Lecture22.story_dynamic_queue.DynamicQueue;
import Lecture22.story_dynamic_stack.DynamicStack;

public class Questions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicStack stack = new DynamicStack(5);
		for (int i = 1; i <= 5; i++) {
			stack.push(i * 10);
		}

		DynamicStack helper = new DynamicStack(5);

		stack.display();
		reverseStack(stack, helper, 0);
		stack.display();

		DynamicQueue queue = new DynamicQueue(5);
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i * 10);
		}

		queue.display();
		reverseQueue(queue);
		queue.display();

	}

	public static void reverseStack(DynamicStack stack, DynamicStack helper, int idx) throws Exception {
		if (stack.isEmpty()) {
			return;
		}
		int item = stack.pop();
		reverseStack(stack, helper, idx + 1);
		helper.push(item);
		if (idx == 0) {
			while (!helper.isEmpty()) {
				stack.push(helper.pop());
			}
		}
	}

	public static void reverseQueue(DynamicQueue queue) throws Exception {
		if (queue.isEmpty()) {
			return;
		}
		int item = queue.dequeue();
		reverseQueue(queue);
		queue.enqueue(item);
	}
	
	public static boolean isBalanced(String str) throws Exception {
		DynamicStack stack = new DynamicStack();
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			if (cc == '[' || cc == '(' || cc == '{') {
				stack.push(cc);
			} else if (cc == '}') {
				if (stack.isEmpty()) {
					return false;
				} else {
					char tc = (char) stack.top();
					if (tc == '{') {
						stack.pop();
					} else {
						return false;
					}
				}
			} else if (cc == ']') {
				if (stack.isEmpty()) {
					return false;
				} else {
					char tc = (char) stack.top();
					if (tc == '[') {
						stack.pop();
					} else {
						return false;
					}
				}
			} else if (cc == ')') {
				if (stack.isEmpty()) {
					return false;
				} else {
					char tc = (char) stack.top();
					if (tc == '(') {
						stack.pop();
					} else {
						return false;
					}
				}
			} else {

			}
		}
		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

}
