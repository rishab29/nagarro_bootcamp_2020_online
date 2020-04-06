package Lecture22.q1;

import Lecture22.story_dynamic_stack.DynamicStack;
import Lecture22.story_stack.*;

public class DequeueEfficientQUS {
	private DynamicStack sPrimary;
	private DynamicStack sSecondary;
	
	public DequeueEfficientQUS() throws Exception {
		this.sPrimary = new DynamicStack();
		this.sSecondary = new DynamicStack();
	}
	
	public int size(){
		return this.sPrimary.size();
	}
	
	public boolean isEmpty(){
		return this.size() == 0;
	}
	
	public void enqueue(int item) throws Exception{
		while(!this.sPrimary.isEmpty()){
			this.sSecondary.push(this.sPrimary.pop());
		}
		
		this.sPrimary.push(item);
		
		while(!this.sSecondary.isEmpty()){
			this.sPrimary.push(this.sSecondary.pop());
		}
	}
	
	public int dequeue() throws Exception {
		if(this.isEmpty()){
			throw new Exception("Queue is empty");
		}
		
		int rv = this.sPrimary.pop();
		return rv;
	}
	
	public int front() throws Exception{
		if(this.isEmpty()){
			throw new Exception("Queue is empty");
		}
		
		int rv = this.sPrimary.top();
		return rv;
	}
	
	public void display() throws Exception{
		this.sPrimary.display();
	}
}
