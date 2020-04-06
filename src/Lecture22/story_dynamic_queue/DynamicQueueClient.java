package Lecture22.story_dynamic_queue;

import java.util.Scanner;

import Lecture22.story_queue.QueueUsingArrays;



public class DynamicQueueClient {

	public static void main(String[] args) throws Exception {
		QueueUsingArrays queue = new DynamicQueue(5);
		
		Scanner scn = new Scanner(System.in);
		char choice = '\0';
		
		do
		{
			System.out.println("*********************************");
			System.out.println("Menu - ");
			System.out.println("1 for enqueue");
			System.out.println("2 for dequeue");
			System.out.println("3 for display");
			System.out.println("4 for size");
			System.out.println("5 for empty");
			System.out.println("'N'or 'n' for exit");
			System.out.println("*********************************");
		
			System.out.println("Please make your choice");
			choice = scn.next().charAt(0);
			
			switch(choice){
			case '1':
				System.out.println("Please enter the item to enqueue");
				queue.enqueue(scn.nextInt());
				break;
			case '2':
				System.out.println("Dequeued value = " + queue.dequeue());
				break;
			case '3':
				System.out.println("Here is your queue - ");
				queue.display();
				break;
			case '4':
				System.out.println("Size of the queue is = " + queue.size());
				break;
			case '5':
				if(queue.isEmpty()){
					System.out.println("The queue is empty.");
				}
				else {
					System.out.println("The queue has following data.");
					queue.display();
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

	public static void displayQueueStats(QueueUsingArrays queue){
		System.out.println("*****************************************");
		queue.display();
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		System.out.println("*****************************************");
	}
}
