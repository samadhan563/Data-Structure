package singlycirculerlinkedlist;

import employee.Employee;

public class SinglyCirculerLinkedList 
{
	Node head;

	public SinglyCirculerLinkedList()
	{
		this.head = null;
	}

	boolean insert(Employee data) 
	{
		Node newNode = new Node(data);
		if (newNode == null)
			return false;
		if (head == null) 
		{
			head = newNode;
			head.setNext(head);
			return true;
		}

		Node temp = head;
		do
		{
			temp = temp.getNext();
		} while (temp != head);
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
		return true;

	}

	boolean insertAtPosition(int position, Employee data) 
	{
		Node newNode = new Node(data);
		if (position <= 0 || newNode == null)
			return false;
		Node temp = head;
		if (position == 1) 
		{
			do 
			{
				temp = temp.getNext();
			} while (temp.getNext() != head);
			temp.setNext(newNode);
			newNode.setNext(head);
			head = newNode;
			return true;
		}
		Node prev = head;
		for (int i = 1; i < position - 1; i++) 
		{
			prev = prev.getNext();
			if (prev == head)
				return false;
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		return true;
	}

	void display() 
	{
		if (head == null)
			return;
		Node temp = head;
		do 
		{
			Employee e = (Employee) temp.getData();
			System.out.println(e.getEmpId() + "\t" + e.getEmpName() + "\t" + e.getEmpSalary() + "\t\t" + temp.hashCode()
					+ "\t" + temp.getNext().hashCode());
			temp = temp.getNext();
		} while (temp != head);
		System.out.println("Current Head ->" + head.hashCode());
	}

	boolean deleteByPosition(int position) 
	{
		if (head == null || position <= 0)
			return true;
		Node prev = head;
		if (position == 1) 
		{
			do 
			{
				prev = prev.getNext();
			} while (prev.getNext() != head);
			prev.setNext(head.getNext());
			head = head.getNext();
			return true;
		}
		
		Node del = prev;
		for (int i = 1; i < position; i++)
		{
			prev = del;
			del = del.getNext();
			if (del == head)
				return false;
		}
		prev.setNext(del.getNext());

		return true;
	}

	boolean deleteByData(Employee data) {
		if (data == null || head == null) {
			return false;
		}
	
		Node last = head;
		if (head.getData().getEmpId() == data.getEmpId() && head.getData().getEmpName().equals(data.getEmpName())) 
		{
			if (head.getNext() == head) 
			{
				head = null;
				return true;
			}
			while (last.getNext() != head) 
			{
				last = last.getNext();
			} 
			last.setNext(head.getNext());
			head = head.getNext();
			return true;
		}
		Node prev,delNode;
		prev=delNode=head;
		while(delNode.getData().getEmpId()!=data.getEmpId())
		{
			prev=delNode;
			delNode=delNode.getNext();
			if(delNode==head)
				return false;
		}
		prev.setNext(delNode.getNext());
		return true;
	}

	boolean reverseList()
	{
		if(head==head.getNext() || head == null)
			return false;
		
		Node node1,node2,node3;
		node1=head;
		node2=head.getNext();
		while(node2!=head)
		{
			node3=node2.getNext();
			node2.setNext(node1);
			node1=node2;
			node2=node3;			
		}
		head.setNext(node1);
		head=node1;
		return true;
	}
	
	public Node getHead() 
	{
		return head;
	}

	public void setHead(Node head) 
	{
		this.head = head;
	}

}
