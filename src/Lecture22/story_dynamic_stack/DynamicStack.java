package Lecture22.story_dynamic_stack;

import Lecture22.story_stack.StackUsingArrays;

public class DynamicStack extends StackUsingArrays {
	public DynamicStack() throws Exception {
		this(DEFAULT_CAPAPCITY);
	}
	
	public DynamicStack(int capacity) throws Exception {
		super(capacity);
	}
	
	@Override
	public void push(int item) throws Exception{
		if(this.size() == this.data.length){
			int[] temp = new int[2 * this.data.length];
			
			for(int i = 0; i < this.data.length; i++){
				temp[i] = this.data[i];
			}
			
			this.data = temp;
		}
		
		/*this.tos++;
		this.data[this.tos] = item;*/
		super.push(item);
	}
}
