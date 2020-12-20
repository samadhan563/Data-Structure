package employee;

public class Employee 
{
	int empId;
	String empName;
	double empSalary;
	public Employee() 
	{
		this.empId = 000;
		this.empName = "NA";
		this.empSalary = 0.0;
	}
	public Employee(int empId, String empName, double empSalary)
	{
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public int getEmpId() 
	{
		return empId;
	}
	public String getEmpName() 
	{
		return empName;
	}
	public double getEmpSalary() 
	{
		return empSalary;
	}
	
}
