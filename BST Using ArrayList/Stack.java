package tree;

import java.util.ArrayList;

public class Stack 
{
	private static int top;
	static ArrayList<Node> stack=new ArrayList<Node>(20);
	
	public Stack() 
	{
		this.top=-1;
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public static boolean isFull()
	{
		return top==stack.size()-1;
	}
	
	public static boolean push(Node node)
	{
		if(isFull())
			return false;
	
		stack.add(++top, node);
		return true;
	}
	
	public static Node pop()
	{
		return stack.remove(top--);
	}
	
	public Node peek()
	{
		return stack.get(top);
	}

	public int getTop() 
	{
		return top;
	}

	public void setTop(int top) 
	{
		this.top = top;
	}
	
	public int size() 
	{
		return top;
	}
	
	
}
