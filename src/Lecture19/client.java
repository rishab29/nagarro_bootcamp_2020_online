package Lecture19;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 50 true 25 true 12 false false true 39 false false true 75 true 41 false false true 87 false false
        BT tree=new BT();
        tree.display();
        
        System.out.println(tree.size2());
        
        System.out.println();
        tree.preOrder();
        tree.inOrder();
        
        System.out.println(tree.max());
	}

}
