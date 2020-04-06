package Lecture22.story_dynamic_stack;

import java.util.Scanner;

import Lecture22.story_stack.StackUsingArrays;


public class DynamicStackClient {

	public static void main(String[] args) throws Exception {
		StackUsingArrays stack = new DynamicStack(5);
		
		Scanner scn = new Scanner(System.in);
		char choice = '\0';
		
		do
		{
			System.out.println("*********************************");
			System.out.println("Menu - ");
			System.out.println("1 for push");
			System.out.println("2 for pop");
			System.out.println("3 for display");
			System.out.println("4 for size");
			System.out.println("5 for empty");
			System.out.println("'N'or 'n' for exit");
			System.out.println("*********************************");
		
			System.out.println("Please make your choice");
			choice = scn.next().charAt(0);
			
			switch(choice){
			case '1':
				System.out.println("Please enter the item to push");
				stack.push(scn.nextInt());
				break;
			case '2':
				System.out.println("Popped value = " + stack.pop());
				break;
			case '3':
				System.out.println("Here is your stack - ");
				stack.display();
				break;
			case '4':
				System.out.println("Size of the stack is = " + stack.size());
				break;
			case '5':
				if(stack.isEmpty()){
					System.out.println("The stack is empty.");
				}
				else {
					System.out.println("The stack has following data.");
					stack.display();
				}
				break;
			case 'N':
			case 'n':
				break;
			default:
				System.out.println("Wrong choice. Try again.");
				break;
			}
		}while(choice != 'N' && choice != 'n');
		
		System.out.println("Thank you");
	}
}
