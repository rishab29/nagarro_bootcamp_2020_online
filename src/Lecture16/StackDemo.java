package Lecture16;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Stack<Integer> stack=new Stack<>();
       
       for(int i=1;i<=5;i++) {
    	   stack.push(i*10);
       }
       
       while(!stack.isEmpty()) {
    	   System.out.println(stack.peek());
    	   
       }
	}

}
