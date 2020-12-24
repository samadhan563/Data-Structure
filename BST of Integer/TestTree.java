package tree;

import java.util.Scanner;

public class TestTree {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		BinarySearchTree bst=new BinarySearchTree();
		boolean flag=false;
		while(!flag)
		{
			System.out.println("\n****** OPTIONS ****** "
								+ "\n1. Insert Node."
								+ "\n2. Delete Node."
								+ "\n3. Display in inOrder."
								+ "\n4. Display in preOrder."
								+ "\n5. Display in PostOrder."
								+ "\n6. Display in inOrder using Recursion."
								+ "\n7. Display in inOrder using Recursion."
								+ "\n8. Display in inOrder using Recursion."
								+ "\n9. Search."
								+ "\n10.Count."
								+ "\n11.Exit."
								+ "Select Option...");
			switch (sc.nextInt()) 
			{
			case 1:
					System.out.println("Enter integer val to create node.");
					System.out.println((bst.insert(sc.nextInt()))?"Inserted..":"Sorry!!");
					break;
					
			case 2:
					System.out.println("Enter integer val to delete node.");
					System.out.println((bst.delete(sc.nextInt()))?"Deleted..":"Sorry!!");
					break;
				
			case 3:
					System.out.println("InOrder......");
					bst.inOrder();
					break;
			
			case 4:
					System.out.println("PreOrder......");
					bst.preOrder();
					break;
					
			case 5:
					System.out.println("PostOrder......");
					bst.postOrder();				
					break;
					
			case 6:
					System.out.println();
					bst.inOrder(bst.getRoot());
					break;
					
			case 7:
					System.out.println();
					bst.preOrder(bst.getRoot());
					break;
					
			case 8:
					System.out.println();
					bst.postOrder(bst.getRoot());
					break;
					
			case 9:
					System.out.println("Enter integer val to search node.");
					System.out.println((bst.search(sc.nextInt()))?"Found..":"Sorry!!");
					break;
					
			case 10:
					System.out.println(bst.count(bst.getRoot()));
					break;
					
			case 11:
					System.out.println("Ok bye !!");
					flag=true;

			default:
					System.out.println("Invalid option  ");
					break;
			}		
		}
	
	
		System.out.println(bst.insert(50));
		System.out.println(bst.insert(20));
		System.out.println(bst.insert(15));
		System.out.println(bst.insert(30));
		System.out.println(bst.insert(10));
		System.out.println(bst.insert(18));
		System.out.println(bst.insert(80));
		System.out.println(bst.insert(60));
		System.out.println(bst.insert(65));
		System.out.println(bst.insert(70));
		System.out.println(bst.insert(50));
		System.out.println(bst.insert(20));
		
		System.out.println();
		System.out.println(bst.getRoot().getData());
		bst.preOrder(bst.getRoot());
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		bst.inOrder(bst.getRoot());
		
		System.out.println();
		bst.postOrder(bst.getRoot());
		
		System.out.println();
		System.out.println(bst.delete(50));
		System.out.println(bst.getRoot().getData());
		bst.inOrder(bst.getRoot());
		
		System.out.println();
		bst.postOrder(bst.getRoot());
		System.out.println("\n"+bst.delete(10));
		System.out.println();
		bst.inOrder(bst.getRoot());
		
		
		
		System.out.println();
		bst.inOrder(bst.getRoot());
		
		System.out.println();
		bst.postOrder(bst.getRoot());
		System.out.println("\n"+bst.delete(65));
		System.out.println();
		bst.inOrder(bst.getRoot());
		System.out.println();
		System.out.println(bst.count(bst.getRoot()));
	
	}

}
