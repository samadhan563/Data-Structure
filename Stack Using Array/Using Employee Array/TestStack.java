package stack;

import employee.Employee;

public class TestStack {

	public static void main(String[] args)
	{
		Stack stack=new Stack(10);
		Employee e;
		System.out.println("Push ::"+stack.push(new Employee(100, "Sama", 21000.10)));
		System.out.println("Push ::"+stack.push(new Employee(101, "Rohit", 10000.10)));
		System.out.println("Push ::"+stack.push(new Employee(102, "Vinod", 20000.10)));
		System.out.println("Push ::"+stack.push(new Employee(103, "Arjun", 30000.10)));
		System.out.println("Push ::"+stack.push(new Employee(99, "Arti", 31000.10)));
		System.out.println("Push ::"+stack.push(new Employee(98, "Rashi", 31000.10)));
		
		System.out.println("Pop  ::"+(e=(Employee)stack.pop()));
		System.out.println((e!=null)?e.getEmpId()+"\t"+e.getEmpName()+"\t"+e.getEmpSalary():"Empty");
		
		System.out.println("Pop  ::"+(e=(Employee)stack.pop()));
		System.out.println((e!=null)?e.getEmpId()+"\t"+e.getEmpName()+"\t"+e.getEmpSalary():"Empty");
		
		System.out.println("Top  ::"+(e=(Employee)stack.peek()));
		System.out.println((e!=null)?e.getEmpId()+"\t"+e.getEmpName()+"\t"+e.getEmpSalary():"Empty");	
		
		System.out.println("Pop  ::"+(e=(Employee)stack.pop()));
		System.out.println((e!=null)?e.getEmpId()+"\t"+e.getEmpName()+"\t"+e.getEmpSalary():"Empty");
		
		System.out.println("Pop  ::"+(e=(Employee)stack.pop()));
		System.out.println((e!=null)?e.getEmpId()+"\t"+e.getEmpName()+"\t"+e.getEmpSalary():"Empty");
		
		System.out.println("Pop  ::"+(e=(Employee)stack.pop()));
		System.out.println((e!=null)?e.getEmpId()+"\t"+e.getEmpName()+"\t"+e.getEmpSalary():"Empty");
		
		System.out.println("Pop  ::"+(e=(Employee)stack.pop()));
		System.out.println((e!=null)?e.getEmpId()+"\t"+e.getEmpName()+"\t"+e.getEmpSalary():"Empty");
		
		System.out.println("Pop  ::"+(e=(Employee)stack.pop()));
		System.out.println((e!=null)?e.getEmpId()+"\t"+e.getEmpName()+"\t"+e.getEmpSalary():"Empty");
	
		System.out.println("Top  ::"+(e=(Employee)stack.peek()));
		System.out.println((e!=null)?e.getEmpId()+"\t"+e.getEmpName()+"\t"+e.getEmpSalary():"Empty");	
	
	}

}
