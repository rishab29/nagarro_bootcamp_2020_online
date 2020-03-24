package Lecture19;

import java.util.Scanner;

public class BT {
    private class Node{
    	int data;
    	Node left;
    	Node right;
    	
    	Node(int data,Node left,Node right){
    		this.data=data;
    		this.left=left;
    		this.right=right;
    	}
    	
    	
    }
    
    private Node root;
    int size;
    
    BT(){
    	Scanner s=new Scanner(System.in);
    	this.root=this.takeInput(s,null,false);  	
    }
    
    private Node takeInput(Scanner s,Node parent,boolean isleftorright) {
    	if(parent==null) {
    		System.out.println("Enter the data for the root node");
    	}else {
    		if(isleftorright) {
    			System.out.println("Enter the data for the left child of "+parent.data);
    		}else {
    			System.out.println("Enter the data for the right child of "+parent.data);

    		}
    	}
    	
    	int data=s.nextInt();
    	Node node=new Node(data, null, null);
    	this.size++;
    	
    	boolean choice=false;
    	System.out.println("Do you have left child for "+node.data);
    	choice=s.nextBoolean();
    	if(choice) {
    		node.left=this.takeInput(s, node, true);
    	}
    	
    	choice=false;
    	System.out.println("Do you have right child for "+node.data);
    	choice=s.nextBoolean();
    	if(choice) {
    		node.right=this.takeInput(s, node, false);
    	}
    	
    	return node;
    }
    
    public void display() {
    	this.display(this.root);
    }
    
    private void display(Node node) {
    	if(node.left!=null) {
    		System.out.print(node.left.data+"=>");
    	}else {
    		System.out.print("END=>");
    	}
    	
    	System.out.print(node.data);
    	
    	if(node.right!=null) {
    		System.out.print("<="+node.right.data);
    	}else {
    		System.out.print("<=END");
    	}
    	
    	System.out.println();
    	
    	if(node.left!=null) {
    		this.display(node.left);
    	}
    	
    	if(node.right!=null) {
    		this.display(node.right);
    	}
    	
    }
    
    public int size2() {
    	return this.size2(this.root);
    }
    
    private int size2(Node node) {
    	if(node==null) {
    		return 0;
    	}
    	
    	int lsize=this.size2(node.left);
    	int rsize=this.size2(node.right);
    	
    	return lsize+rsize+1;
    }
    
    public void preOrder() {
    	this.preOrder(this.root);
    	System.out.println();
    }
    
    private void preOrder(Node node) {
    	if(node==null) {
    		return;
    	}
    	System.out.print(node.data+" ");
    	preOrder(node.left);
    	preOrder(node.right);
    	
    }
    
    public void inOrder() {
    	this.inOrder(this.root);
    	System.out.println();
    }
    
    private void inOrder(Node node) {
    	if(node==null) {
    		return;
    	}
    	
    	inOrder(node.left);
    	System.out.print(node.data+" ");
    	inOrder(node.right);
    	
    }
    
    public void postOrder() {
    	this.postOrder(this.root);
    	System.out.println();
    }
    
    private void postOrder(Node node) {
    	if(node==null) {
    		return;
    	}
    	
    	postOrder(node.left);
    	postOrder(node.right);
    	System.out.print(node.data+" ");  	
    }
    
    public int max() {
    	return this.max(this.root);
    }
    
    private int max(Node node) {
    	if(node==null) {
    		return Integer.MIN_VALUE;
    	}
    	
    	int lmax=this.max(node.left);
    	int rmax=this.max(node.right);
    	
    	return Math.max(node.data, Math.max(lmax, rmax));
    }
    
    
    public int min() {
    	return this.min(this.root);
    }
    
    private int min(Node node) {
    	if(node==null) {
    		return Integer.MAX_VALUE;
    	}
    	
    	int lmin=this.min(node.left);
    	int rmin=this.min(node.right);
    	
    	return Math.min(node.data, Math.min(lmin, rmin));
    }
    
    
}
