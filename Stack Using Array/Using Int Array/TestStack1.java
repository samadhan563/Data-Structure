package stack;

public class TestStack1 
{

	public static void main(String[] args)
	{
		Stack1 stack = new Stack1(5);
		System.out.println("Is Empty : " + stack.isEmpty());
		System.out.println("Is Full : " + stack.isFull());
		System.out.println(" Peek "+stack.peek());
		System.out.println();
		System.out.println("Pop : " + ((stack.pop()!=-999) ? " Poped " : " Stack is Empty "));
		System.out.println();
		System.out.println("Push : " + ((stack.push(10)) ? " Pushed " : " Stack is Full "));
		System.out.println("Push : " + ((stack.push(20)) ? " Pushed " : " Stack is Full "));
		System.out.println(" Peek "+stack.peek());
		System.out.println("Push : " + ((stack.push(30)) ? " Pushed " : " Stack is Full "));
		System.out.println("Push : " + ((stack.push(40)) ? " Pushed " : " Stack is Full "));
		System.out.println("Push : " + ((stack.push(50)) ? " Pushed " : " Stack is Full "));
		System.out.println("Push : " + ((stack.push(60)) ? " Pushed " : " Stack is Full "));
		System.out.println(" Peek "+stack.peek());

		System.out.println();
		
		int pop1;
		System.out.println("Pop : " + (((pop1=(stack.pop()))!= -999)? " Poped "+pop1 : " Stack is Empty "));
		System.out.println("Pop : " + (((pop1=(stack.pop()))!= -999)? " Poped "+pop1 : " Stack is Empty "));
		System.out.println("Pop : " + (((pop1=(stack.pop()))!= -999)? " Poped "+pop1 : " Stack is Empty "));
		System.out.println("Pop : " + (((pop1=(stack.pop()))!= -999)? " Poped "+pop1 : " Stack is Empty "));
		System.out.println("Pop : " + (((pop1=(stack.pop()))!= -999)? " Poped "+pop1 : " Stack is Empty "));
		System.out.println("Pop : " + (((pop1=(stack.pop()))!= -999)? " Poped "+pop1 : " Stack is Empty "));		
	}
}
