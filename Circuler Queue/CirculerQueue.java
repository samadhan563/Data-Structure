package day5.queue;

public class CirculerQueue 
{
	private int[] queue;
	private int front;
	private int rear;
	private int size;
	char lastOperation='D';
	
	public CirculerQueue() 
	{
		this.queue = new int[5];
		this.front = -1;
		this.rear = -1;
	}
	
	public CirculerQueue(int size) 
	{
		this.size = size;
		this.queue = new int[this.size];
		this.front = -1;
		this.rear = -1;
	}
	
	public boolean  isEmpty()
	{
		return front==rear && lastOperation=='D';
		
	}
	
	public boolean  isFull()
	{
		return (front==-1 && rear==(size-1))||front == rear && lastOperation=='I';		
	}
	
	public boolean insert(int data) 
	{
		if(isFull())
			return false;	
		rear=(rear+1)%size;
		queue[rear]=data;
		lastOperation='I';
		return true;	
	}

	public int delete()
	{
		if(isEmpty())
			return -999;
		front=(front+1)%size;
		lastOperation='D';
		return queue[front];
		
	}

	public void show()
	{
		/*
		if (isEmpty())
			System.out.println("Empty");
		if (rear > front)
		{
			for (int i = front; i < rear; i++) 
			{
				System.out.print(queue[i] + " ");
			}
			return;
		}
		else 
		{
				for (int i = front; i < size - 1; i++) 
				{
					System.out.println(queue[i] + " ");
				}
				for (int i = 0; i < rear - 1; i++) 
				{
					System.out.println(queue[i] + " ");
				}
		}
		*/
		for (int i = front+1; i != rear; i=((i + 1) % size)) 
		{
			
			System.out.print(queue[i] + " ");
		}
		
	}

}
