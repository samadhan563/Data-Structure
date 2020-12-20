package linkedlist;

import java.nio.charset.IllegalCharsetNameException;

public class DoublyLinkedList {
	private Node head;

	public DoublyLinkedList() {
		this.head = null;
	}

	public boolean insert(int data) {
		Node newNode = new Node(data);
		if (newNode == null)
			return false;
		if (head == null) {
			head = newNode;
			return true;
		}
		Node last = head;
		while (last.getNext() != null) {
			last = last.getNext();
		}
		last.setNext(newNode);
		newNode.setPrev(last);
		return true;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");// +temp.toString()+ " "+temp.getPrev()+" "+temp.getNext());

			temp = temp.getNext();
		}

	}

	public boolean insertAtPosition(int data, int Position) {
		Node newNode = new Node(data);
		if (newNode == null || Position <= 0)
			return false;
		if (Position == 1) {
			if (head != null) {
				newNode.setNext(head);
				head.setPrev(newNode);
			}
			head = newNode;
			return true;
		}
		Node prevNode = head, nextNode;
		for (int i = 1; i < Position - 1; i++) {
			prevNode = prevNode.getNext();
			if (prevNode == null)
				return false;
		}
		nextNode = prevNode.getNext();
		newNode.setPrev(prevNode);
		prevNode.setNext(newNode);
		if (nextNode != null) {
			newNode.setNext(nextNode);
			nextNode.setPrev(newNode);
		}
		return true;

	}

	public boolean deleteOfPosition(int position) 
	{
		if (position <= 0 || head == null)
			return false;
		if (position == 1)
		{
			head = head.getNext();
			if (head != null)
				head.setPrev(null);
			return true;
		}
		Node delNode = head;
		for (int i = 1; i < position; i++) 
		{
			delNode = delNode.getNext();
		}
		delNode.getPrev().setNext(delNode.getNext());
		if (delNode.getNext() != null) 
		{
			delNode.getNext().setPrev(delNode.getPrev());
		}
		return true;
	}

	public Node getHead() {
		return head;
	}

	public boolean deleteOnBasisOfData(int data) {
		if (head == null)
			return false;
		if (head.getData() == data) {
			head = head.getNext();
			head.setPrev(null);
			return true;
		}
		Node delNode = head;
		while (delNode.getData() != data) {
			delNode = delNode.getNext();
			if (delNode == null)
				return false;
		}
		delNode.getPrev().setNext(delNode.getNext());
		if (delNode.getNext() != null) {
			delNode.getNext().setPrev(delNode.getPrev());
		}
		return true;
	}

	public void displayRev() {
		System.out.println();
		Node temp = head;
		Node[] stack = new Node[100];
		int top = -1;
		while (temp != null) {
			stack[++top] = temp;
			temp = temp.getNext();
		}
		while (top != -1) {
			System.out.print(stack[top--].getData() + " ");
		}
		System.out.println();
	}

	public void displayRev(Node node) {
		if (node == null) {
			System.out.println();
			return;
		}
		displayRev(node.getNext());
		System.out.print(node.getData() + " ");
	}

	public Boolean DisplayReverse() 
	{
		
		Node temp=head;
	
		while(temp.getNext() != null)
	        {
	            temp=temp.getNext();      
	        }
		while(temp!=null)
		{
			System.out.print(temp.getData()+" ");
			temp=temp.getPrev();
		}
		
		return true;
	}
	
	public void reverse() 
	{
		Node prev=head;
		Node next=head;
		while(prev.getNext()!=null)
		{
			next=prev.getNext();
			prev.setNext(prev.getPrev());
			prev.setPrev(next);
			prev=next;
		}
		head.setPrev(null);
		prev.setNext(head);
		head.setNext(null);
		head=prev;
	}
	

	
}
	

