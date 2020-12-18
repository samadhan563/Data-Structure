package linkedlistdemo2;

import java.util.Scanner;

public class DemoListTest2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		boolean exit=false;
		LinkedList ll=new LinkedList();
		do
		{
			System.out.println("Choose Option:: for opration"
					+ "\n1.Insert Sequentially"
					+ "\n2.Insert at position."
					+ "\n3.Delete basis on position."
					+ "\n4.Delete basis on Data"
					+ "\n5.Display."
					+ "\n6.exit");
			
			switch (sc.nextInt()) 
			{
			case 1:
					System.out.println("Enter element::");
					System.out.println(ll.insert(sc.nextInt())?"Inserted":"Not Inserted");
				
				break;
			case 2:
				System.out.println("Enter element and position::");
				System.out.println((ll.insertAtPosition(sc.nextInt(),sc.nextInt())?"Inserted":"Not Inserted"));
			
				break;
			case 3:
				System.out.println("Enter position::");
			//	System.out.println((ll.deleteOfPosition(sc.nextInt())?"Deleted":"Not Deleted"));
			
				break;
			case 4:
				System.out.println("Enter element::");
			//	System.out.println((ll.deleteOnBasisOfData(sc.nextInt())?"Deleted":"Not Deleted"));
			
				break;
			case 5:
				ll.displayList();
				System.out.println();
				break;
			case 6:
				System.out.println("Bye");
				exit=true;
			
				break;
			
	
			default:
					System.out.println("Invalid Choice");
					break;
			}

		}while(!exit);
	}

}
