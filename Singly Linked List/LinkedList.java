package linkedlistdemo2;

public class LinkedList 
{
	Node head;

	public LinkedList() 
	{
		this.head=null;
	}

	public boolean insert(int data) 
	{
		Node newNode=new Node(data);
		if (newNode==null)
			return false;
		if(head==null)
		{
			head=newNode;
			return true;
		}
		Node last=head;
		while(last.getNext()!=null)
			last=last.getNext();
		last.setNext(newNode);		
		return true;
	}
	
	public void displayList() 
	{
		Node temp=head;
		while (temp != null)
		{
			System.out.println(temp.getData()+" ");
			temp = temp.getNext();
		}
		
	}

	public boolean insertAtPosition(int data, int position) 
	{
		Node newNode = new Node(data);
		if( newNode==null  )		
			return false;
		if(head == null)
		{
			head=newNode;
			return true;
		}
		if( position == 1 )
		{
			newNode.setNext(head);
			head.setNext(newNode);
			return true;
		}
		Node prev=head;
		for (int i = 1; i < position-1; i++)
		{
			prev=prev.getNext();
			if(prev==newNode)
				return false;
					
		}
		
			newNode.setNext(prev.getNext());
			prev.setNext(newNode);
			
		return true;
	}
}
