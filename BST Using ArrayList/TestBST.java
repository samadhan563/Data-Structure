package tree;

public class TestBST {

	public static void main(String[] args)
	{

		BinerySearchTree  bst=new BinerySearchTree();
		
		System.out.println(bst.insert(50));
		System.out.println(bst.insert(20));
		System.out.println(bst.insert(28));
		System.out.println(bst.insert(80));
		System.out.println(bst.insert(10));
		System.out.println(bst.insert(60));
		System.out.println(bst.insert(100));
		System.out.println(bst.insert(15));
		System.out.println(bst.insert(55));
		System.out.println(bst.insert(70));
		System.out.println(bst.insert(15));
		System.out.println(bst.insert(12));
		System.out.println(bst.insert(18));
		
		
		bst.InOrder();
		
		bst.preOrder();
		
		bst.postOrder(bst.getRoot());
		
		System.out.println();
		bst.inOrderR(bst.getRoot());
		

	}

}
