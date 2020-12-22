package queue.linkedlist;

public class LinkedList
{
	private Node head;

	public LinkedList()
	{
		this.head = null;
	}

	public Node insert(int data, Node rear) 
	{
		Node newNode = new Node(data);
		if (newNode == null)
			return rear;
		if (head == null && rear == null) 
		{
			head = newNode;
			return head;
		}
		rear.setNext(newNode);
		return newNode;
	}

	public Node delete(Node front) 
	{
		if (front == null)
			return null;
		front = front.getNext();
		head = front;
		return head;
	}

	public Node getHead() 
	{
		return head;
	}

}
