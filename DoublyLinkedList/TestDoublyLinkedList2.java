package linkedlist;

public class TestDoublyLinkedList2 {
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insert(10);
		dll.insert(20);
		dll.insert(30);
		dll.insert(40);
		dll.display();
		dll.insertAtPosition(50, 5);
		System.out.println();
		dll.display();
		dll.insertAtPosition(40, 3);
		System.out.println();
		dll.display();
		dll.deleteOfPosition(3);
		System.out.println();
		dll.display();
		dll.deleteOfPosition(1);
		System.out.println();
		dll.display();
		// System.out.println("\n"+dll.getHead().getData());
		boolean b = dll.deleteOnBasisOfData(60);
		System.out.println();
		dll.display();
		boolean b1 = dll.deleteOnBasisOfData(20);
		System.out.println();
		dll.display();
		dll.insert(10);
		dll.insert(20);
		dll.insert(30);
		dll.insert(40);
		System.out.println();
		dll.display();

		dll.displayRev();
		dll.display();
		dll.displayRev(dll.getHead());

		System.out.println("Last");
		System.out.println(dll.DisplayReverse());

		//dll.display();
		
		System.out.println();
		dll.reverse();
		//dll.display();
		

	}

}
