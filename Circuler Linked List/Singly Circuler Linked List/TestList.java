package singlycirculerlinkedlist;

import employee.Employee;

public class TestList {

	public static void main(String[] args) {
		SinglyCirculerLinkedList scll = new SinglyCirculerLinkedList();
		System.out.println("!!!!---Hello This Singly Circuler Linked List with User defined data type---!!!");
		System.out.println("---------------------------------------------------------");
		scll.insert(new Employee(100, "Sama", 21000.10));
		scll.insert(new Employee(101, "Rohit", 10000.10));
		scll.insert(new Employee(102, "Vinod", 20000.10));
		scll.insert(new Employee(103, "Arjun", 30000.10));
		System.out.println("ID\tName\tSalary\t\tNode Address\tNext Node ");
		scll.display();

		System.out.println("---------------------------------------------------------");
		scll.insertAtPosition(1, (new Employee(99, "Arti", 31000.10)));
		System.out.println("Inserted of  1 position ");
		System.out.println("ID\tName\tSalary\t\tNode Address\tNext Node ");
		scll.display();

		System.out.println("---------------------------------------------------------");
		scll.insertAtPosition(3, new Employee(99, "Rashi", 31000.10));
		System.out.println("Inserted of  3 position ");
		System.out.println("ID\tName\tSalary\t\tNode Address\tNext Node ");
		scll.display();

		System.out.println("---------------------------------------------------------");
		scll.insertAtPosition(9, new Employee(99, "Mahesh", 31000.10));
		System.out.println("Inserting of  9 position ");
		System.out.println("ID\tName\tSalary\t\tNode Address\tNext Node ");
		scll.display();

		System.out.println("---------------------------------------------------------");
		scll.deleteByPosition(1);
		System.out.println("Deleting of  1 position ");
		System.out.println("ID\tName\tSalary\t\tNode Address\tNext Node ");
		scll.display();

		System.out.println("---------------------------------------------------------");
		scll.deleteByPosition(5);
		System.out.println("Deleting of  other than 1 position ");
		System.out.println("ID\tName\tSalary\t\tNode Address\tNext Node ");
		scll.display();

		System.out.println("---------------------------------------------------------");
		scll.deleteByPosition(2);
		System.out.println("Deleting of  other than 1 position ");
		System.out.println("ID\tName\tSalary\t\tNode Address\tNext Node ");
		scll.display();

		System.out.println("---------------------------------------------------------");
		System.out.println("Deleting  head ");
		scll.deleteByData(new Employee(99, "Arti", 31000.10));
		scll.display();

		System.out.println("---------------------------------------------------------");
		System.out.println("Deleting of  other than head ");
		scll.deleteByData(new Employee(99, "Rashi", 31000.10));
		scll.display();

		System.out.println("---------------------------------------------------------");
		System.out.println("Deleting of  other than head and it present at last");
		scll.deleteByData(new Employee(101, "Rohit", 10000.10));
		scll.display();

		System.out.println("---------------------------------------------------------");
		System.out.println("Deleting data which is not present in list");
		scll.deleteByData(new Employee(151, "Rohit", 10000.10));
		scll.display();

		System.out.println("---------------------------------------------------------");
		System.out.println("Reversing List::");
		scll.reverseList();
		scll.display();
	}
}
