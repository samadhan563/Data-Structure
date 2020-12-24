package binarytree.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import bank.BankManagement;

public class BSTOfBank 
{
	static Statement statement;
	static Connection connection;
	
	
	
	static{
		try 
		 {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Class Loaded....");
			connection=DriverManager.getConnection("jdbc:mysql://localhost/test","root","0904");
			System.out.println("Connection Created.....");
			statement=connection.createStatement();
			statement.executeUpdate("drop table  if exists bank");
			System.out.println("Old Table Droped !!");
			
			statement.executeUpdate("create table if not exists bank(bankName varchar(25) unique,bankIFSC varchar(20),"
					+ "bankBranch varchar(20), bankAddress varchar(20),Node_Addr varchar(10),Left_Node varchar(20), Right_Node varchar(20) )");
			System.out.println("New table created on data base.....");
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	
	}
	
	
	private Node root;

	public BSTOfBank() 
	{
		this.root = null;
	}

	public boolean insert(BankManagement data)
	{
		Node newNode = new Node(data);
		if (newNode == null)
			return false;
		if (root == null) 
		{
			root = newNode;
			return true;
		}
		Node temp = root;
		while (true) 
		{

			if (temp.getData().getBankName().equals(newNode.getData().getBankName()))
			{
				return false;
			}
			if (0 < temp.getData().getBankName().compareTo(newNode.getData().getBankName()))
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
				if(temp.getRight()==null)
				{
					temp.setRight(newNode);				
					return true;
				}
				temp=temp.getRight();
			}
			
		}
	}

	public static void display(Node temp)
	{
		try 
		{

			if (temp != null) 
			{
				display(temp.getLeft());

				BankManagement b = (BankManagement) temp.getData();
				System.out.println(b.getBankName() + "\t\t\t  " + b.getBankBranch() + "\t  " + b.getBankIFSC() + "\t  "
						+ "" + b.getBankAddress() + "\t" + temp.hashCode() + "" + "\t"
						+ ((temp.getLeft() != null) ? temp.getLeft().hashCode() : "null") + "" + "\t"
						+ ((temp.getRight() != null) ? temp.getRight().hashCode() : "null"));

				String str = "insert into bank values('" + b.getBankName() + "','" + b.getBankBranch() + "','"
						+ b.getBankIFSC() + "','" + b.getBankAddress() + "','" + temp.hashCode() + "','"
						+ ((temp.getLeft() != null) ? temp.getLeft().hashCode() : null) + "','"
						+ ((temp.getRight() != null) ? temp.getRight().hashCode() : null) + "')";

				statement.executeUpdate(str);

				display(temp.getRight());
			}
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}

	}
	
	public static void displayPre(Node temp) 
	{
		
		if(temp!=null)
		{
			
			BankManagement b=(BankManagement)temp.getData();
			System.out.println(b.getBankName()+"\t\t\t  "+b.getBankBranch()+"\t  "+b.getBankIFSC()+"\t  "
					+ ""+b.getBankAddress()+"\t"+temp.hashCode()+""
							+ "\t"+((temp.getLeft()!=null)?temp.getLeft().hashCode():"null")+""
							+"\t"+((temp.getRight()!=null)?temp.getRight().hashCode():"null"));

			displayPre(temp.getLeft());
			displayPre(temp.getRight());
		}
	}
	
	public static void displayPost(Node temp) 
	{
		if(temp!=null)
		{
			displayPost(temp.getLeft());
			displayPost(temp.getRight());
			BankManagement b=(BankManagement)temp.getData();
			System.out.println(b.getBankName()+"\t\t\t  "+b.getBankBranch()+"\t  "+b.getBankIFSC()+"\t  "
					+ ""+b.getBankAddress()+"\t"+temp.hashCode()+""
							+ "\t"+((temp.getLeft()!=null)?temp.getLeft().hashCode():"null")+""
							+"\t"+((temp.getRight()!=null)?temp.getRight().hashCode():"null"));

		}
	}
	
	public Node getRoot() 
	{
		return this.root;
	}

	public void closeConnection() 
	{
		try
		{
			connection.close();
			statement.close();
			System.out.println("Written in MYSQL Database at Bank table !!!");
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}


