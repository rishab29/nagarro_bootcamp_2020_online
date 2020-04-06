package Lecture22.story_queue;

public class QueueUsingArrays {
	protected int[] data;
	protected int front;
	protected int size;
	
	public static final int DEFAULT_CAPAPCITY = 10;
	
	public QueueUsingArrays() throws Exception {
		this(DEFAULT_CAPAPCITY);
	}
	
	public QueueUsingArrays(int capacity) throws Exception {
		if(capacity <= 0){
			throw new Exception("Invalid capacity");
		}
		
		this.data = new int[capacity];
		this.front = 0;
		this.size = 0;
	}
	
	public int size(){
		return this.size;
	}
	
	public boolean isEmpty(){
		return this.size() == 0;
	}
	
	public void enqueue(int item) throws Exception{
		if(this.size() == this.data.length){
			throw new Exception("Queue is full");
		}
		
		int ai = (this.front + this.size) % this.data.length;
		this.data[ai] = item;
		this.size++;
	}
	
	public int dequeue() throws Exception {
		if(this.isEmpty()){
			throw new Exception("Queue is empty");
		}
		
		int retVal = this.data[this.front];
		
		this.data[this.front] = 0;
		this.front = (this.front + 1) % this.data.length;
		this.size--;
		
		return retVal;
	}
	
	public int front() throws Exception{
		if(this.isEmpty()){
			throw new Exception("Queue is empty");
		}
		
		int retVal = this.data[this.front];
		return retVal;
	}
	
	public void display(){
		System.out.println(this);
	}
	
	@Override
	public String toString(){
		String retVal = "";
		
		for(int i = 0; i < this.size(); i++){
			int ai = (this.front + i) % this.data.length;
			retVal += this.data[ai] + " <= ";
		}
		
		retVal += "END\n";
		
		return retVal;
	}
}
