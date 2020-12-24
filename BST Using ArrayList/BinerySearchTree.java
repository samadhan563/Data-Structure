package tree;

import java.util.ArrayList;
//import java.util.Stack;
public class BinerySearchTree 
{
	private Node root;

	public BinerySearchTree() 
	{
		this.root = null;
	}

	public Node getRoot() 
	{
		return root;
	}

	public void setRoot(Node root)
	{
		this.root = root;
	}
	
	boolean insert(int data)
	{
		Node newNode=new Node(data);
		if(newNode==null)
			return false;
		if(root==null)
		{
			root=newNode;
			return true;
		}
		Node temp=root;
		while(true)
		{
			if (data == temp.getData())
				return false;
			if (temp.getData() > data) 
			{
				if (temp.getLeft() == null) 
				{
					temp.setLeft(newNode);
					return true;
				}
				temp = temp.getLeft();
			} 
			else
			{
				if (temp.getRight() == null) 
				{
					temp.setRight(newNode);
					return true;
				}
				temp = temp.getRight();
			}
		}
		
	}
	
	public void InOrder()
	{
		if(root == null)
			return ;
		Node temp=root;
		ArrayList<Node> stack=new ArrayList<Node>();
		int top=-1;
		
		while (temp != null || top != -1)
		{
			while(temp != null)
			{
				stack.add(++top,temp);
				temp=temp.getLeft();
			}
			temp=stack.remove(top--);
			System.out.print(temp.getData()+" " );
			temp=temp.getRight();
		}	
		System.out.println();
	}
	
	public void preOrder()
	{
		if(root==null)
			return;
		
		Node temp=root;
		ArrayList<Node> stack=new ArrayList<Node>(10);
		int top=-1;
		while( temp != null || top != -1 )
		{
			while( temp != null )
			{
				System.out.print(temp.getData()+" ");
				stack.add(++top,temp);
				temp=temp.getLeft();			
			}
			temp=stack.remove(top--);
			
			temp=temp.getRight();
		}
		System.out.println();
	}
	
	public void postOrder(Node temp)
	{
		if(temp!=null)
		{
			postOrder(temp.getLeft());
			postOrder(temp.getRight());
			System.out.print(temp.getData()+" ");
		}
	}
	
	public void inOrderR(Node temp)
	{
		if(temp!=null)
		{
			inOrderR(temp.getLeft());
			System.out.print(temp.getData()+" ");
			inOrderR(temp.getRight());
		}
	}
	
}



