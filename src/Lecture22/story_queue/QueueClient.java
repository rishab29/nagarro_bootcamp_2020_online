package Lecture22.story_queue;

public class QueueClient {

	public static void main(String[] args) throws Exception {
		QueueUsingArrays queue = new QueueUsingArrays(5);
		
		for(int i = 0; i < 5; i++){
			queue.enqueue(i);
			displayQueueStats(queue);
		}
		
		while(!queue.isEmpty()){
			System.out.println(queue.front());
			System.out.println(queue.dequeue());
			displayQueueStats(queue);
		}
		
		// Exception Demo
		// queue.dequeue();
		
		System.out.println("Thanks for using");
	}

	public static void displayQueueStats(QueueUsingArrays queue){
		System.out.println("*****************************************");
		queue.display();
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		System.out.println("*****************************************");
	}

}
