package banking;

public class Account {
	
	int account_no,amount,ifsc;
	void insert(int account,int amount,int ifsc)
	{
		this.account_no = account_no;
		this.amount = amount;
		this.ifsc = ifsc;
	}
	void display()
	{
		System.out.println("-----------------------------------------------------");
		System.out.println("Account number:"+account_no);
		System.out.println("Current Amount:"+amount);
		System.out.println("IFSC:"+ifsc);
		}
	void deposite(int amt)
	{
		amount = amount + amt;
	}
	void checkBalance()
	{
		System.out.println("-----------------------------------------------------");
		System.out.println("Available balance :"+amount);
	}
		
	void withdraw(int amt)
	{
		if(amount<amt)
		{
			System.out.println("Insufficent Balance");
		}
		else 
		{
			System.out.println("-----------------------------------------------------");
			System.out.println("Amount Withdraw Sucessfully...");
		}
	}
	}

