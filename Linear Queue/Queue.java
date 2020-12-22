package day5.queue;

public class Queue 
{
	private int[] queue;
	private int front;
	private int rear;
	private int size;
	
	public Queue() 
	{
		this.queue = new int[5] ;
		this.front = -1;
		this.rear = -1;;
	}
	
	public Queue(int size) 
	{
		this.size = size;
		this.queue = new int[this.size] ;
		this.front = -1;
		this.rear = -1;
	}
	
	public boolean isEmpty()
	{
		return front == -1 && rear == -1 ||front >rear;
	}
	
	public boolean isFull()
	{
		return rear==(size-1);
	}
	
	public boolean insert(int data)
	{
		if(isFull())
			return false;
		
		queue[++rear]=data;
		if(front ==-1)
			front=0;
		return true;
		
	}
	
	public int  delete()
	{
		if(isEmpty())
			return -999;
		
		return queue[front++];
	}
	
	public void show()
	{
		if(isEmpty())
			System.out.println("Empty Queue");
		for (int i = front; i < rear; i++) 
		{
			System.out.println(queue[i]+" ");
		}
	}
}
