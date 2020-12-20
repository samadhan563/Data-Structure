package doublycirculer.linkedlist;

import employee.Employee;

public class TestCirculerDoublyList {

	public static void main(String[] args)
	{
		DoublyLinkedList cdll=new DoublyLinkedList();
		cdll.display();
		
		System.out.println("!!!!---Hello This Singly Circuler Linked List with User defined data type---!!!");
		System.out.println("-------------------------------------------------------------------------------");
		cdll.insert(new Employee(100, "Sama", 21000.10));
		cdll.insert(new Employee(101, "Rohit", 10000.10));
		cdll.insert(new Employee(102, "Vinod", 20000.10));
		cdll.insert(new Employee(103, "Arjun", 30000.10));
		
		System.out.println("ID\t Name\t Salary\t\t Node Address\t Next Node\t Prev Node ");
		cdll.display();	
		System.out.println("-------------------------------------------------------------------------------");
		cdll.insertAtPosition(new Employee(99, "Arti", 30000.10),1);
		System.out.println("ID\t Name\t Salary\t\t Node Address\t Next Node\t Prev Node ");
		cdll.display();	
		
		System.out.println("--------------------------------------------------------------------");
		cdll.insertAtPosition( new Employee(105, "Rashi", 31000.10),3);
		System.out.println("Inserted of  3 position ");
		System.out.println("ID\tName\tSalary\t\tNode Address\tNext Node ");
		cdll.display();
		
		System.out.println("---------------------------------------------------------");
		cdll.insertAtPosition(new Employee(109, "Mahesh", 31000.10),9);
		System.out.println("Inserting of  9 position ");
		System.out.println("ID\tName\tSalary\t\tNode Address\tNext Node ");
		cdll.display();
		
		System.out.println("---------------------------------------------------------");
		cdll.insertAtPosition(new Employee(104, "Vikky", 31000.10),7);
		System.out.println("Inserting of  7 position ");
		System.out.println("ID\tName\tSalary\t\tNode Address\tNext Node ");
		cdll.display();
		
	}

}
