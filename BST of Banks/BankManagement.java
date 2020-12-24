package bank;
public class BankManagement 
{
	private String bankName;
	private String bankIFSC;
	private String bankBranch;
	private String bankAddress;
	
	public BankManagement(String bankName, String bankIFSC, String bankBranch, String bankAddress) 
	{
		this.bankName = bankName;
		this.bankIFSC = bankIFSC;
		this.bankBranch = bankBranch;
		this.bankAddress = bankAddress;
	}

	public String getBankName() 
	{
		return bankName;
	}

	public String getBankIFSC() 
	{
		return bankIFSC;
	}

	public String getBankBranch() 
	{
		return bankBranch;
	}

	public String getBankAddress() 
	{
		return bankAddress;
	}

	
	
}
