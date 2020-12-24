package binarytree.bank;

import bank.BankManagement;

public class Node 
{
	
	private BankManagement data;
	private Node left;
	private Node right;
	
	public Node() 
	{
		
	}

	public Node(BankManagement data) 
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public BankManagement getData()
	{
		return data;
	}

	public void setData(BankManagement data) 
	{
		this.data = data;
	}

	public Node getLeft() 
	{
		return left;
	}

	public void setLeft(Node left) 
	{
		this.left = left;
	}

	public Node getRight() 
	{
		return right;
	}

	public void setRight(Node right)
	{
		this.right = right;
	}
	
	
}
