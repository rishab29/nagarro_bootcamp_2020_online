package Lecture22.q2;

import Lecture22.story_dynamic_queue.DynamicQueue;

public class PopEfficientSUQ {
	DynamicQueue qPrimary;
	DynamicQueue qSecondary;
	
	public PopEfficientSUQ() throws Exception {
		this.qPrimary = new DynamicQueue();
		this.qSecondary = new DynamicQueue();
	}
	
	public int size(){
		return this.qPrimary.size();
	}
	
	public boolean isEmpty(){
		int currentSize = this.size();
		
		if(currentSize == 0){
			return true;
		}
		else {
			return false;
		}
	}
	
	public void push(int item) throws Exception{
		while(!this.qPrimary.isEmpty()){
			this.qSecondary.enqueue(this.qPrimary.dequeue());
		}
		
		this.qPrimary.enqueue(item);
		
		while(!this.qSecondary.isEmpty()){
			this.qPrimary.enqueue(this.qSecondary.dequeue());
		}
	}
	
	public int pop() throws Exception {
		if(this.isEmpty()){
			throw new Exception("Stack is empty!");
		}

		int retVal = this.qPrimary.dequeue();
		return retVal;
	}
	
	public int top() throws Exception{
		if(this.isEmpty()){
			throw new Exception("Stack is empty!");
		}

		int retVal = this.qPrimary.front();
		return retVal;
	}
	
	public void display() throws Exception{
		this.qPrimary.display();
	}
}
