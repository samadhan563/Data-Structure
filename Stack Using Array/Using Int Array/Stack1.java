package stack;

public class Stack1 
{
	private int[] stack;
	private int top;
	private int size;
	
	public Stack1(int size) 
	{
		this.size=size;
		this.top=-1;
		this.stack=new int[this.size];
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}

	public boolean isFull()
	{
		return top==size-1;
	}

	public boolean push(int data)
	{
		if(isFull())
			return false;
		stack[++top]=data;
		return true;
	}
	
	public int pop()
	{
		if(isEmpty())
			return -999;
		return stack[top--];
			
	}
	
	public int peek()
	{
		if(isEmpty())
			return -999;
		return stack[top];
	}
	
}
