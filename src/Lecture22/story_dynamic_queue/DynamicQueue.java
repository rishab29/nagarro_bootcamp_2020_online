package Lecture22.story_dynamic_queue;

import Lecture22.story_queue.QueueUsingArrays;

public class DynamicQueue extends QueueUsingArrays {
	public DynamicQueue() throws Exception {
		this(DEFAULT_CAPAPCITY);
	}
	
	public DynamicQueue(int capacity) throws Exception {
		super(capacity);
	}
	
	@Override
	public void enqueue(int item) throws Exception{
		if(this.size() == this.data.length){
			int[] temp = new int[2 * this.data.length];
			
			for(int i = 0; i < this.size(); i++){
				int ai = (this.front + i) % this.data.length;
				temp[i] = this.data[ai];
			}
			
			this.data = temp;
			this.front = 0;
		}
		
		super.enqueue(item);
	}
}
