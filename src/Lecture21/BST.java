package Lecture21;

import Lecture19.BT.LinkedList;
import Lecture19.BT.LinkedList.Node;

public class BST {
	private class Node {
		int data;
		Node left;
		Node right;

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}

	}

	Node root;
	int size;

	BST() {
		this.root = null;
		this.size = 0;
	}

	public void add(int data) {
		if (this.root == null) {
			this.root = new Node(data, null, null);
			this.size++;
		} else {
			this.add(this.root, data);
		}
	}

	private void add(Node node, int data) {
		if (data < node.data) {
			if (node.left != null) {
				this.add(node.left, data);
			} else {
				node.left = new Node(data, null, null);
				this.size++;
			}
		} else if (data > node.data) {
			if (node.right != null) {
				this.add(node.right, data);
			} else {
				node.right = new Node(data, null, null);
				this.size++;
			}
		} else {

		}
	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		if (node.left != null) {
			System.out.print(node.left.data + "=>");
		} else {
			System.out.print("END=>");
		}

		System.out.print(node.data);

		if (node.right != null) {
			System.out.print("<=" + node.right.data);
		} else {
			System.out.print("<=END");
		}

		System.out.println();

		if (node.left != null) {
			this.display(node.left);
		}

		if (node.right != null) {
			this.display(node.right);
		}

	}

	public boolean isBalanced() {
		return this.isBalanced(this.root).isbalanced;
	}

	private Pair isBalanced(Node node) {
		if (node == null) {
			Pair bp = new Pair();
			bp.height = -1;
			bp.isbalanced = true;
			return bp;
		}

		Pair lp = this.isBalanced(node.left);
		Pair rp = this.isBalanced(node.right);

		Pair mp = new Pair();
		mp.height = Math.max(lp.height, rp.height) + 1;

		if (Math.abs(lp.height - rp.height) <= 1 && lp.isbalanced && rp.isbalanced) {
			mp.isbalanced = true;
		} else {
			mp.isbalanced = false;
		}

		return mp;

	}

	public class Pair {
		int height;
		boolean isbalanced;
	}

	public BST(int[] arr) {
		this.root = this.construct(arr, 0, arr.length - 1);
	}

	private Node construct(int[] arr, int si, int li) {
		if (si > li) {
			return null;
		}
		int mid = (si + li) / 2;
		Node node = new Node(arr[mid], null, null);
		this.size++;

		node.left = this.construct(arr, si, mid - 1);
		node.right = this.construct(arr, mid + 1, li);
		return node;
	}
	
	public LinkedList bstToll() {
		return this.bstToll(this.root);
	}

	private LinkedList bstToll(Node node) {
		LinkedList l = new LinkedList();
		if (node == null) {
			l.head = null;
			l.tail = null;
			return l;
		}

		if (node.left == null && node.right == null) {
			LinkedList.Node n = new LinkedList.Node(node.data, null);
			l.head = n;
			l.tail = n;
		} else if (node.left != null && node.right == null) {
			LinkedList left = this.bstToll(node.left);
			LinkedList.Node n = new LinkedList.Node(node.data, null);

			left.tail.next = n;
			l.head = left.head;
			l.tail = n;
		} else if (node.right != null && node.left == null) {
			LinkedList right = this.bstToll(node.right);
			LinkedList.Node n = new LinkedList.Node(node.data, null);

			n.next = right.head;
			l.head = n;
			l.tail = right.tail;
		} else {

			LinkedList left = this.bstToll(node.left);
			LinkedList right = this.bstToll(node.right);
			LinkedList.Node n = new LinkedList.Node(node.data, null);

			left.tail.next = n;
			n.next = right.head;
			l.head = left.head;
			l.tail = right.tail;

		}

		return l;
	}

	public static class LinkedList {
		public static class Node {
			int data;
			Node next;

			Node(int data, Node next) {
				this.data = data;
				this.next = null;
			}
		}

		public Node head;
		public Node tail;
		public int size;

		public LinkedList() {

		}
		
		public void display() {
			Node temp = this.head;
			while (temp != null) {
				System.out.print(temp.data + "=>");
				temp = temp.next;
			}
			System.out.println("END");
		}

	}


}
