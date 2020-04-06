package Lecture22.story_stack;

public class StackUsingArraysClient {

	public static void main(String[] args) throws Exception {
		StackUsingArrays stack = new StackUsingArrays(5);
		
		for(int i = 0; i < 5; i++){
			stack.push(i);
			displayStackStats(stack);
		}
		
		while(!stack.isEmpty()){
			System.out.println(stack.top());
			System.out.println(stack.pop());
			displayStackStats(stack);
		}
		
		
		// Part - Show Exception
//		stack.pop();
		
		System.out.println("Thanks for using");
	}
	
	public static void displayStackStats(StackUsingArrays stack){
		System.out.println("*****************************************");
		stack.display();
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println("*****************************************");
	}

}
