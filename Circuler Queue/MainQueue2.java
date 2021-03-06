package day5.queue;

import java.util.Scanner;

public class MainQueue2 {

	public static void main(String[] args) 
	{
		CirculerQueue queue=new CirculerQueue(10);
		boolean exit=true;
		Scanner scan = new Scanner(System.in);
		while(exit)
		{
			System.out.println("****** OPTIONS *******"
					+ "\n1.Check is Empty."
					+ "\n2.Check is full"
					+ "\n3.Insert"
					+ "\n4.Delete"
					+ "\n5.Display"
					+ "\n6.Exit"
					+ "\n----Select Option----");
			switch (scan.nextInt())
			{
			case 1:
					System.out.println(queue.isEmpty());
					break;
				
			case 2:
					System.out.println(queue.isFull());
					break;
				
			case 3:
					System.out.println("Enter Value");
					System.out.println(queue.insert(scan.nextInt()));
					break;
					
			case 4:
					System.out.println(queue.delete());
					break;
					
			case 5:
					queue.show();
					break;
					
			case 6:
					exit=false;			
					break;
			default:
				
					break;
			}
		}
	}

}

/*Output::
****** OPTIONS *******
1.Check is Empty.
2.Check is full
3.Insert
4.Delete
5.Display
6.Exit
----Select Option----
1
true
****** OPTIONS *******
1.Check is Empty.
2.Check is full
3.Insert
4.Delete
5.Display
6.Exit
----Select Option----
2
false
****** OPTIONS *******
1.Check is Empty.
2.Check is full
3.Insert
4.Delete
5.Display
6.Exit
----Select Option----
3
Enter Value
10
true
****** OPTIONS *******
1.Check is Empty.
2.Check is full
3.Insert
4.Delete
5.Display
6.Exit
----Select Option----
3
Enter Value
20
true
****** OPTIONS *******
1.Check is Empty.
2.Check is full
3.Insert
4.Delete
5.Display
6.Exit
----Select Option----
3
Enter Value
30
true
****** OPTIONS *******
1.Check is Empty.
2.Check is full
3.Insert
4.Delete
5.Display
6.Exit
----Select Option----
3
Enter Value
40
true
****** OPTIONS *******
1.Check is Empty.
2.Check is full
3.Insert
4.Delete
5.Display
6.Exit
----Select Option----
3
Enter Value
50
true
****** OPTIONS *******
1.Check is Empty.
2.Check is full
3.Insert
4.Delete
5.Display
6.Exit
----Select Option----
3
Enter Value
60
true
****** OPTIONS *******
1.Check is Empty.
2.Check is full
3.Insert
4.Delete
5.Display
6.Exit
----Select Option----
3
Enter Value
70
true
****** OPTIONS *******
1.Check is Empty.
2.Check is full
3.Insert
4.Delete
5.Display
6.Exit
----Select Option----
3
Enter Value
80
true
****** OPTIONS *******
1.Check is Empty.
2.Check is full
3.Insert
4.Delete
5.Display
6.Exit
----Select Option----
3
Enter Value
90
true
****** OPTIONS *******
1.Check is Empty.
2.Check is full
3.Insert
4.Delete
5.Display
6.Exit
----Select Option----
3
Enter Value
100
true
****** OPTIONS *******
1.Check is Empty.
2.Check is full
3.Insert
4.Delete
5.Display
6.Exit
----Select Option----
3
Enter Value
110
false
****** OPTIONS *******
1.Check is Empty.
2.Check is full
3.Insert
4.Delete
5.Display
6.Exit
----Select Option----
4
10
****** OPTIONS *******
1.Check is Empty.
2.Check is full
3.Insert
4.Delete
5.Display
6.Exit
----Select Option----
4
20
****** OPTIONS *******
1.Check is Empty.
2.Check is full
3.Insert
4.Delete
5.Display
6.Exit
----Select Option----
4
30
****** OPTIONS *******
1.Check is Empty.
2.Check is full
3.Insert
4.Delete
5.Display
6.Exit
----Select Option----
3
Enter Value
120
true
****** OPTIONS *******
1.Check is Empty.
2.Check is full
3.Insert
4.Delete
5.Display
6.Exit
----Select Option----
130
****** OPTIONS *******
1.Check is Empty.
2.Check is full
3.Insert
4.Delete
5.Display
6.Exit
----Select Option----
3
Enter Value
130
true
****** OPTIONS *******
1.Check is Empty.
2.Check is full
3.Insert
4.Delete
5.Display
6.Exit
----Select Option----
3
Enter Value
140
true
****** OPTIONS *******
1.Check is Empty.
2.Check is full
3.Insert
4.Delete
5.Display
6.Exit
----Select Option----
5
40 50 60 70 80 90 100 120 130 ****** OPTIONS *******
1.Check is Empty.
2.Check is full
3.Insert
4.Delete
5.Display
6.Exit
----Select Option----
6
*/