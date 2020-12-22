package queue.linkedlist;

public class Queue 
{
	private Node front;
	private Node rear;

	LinkedList list = new LinkedList();

	public Queue() 
	{
		this.front = null;
		this.rear = null;
	}

	public boolean isEmpty() 
	{
		return (front == null && rear == null) || front == null ;
	}

	public boolean insertQueue(int data)
	{
		if (front == null && rear == null && front == rear)
		{
			front=rear = list.insert(data, rear);
			return true;
		} 	
		rear = list.insert(data, rear);
		return (front != rear) ? true : false;
	}

	public int deleteQueue() 
	{
		if (isEmpty())
			return -999;
		int frontData = front.getData();
		front=list.delete(front);
		return frontData;

	}

	public void display() 
	{
		if (isEmpty())
			System.out.println("Empty::");
		Node temp = front;
		do
		{
			System.out.println(temp.getData());
			temp = temp.getNext();
		}while (temp != rear.getNext()) ;

	}
}
