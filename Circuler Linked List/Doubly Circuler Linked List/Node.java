package doublycirculer.linkedlist;

import employee.Employee;

public class Node 
{
	Employee data;
	Node next;
	Node prev;
	
	public Node(Employee data)
	{
		this.data=data;
		this.next=null;
		this.prev=null;
	}
	
	public Employee getData()
	{
		return data;
	}
	
	public void setData(Employee data) 
	{
		this.data = data;
	}
	
	public Node getNext()
	{
		return next;
	}
	
	public void setNext(Node next) 
	{
		this.next = next;
	}
	
	public Node getPrev() 
	{
		return prev;
	}
	
	public void setPrev(Node prev)
	{
		this.prev = prev;
	}
	
}
