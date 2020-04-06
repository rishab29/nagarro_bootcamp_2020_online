package Lecture21;

import Lecture21.BST.LinkedList;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       BST tree=new BST();
       tree.add(50);
       tree.add(25);
       tree.add(75);
       tree.add(12);
       tree.add(37);
       tree.add(62);
       tree.add(87);
      // tree.add(90);
      // tree.add(100);
      // tree.add(110);
//       
//       
//       tree.display();
//       System.out.println(tree.isBalanced());
	
//       int[] arr= {5,10,15,23,34,45,55,58};
//	   BST tree= new BST(arr);
//	   
//	   tree.display();
	   
	   LinkedList list=tree.bstToll();
	   list.display();
	}

}
