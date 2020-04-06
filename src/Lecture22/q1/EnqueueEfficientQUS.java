package Lecture22.q1;

import Lecture22.story_dynamic_stack.DynamicStack;

public class EnqueueEfficientQUS {
	private DynamicStack sPrimary;
	private DynamicStack sSecondary;
	
	public EnqueueEfficientQUS() throws Exception {
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
		this.sPrimary.push(item);
	}
	
	public int dequeue() throws Exception {
		if(this.isEmpty()){
			throw new Exception("Queue is empty");
		}
		
		while(this.sPrimary.size() != 1){
			this.sSecondary.push(this.sPrimary.pop());
		}
		
		int rv = this.sPrimary.pop();
		
		while(!this.sSecondary.isEmpty()){
			this.sPrimary.push(this.sSecondary.pop());
		}
		
		return rv;
	}
	
	public int front() throws Exception{
		if(this.isEmpty()){
			throw new Exception("Queue is empty");
		}
		
		while(this.sPrimary.size() != 1){
			this.sSecondary.push(this.sPrimary.pop());
		}
		
		int rv = this.sPrimary.pop();
		this.sSecondary.push(rv);
		
		while(!this.sSecondary.isEmpty()){
			this.sPrimary.push(this.sSecondary.pop());
		}
		
		return rv;
	}
	
	public void display() throws Exception{
		reverse(this.sPrimary, new DynamicStack(), 0);
		this.sPrimary.display();
		reverse(this.sPrimary, new DynamicStack(), 0);
	}
	
	private static void reverse(DynamicStack stack, DynamicStack helper, int idx) throws Exception {
		if(stack.isEmpty()){
			return;
		}
		
		int item = stack.pop();
		reverse(stack, helper, idx + 1);
		
		helper.push(item);
		if(idx == 0){
			while(!helper.isEmpty()){
				stack.push(helper.pop());
			}
		} 
	}
}
