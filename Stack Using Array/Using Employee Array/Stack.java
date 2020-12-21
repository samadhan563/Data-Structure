package stack;

import employee.Employee;

public class Stack 
{
	private int top;
	private int size;
	private Employee[] stack;
	
	public Stack() 
	{
		this.top = -1;
		this.size = size;
		this.stack =new Employee[this.size];
	}
	public Stack(int size) 
	{
		this.top = -1;
		this.size = size;
		this.stack =new Employee[this.size];
	}
	
	boolean isEmpty()
	{
		return top==-1;
	}
	boolean isFull()
	{
		return top == (size-1);
	}
	boolean push(Employee employee)
	{
		if(isFull())
			return false;
		stack[++top]=employee;
		return true;
	}
	Employee pop()
	{
		if(isEmpty())
			return null;
		return stack[top--];
		
	}
	Employee peek()
	{
		if(isEmpty())
			return null;
		return stack[top];
	}
}
