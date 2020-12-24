package tree;


public class BinarySearchTree
{
	private Node root;

	public BinarySearchTree()
	{
		this.root = null;
	}
	
	public boolean insert(int data)
	{
		Node newNode=new Node(data);
		if( newNode == null )
			return false;
		if(root == null ) //Insert node at root 
		{
			root=newNode;
			return true;
		}
		Node temp=root;
		while(true)
		{
			if(temp.getData() == data )
				return false;
			if(temp.getData()>data)
			{
				if(temp.getLeft()==null)
				{
					temp.setLeft(newNode);
					return true;
				}
				temp=temp.getLeft();
			}
			else
			{
				if(temp.getRight()== null) 
				{
					temp.setRight(newNode);
					return true;
				}
				temp=temp.getRight();
			}
		}
	}
	
	public boolean search(int data)
	{
		if( root == null )
			return false;
		Node temp=root;
		while (data != temp.getData())
		{
			if(temp.getData()>data)
				temp=temp.getLeft();
			else
				temp=temp.getRight();
			if(temp==null)
					return false;
		}
		return true;
	}
	
	public boolean delete(int data)
	{
		if(root==null)
			return false;
		Node del=root;
		Node subRoot=root;
		while(data != del.getData() )
		{
			subRoot=del;
			if( data < del.getData())
				del=del.getLeft();
			else 
				del=del.getRight();
			if(del==null)
				return false;
		}
		while(true)
		{
			if( del.getLeft() == null && del.getRight() == null )	
			{
				if(del==root)
				{
					root=null;
					return true;
				}
				if(subRoot.getLeft() == del )
					subRoot.setLeft(null);
				else
					subRoot.setRight(null);		
				return true;
			}
			if( del.getLeft() != null )
			{
				Node maxValNode=del.getLeft();
				subRoot=del;
				while(maxValNode.getRight() != null)
				{
					subRoot=maxValNode;
					maxValNode=maxValNode.getRight();	
				}
				int tempData=del.getData();
				del.setData(maxValNode.getData());
				maxValNode.setData(tempData);
				del=maxValNode;
			}
			else
			{
				Node minValNode=del.getRight();
				subRoot=del;
				while( minValNode.getLeft() != null )
				{
					subRoot=minValNode;
					minValNode=minValNode.getLeft();
				}	
				int tempData=minValNode.getData();
				minValNode.setData(del.getData());
				del.setData(tempData);
				del=minValNode;
			}
		
		}	
	}

    public void preOrder() 
    {
        Node temp = root;
        Node[] stack = new Node[100];
        int top = -1;

        System.out.print("PreOrder : ");

        while (temp != null || top != -1) 
        {
            while(temp != null) {
                System.out.print(temp.getData() + " ");
                stack[++top] = temp;
                temp = temp.getLeft();
            }

            temp = stack[top--];
            temp = temp.getRight();
        }
        System.out.println();
    }
 
    public void inOrder() 
    {
        Node temp = root;
        Node [] stack = new Node[100];
        int top = -1;
        System.out.print("InOrder  : ");
        while(temp != null || top != -1) 
        {
            while(temp != null)
            {
                stack[++top] = temp;
                temp = temp.getLeft();
            }
            temp = stack[top--];
            System.out.print(temp.getData() + " ");
            temp = temp.getRight();
        }
        System.out.println();
    }

    public void postOrder() 
    {
        System.out.print("PostOrder: ");
        class Pair  
        {
            public Node node;
            public char flag;
        }
        Node temp = root;
        Pair [] stack = new Pair[100];
        int top = -1;
        while(temp != null || top != -1) 
        {
            while(temp != null) 
            {
                Pair pair = new Pair();
                pair.node = temp;
                pair.flag = 'L';
                stack[++top] = pair;
                temp = temp.getLeft();
            }
            Pair pair = stack[top--];
            if(pair.flag == 'L') 
            {
                temp = pair.node.getRight();
                pair.flag = 'R';
                stack[++top] = pair;
            }
            else 
                System.out.print(pair.node.getData() + " ");
        }
        
        System.out.println();
    }
	
	public void preOrder(Node temp)
	{
		if(temp==null)
			return;
		System.out.print(temp.getData()+"  "+temp.hashCode()+"\t"
				+ ""+((temp.getLeft() != null)?(temp.getLeft().hashCode()):null)+"\t"
				+ ""+((temp.getRight() !=null)?(temp.getRight().hashCode()):null));
		System.out.println();
		preOrder(temp.getLeft());
		preOrder(temp.getRight());
	}

	public void inOrder(Node temp)
	{
		if(temp==null)
			return;
		inOrder(temp.getLeft());
		System.out.print(temp.getData()+" ");
		inOrder(temp.getRight());
	}
	
	public void postOrder(Node temp)
	{
		if(temp==null)
			return;
		postOrder(temp.getLeft());
		postOrder(temp.getRight());
		System.out.print(temp.getData()+" ");
	}
	
	public int count(Node node) 
	{
		if(node==null)
			return 0;
		return 1+count(node.getLeft())+count(node.getRight());
	}
	
	public Node getRoot()
	{
		return this.root;
	}
	
}
