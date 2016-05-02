/*
Cummings,Jarrad
CSC210
*/




//Bank Account
public abstract class BankAccount
{
	//unique number
	protected static int numberOfAccounts = 100001;

	//current balance 
	private double balance;

	//name 
	private String owner;

	// bank account number
	private String accountNumber;

	//default constructor
	public BankAccount()
	{
		balance = 0;
		accountNumber = numberOfAccounts + "";
		numberOfAccounts++;
	}

	//Constructor
	
	public BankAccount(String name, double amount)
	{
		owner = name;
		balance = amount;
		accountNumber = numberOfAccounts + "";
		numberOfAccounts++;
	}

	//constructor creates another account
	public BankAccount(BankAccount oldAccount, double amount)
	{
		owner = oldAccount.owner;
		balance = amount;
		accountNumber = oldAccount.accountNumber;
	}

	//allows you to add money to the account
	public void deposit(double amount)
	{
		balance = balance + amount;
	}

	public boolean withdraw(double amount)
	{
		boolean completed = true;

		if (amount <= balance)
		{
			balance = balance - amount;
		}
		else
		{
			completed = false;
		}
		return completed;
	}

	//balance
	public double getBalance()
	{
		return balance;
	}

	//owner
	public String getOwner()
	{
		return owner;
	}

	//account number
	public String getAccountNumber()
	{
		return accountNumber;
	}

	//change the balance
	public void setBalance(double newBalance)
	{
		balance = newBalance;
	}

	//change the account number
	public void setAccountNumber(String newAccountNumber)
	{
		accountNumber = newAccountNumber;
	}
}