package stackusingarraylist;

import java.util.ArrayList;

public class Stack 
{
	ArrayList<Integer> stack=new ArrayList<Integer>();
	int top;
	
	public Stack() 
	{
		this.top = -1;
		stack.ensureCapacity(2147483647);
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public boolean isFull()
	{
		return top==2147483647-1;
	}
	
	public boolean push(Integer data)
	{
		if(isFull())
			return false;
		stack.add(++top,data);
		return true;
	}
	public long pop()
	{
		if(isEmpty())
			return -(2147483647+1);
		return stack.remove(top--);
	}
	
	public int peek()
	{
		return stack.get(top);
		
	}

	public  int size() 
	{
		
		return stack.size();
	}
	
	public int getTop() {
		return top;
	}

}
