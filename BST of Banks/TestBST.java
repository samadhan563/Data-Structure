package binarytree.bank;

import bank.BankManagement;

public class TestBST {

	public static void main(String[] args) 
	{
		BSTOfBank bst=new BSTOfBank();
		System.out.println(bst.insert(new BankManagement("HDFC Bank", "HDFC20000200", "Kothrud", "Kothrud, Pune")));
		System.out.println(bst.insert(new BankManagement("Bank of Maharashtra", "MAHB20000200", "Kothrud", "Kothrud, Pune")));
		System.out.println(bst.insert(new BankManagement("Bank of Baroda", "BARO20000200", "Kothrud", "Kothrud, Pune")));
		System.out.println(bst.insert(new BankManagement("Bank of India", "BOI020000200", "Satpur", "Satpur, Nashik")));
		System.out.println(bst.insert(new BankManagement("Mahrashtra Gramin Bank", "MAHG20000200", "Malegaon", "Malegaon")));
		System.out.println(bst.insert(new BankManagement("Union Bank", "UNIB20000200", "Kothrud", "Kothrud, Pune")));
		System.out.println(bst.insert(new BankManagement("Fedral Bank ", "FEDR20000200", "Kothrud", "Kothrud, Pune")));
		System.out.println(bst.insert(new BankManagement("Yes Bank", "YESB20000200", "Kothrud", "Kothrud, Pune")));
		System.out.println(bst.insert(new BankManagement("Bank of Maharashtra", "MAHB20000200", "Kothrud", "Kothrud, Pune")));

		System.out.println("\nInOrder");
		bst.display(bst.getRoot());
		bst.closeConnection();
		System.out.println("\nPreOrder");
		bst.displayPre(bst.getRoot());
		System.out.println("\nPostOrder");
		bst.displayPost(bst.getRoot());
	}
}


/**
 *InOrder
Bank of Baroda			  Kothrud	  BARO20000200	  Kothrud, Pune		366712642	null		1829164700
Bank of India			  Satpur	  BOI020000200	  Satpur, Nashik	1829164700	null		null
Bank of Maharashtra		  Kothrud	  MAHB20000200	  Kothrud, Pune		2018699554	366712642	1311053135
Fedral Bank 			  Kothrud	  FEDR20000200	  Kothrud, Pune		1311053135	null		null
HDFC Bank				  Kothrud	  HDFC20000200	  Kothrud, Pune		118352462	2018699554	1550089733
Mahrashtra Gramin Bank	  Malegaon	  MAHG20000200	  Malegaon			1550089733	null		865113938
Union Bank				  Kothrud	  UNIB20000200	  Kothrud, Pune		865113938	null		1442407170
Yes Bank				  Kothrud	  YESB20000200	  Kothrud, Pune		1442407170	null		null

*PreOrder
HDFC Bank				  Kothrud	  HDFC20000200	  Kothrud, Pune		118352462	2018699554	1550089733
Bank of Baroda			  Kothrud	  BARO20000200	  Kothrud, Pune		366712642	null		1829164700
Bank of India			  Satpur	  BOI020000200	  Satpur, Nashik	1829164700	null		null
Bank of Maharashtra		  Kothrud	  MAHB20000200	  Kothrud, Pune		2018699554	366712642	1311053135
Fedral Bank 			  Kothrud	  FEDR20000200	  Kothrud, Pune		1311053135	null		null
Mahrashtra Gramin Bank	  Malegaon	  MAHG20000200	  Malegaon			1550089733	null		865113938
Union Bank				  Kothrud	  UNIB20000200	  Kothrud, Pune		865113938	null		1442407170
Yes Bank				  Kothrud	  YESB20000200	  Kothrud, Pune		1442407170	null		null

*PostOrder
Bank of Baroda			  Kothrud	  BARO20000200	  Kothrud, Pune		366712642	null		1829164700
Bank of India			  Satpur	  BOI020000200	  Satpur, Nashik	1829164700	null		null
Bank of Maharashtra		  Kothrud	  MAHB20000200	  Kothrud, Pune		2018699554	366712642	1311053135
Fedral Bank 			  Kothrud	  FEDR20000200	  Kothrud, Pune		1311053135	null		null
Mahrashtra Gramin Bank	  Malegaon	  MAHG20000200	  Malegaon			1550089733	null		865113938
Union Bank				  Kothrud	  UNIB20000200	  Kothrud, Pune		865113938	null		1442407170
Yes Bank				  Kothrud	  YESB20000200	  Kothrud, Pune		1442407170	null		null
HDFC Bank				  Kothrud	  HDFC20000200	  Kothrud, Pune		118352462	2018699554	1550089733

*/