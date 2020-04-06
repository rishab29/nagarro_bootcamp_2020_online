package Lecture22.q2;

public class Client {

	public static void main(String[] args) throws Exception {
		PopEfficientSUQ stack = new PopEfficientSUQ();
		
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
	
	public static void displayStackStats(PopEfficientSUQ stack) throws Exception{
		System.out.println("*****************************************");
		stack.display();
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println("*****************************************");
	}

}
