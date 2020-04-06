package Lecture22.q1;



public class Client {

	public static void main(String[] args) throws Exception {
		DequeueEfficientQUS queue = new DequeueEfficientQUS();
		
		for(int i = 0; i < 5; i++){
			queue.enqueue(i);
			displayQueueStats(queue);
		}
		
		while(!queue.isEmpty()){
			System.out.println(queue.front());
			System.out.println(queue.dequeue());
			displayQueueStats(queue);
		}
		
		
		// Part - Show Exception
//		queue.dequeue();
		
		System.out.println("Thanks for using");
	}
	
	public static void displayQueueStats(DequeueEfficientQUS queue) throws Exception{
		System.out.println("*****************************************");
		queue.display();
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		System.out.println("*****************************************");
	}

}
