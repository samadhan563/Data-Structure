package stackusingarraylist;

public class TestStack
{
	public static void main(String[] args) 
	{
		Stack stack=new Stack();
	
		System.out.println(stack.size());
	
		System.out.println(stack.pop());
		System.out.println(stack.push(100));
		System.out.println(stack.push(200));
		System.out.println(stack.push(300));
		System.out.println(stack.push(400));
		System.out.println(stack.push(500));
		System.out.println(stack.size());
		System.out.println(stack.push(600));
		System.out.println(stack.push(700));
		System.out.println(stack.push(800));
		System.out.println(stack.getTop());
		System.out.println(stack.size());
		
		System.out.println("Peek"+stack.peek());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println("Peek"+stack.peek());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		
		
	}

}
