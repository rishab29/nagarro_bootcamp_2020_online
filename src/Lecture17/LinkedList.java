package Lecture17;

public class LinkedList {

	private class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	Node head;
	Node tail;
	int size;

	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public LinkedList(Node head, Node tail, int size) {
		this.head = head;
		this.tail = tail;
		this.size = size;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void addFirst(int data) {
		Node node = new Node(data, this.head);
		this.head = node;
		if (this.isEmpty()) {
			this.tail = node;
		}
		this.size++;
	}

	public void addLast(int data) {
		Node node = new Node(data, null);
		if (this.isEmpty()) {
			this.head = node;
			this.tail = node;
		} else {
			this.tail.next = node;
			this.tail = node;
		}

		this.size++;
	}

	private Node getNodeAt(int index) throws Exception {
		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid Index");
		}

		Node temp = this.head;
		int counter = 0;
		while (counter < index) {
			temp = temp.next;
			counter++;
		}

		return temp;
	}

	public void addAt(int index, int data) throws Exception {
		if (index < 0 || index > this.size) {
			throw new Exception("Invalid Index");
		}

		if (index == 0) {
			this.addFirst(data);
		} else if (index == this.size) {
			this.addLast(data);
		} else {
			Node temp = this.getNodeAt(index - 1);
			Node node = new Node(data, temp.next);
			temp.next = node;
			this.size++;
		}
	}

	public int getFirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is Empty");
		}

		return this.head.data;

	}

	public int getLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is Empty");
		}

		return this.tail.data;

	}

	public int getAt(int index) throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is Empty");
		}

		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid index");
		}

		return this.getNodeAt(index).data;

	}

	public int removeFirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		Node t = this.head;
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = this.head.next;
		}

		this.size--;
		return t.data;
	}

	public int removeLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		Node t = this.tail;
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			Node temp = this.getNodeAt(this.size - 2);
			temp.next = null;
			this.tail = temp;
		}

		this.size--;
		return t.data;
	}

	public int removeAt(int index) throws Exception {
		if (this.isEmpty()) {
			throw new Exception("list is Empty");
		}

		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid index");
		}

		if (index == 0) {
			return this.removeFirst();
		} else if (index == this.size - 1) {
			return this.removeLast();
		} else {
			Node temp = this.getNodeAt(index - 1);
			Node t = temp.next;
			temp.next = temp.next.next;
			this.size--;
			return t.data;
		}
	}

	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "=>");
			temp = temp.next;
		}
		System.out.println("END");
	}

	public void reversePR() {
		this.reversePR(this.head);
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;
	}

	private void reversePR(Node node) {
		if (this.tail == node) {
			return;
		}

		reversePR(node.next);
		node.next.next = node;
	}

	public void reversePI() {
		Node prev = this.head;
		Node curr = prev.next;

		while (curr != null) {
			Node tprev = prev;
			Node tcurr = curr;
			prev = curr;
			curr = curr.next;
			tcurr.next = tprev;
		}

		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;
	}

	public void bubbleSort() {

		for (int i = 1; i <= this.size - 1; i++) {
			Node temp = this.head;
			for (int j = 0; j < this.size - i; j++) {
				if (temp.data > temp.next.data) {
					int t = temp.data;
					temp.data = temp.next.data;
					temp.next.data = t;
				}
				temp = temp.next;
			}
		}

	}

	public int mid() {
		return this.getmidnode().data;
	}

	private Node getmidnode() {
		Node slow = this.head;
		Node fast = this.head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}

	public int KthNodeFromEnd(int k) throws Exception {
		Node slow = this.head;
		Node fast = this.head;
		for (int i = 0; i < k; i++) {
			fast = fast.next;
		}

		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}

		return slow.data;
	}

	public void createCycle() {
		this.tail.next = this.head.next.next;
	}

	public boolean detectCycle() {
		Node slow = this.head;
		Node fast = this.head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				return true;
			}
		}

		return false;
	}

	public void breakCycle() {
		Node slow = this.head;
		Node fast = this.head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				break;
			}

		}
		
		slow = this.head;
		Node p = this.head;
		while (p.next != fast) {
			p = p.next;
		}

		while (slow != fast) {
			slow = slow.next;
			p = fast;
			fast = fast.next;
		}
		p.next = null;
	}
	
	public LinkedList merge(LinkedList other) {
		LinkedList retVal = new LinkedList();

		Node thisTemp = this.head, otherTemp = other.head;
		while (thisTemp != null && otherTemp != null) {
			if (thisTemp.data < otherTemp.data) {
				retVal.addLast(thisTemp.data);
				thisTemp = thisTemp.next;
			} else {
				retVal.addLast(otherTemp.data);
				otherTemp = otherTemp.next;
			}
		}

		while (thisTemp != null) {
			retVal.addLast(thisTemp.data);
			thisTemp = thisTemp.next;
		}

		while (otherTemp != null) {
			retVal.addLast(otherTemp.data);
			otherTemp = otherTemp.next;
		}

		return retVal;
	}
	
	public void mergeSort() {
		LinkedList sorted = this.mergeSortHelper();

		this.head = sorted.head;
		this.tail = sorted.tail;
		this.size = sorted.size;
	}

	private LinkedList mergeSortHelper() {
		if (this.size() == 1) {
			return this;
		}

		Node mid = this.getmidnode();
		Node midNext = mid.next;

		mid.next = null;
		LinkedList first = new LinkedList(this.head, mid, (this.size() + 1) / 2);
		LinkedList second = new LinkedList(midNext, this.tail, this.size() / 2);

		first = first.mergeSortHelper();
		second = second.mergeSortHelper();
		LinkedList merged = first.merge(second);
		return merged;
	}


}
