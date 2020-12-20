package doublycirculer.linkedlist;

import employee.Employee;

public class DoublyLinkedList
{
	Node head;
	
	public DoublyLinkedList() 
	{
		head=null;
	}

	boolean insert(Employee data)
	{
		Node newNode=new Node(data);
		if(newNode==null)	
			return false;
		if(head==null)
		{
			head=newNode;
			head.setNext(head);
			head.setPrev(head);
			return true;
		}
		Node temp=head;
		do
		{
			temp=temp.getNext();
		}while(temp.getNext()!=head);
		newNode.setPrev(temp);
		temp.setNext(newNode);
		newNode.setNext(head);
		head.setPrev(newNode);
		return true;		
	}
	
	boolean insertAtPosition(Employee data , int position)
	{
		Node newNode=new Node(data);
		if( newNode == null || position <=0 )
			return false;
		if(position == 1)
		{
			head.getPrev().setNext(newNode);
			newNode.setPrev(head.getPrev());
			newNode.setNext(head);
			head.setPrev(newNode);
			head=newNode;
			return true;
		}
		Node prev=head;
		for (int i = 1; i < position-1; i++) 
		{
			prev=prev.getNext();
			if(prev==head)
				return false;		
		}
		prev.getNext().setPrev(newNode);
		newNode.setNext(prev.getNext());
		newNode.setPrev(prev);
		prev.setNext(newNode);
		return true;
	}
	
	boolean deleteByPosition(int position)
	{
		return false;
		
	}
	
	void display()
	{
		if(head==null)
			return;
		Node temp=head;
		do 
		{
			System.out.println(temp.getData().getEmpId()+""
					+ "\t "+temp.getData().getEmpName()+""
					+ "\t "+temp.getData().getEmpSalary()+""
					+ "\t "+temp.hashCode()+""
					+ "\t "+temp.getNext().hashCode()+""					
					+ "\t "+temp.getPrev().hashCode());	
			temp=temp.getNext();
		}while(temp!=head);
		System.out.println("Head :: "+head.hashCode());
	}
	
	
}
