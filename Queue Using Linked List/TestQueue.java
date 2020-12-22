package queue.linkedlist;

public class TestQueue 
{
	public static void main(String[] args) 
	{
		Queue queue=new Queue();
		System.out.println(queue.isEmpty());

		System.out.println(queue.deleteQueue());
		
		System.out.println(queue.insertQueue(10));
		System.out.println(queue.insertQueue(20));
		System.out.println(queue.insertQueue(30));
		System.out.println(queue.insertQueue(40));
		System.out.println(queue.insertQueue(50));
			
		queue.display();
		System.out.println("Deleting");
		System.out.println(queue.deleteQueue());
		System.out.println(queue.deleteQueue());
		System.out.println(queue.deleteQueue());
		System.out.println(queue.deleteQueue());
		System.out.println(queue.deleteQueue());
		System.out.println(queue.deleteQueue());		
	}
}
/* 
*************Output******************
true
-999
true
true
true
true
true
10
20
30
40
50
Deleting
10
20
30
40
50
-999
*/
