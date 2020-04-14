package Lecture19;

import java.util.Scanner;

public class BT {
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

	private Node root;
	int size;

	BT() {
		Scanner s = new Scanner(System.in);
		this.root = this.takeInput(s, null, false);
	}

	private Node takeInput(Scanner s, Node parent, boolean isleftorright) {
		if (parent == null) {
			System.out.println("Enter the data for the root node");
		} else {
			if (isleftorright) {
				System.out.println("Enter the data for the left child of " + parent.data);
			} else {
				System.out.println("Enter the data for the right child of " + parent.data);

			}
		}

		int data = s.nextInt();
		Node node = new Node(data, null, null);
		this.size++;

		boolean choice = false;
		System.out.println("Do you have left child for " + node.data);
		choice = s.nextBoolean();
		if (choice) {
			node.left = this.takeInput(s, node, true);
		}

		choice = false;
		System.out.println("Do you have right child for " + node.data);
		choice = s.nextBoolean();
		if (choice) {
			node.right = this.takeInput(s, node, false);
		}

		return node;
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

	public int size2() {
		return this.size2(this.root);
	}

	private int size2(Node node) {
		if (node == null) {
			return 0;
		}

		int lsize = this.size2(node.left);
		int rsize = this.size2(node.right);

		return lsize + rsize + 1;
	}

	public void preOrder() {
		this.preOrder(this.root);
		System.out.println();
	}

	private void preOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);

	}

	public void inOrder() {
		this.inOrder(this.root);
		System.out.println();
	}

	private void inOrder(Node node) {
		if (node == null) {
			return;
		}

		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);

	}

	public void postOrder() {
		this.postOrder(this.root);
		System.out.println();
	}

	private void postOrder(Node node) {
		if (node == null) {
			return;
		}

		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + " ");
	}

	public int max() {
		return this.max(this.root);
	}

	private int max(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}

		int lmax = this.max(node.left);
		int rmax = this.max(node.right);

		return Math.max(node.data, Math.max(lmax, rmax));
	}

	public int min() {
		return this.min(this.root);
	}

	private int min(Node node) {
		if (node == null) {
			return Integer.MAX_VALUE;
		}

		int lmin = this.min(node.left);
		int rmin = this.min(node.right);

		return Math.min(node.data, Math.min(lmin, rmin));
	}

	public int height() {
		return this.height(this.root);
	}

	private int height(Node node) {
		if (node == null) {
			return -1;
		}

		int lheight = this.height(node.left);
		int rheight = this.height(node.right);

		int myheight = Math.max(lheight, rheight) + 1;
		return myheight;
	}

	public int diameter() {
		return this.diameter(this.root);
	}

	private int diameter(Node node) {
		if (node == null) {
			return 0;
		}
		// diametert passes through root
		int f1 = this.height(node.left) + this.height(node.right) + 2;

		int f2 = this.diameter(node.left);

		int f3 = this.diameter(node.right);

		int myans = Math.max(f1, Math.max(f2, f3));
		return myans;
	}

	public BT(int[] pre, int[] in) {
		this.root = this.construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	private Node construct(int[] pre, int presi, int preei, int[] in, int insi, int inei) {
		if (presi > preei || insi > inei) {
			return null;
		}

		Node node = new Node(pre[presi], null, null);
		this.size++;

		int si = -1;
		for (int i = insi; i <= inei; i++) {
			if (in[i] == node.data) {
				si = i;
				break;
			}
		}

		int lsi = si - insi;

		node.left = this.construct(pre, presi + 1, preei, in, insi, si - 1);
		node.right = this.construct(pre, presi + lsi + 1, preei, in, si + 1, inei);

		return node;
	}

	public boolean isBst() {
		return this.isBst(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean isBst(Node node, int min, int max) {
		if (node == null) {
			return true;
		}
		if (node.data < min || node.data > max) {
			return false;
		} else if (!this.isBst(node.left, min, node.data)) {
			return false;
		} else if (!this.isBst(node.right, node.data, max)) {
			return false;
		} else {
			return true;
		}

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

	}

}
