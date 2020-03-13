package Lecture15;

public class StackUsingArraysClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackUsingArrays stack=new StackUsingArrays(5);
        
		for(int i=1;i<=5;i++) {
			stack.push(i*10);
			stack.display();
			System.out.println("**********************");
		}
		
		//stack.push(60);
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
			stack.display();
			System.out.println("**************************");
		}
		
		stack.pop();
		
	}

}
