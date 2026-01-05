package mscbdaoop;
import java.util.*;

class Bankaccount{
	String accountid,accountname;
	double balance;
	
	Bankaccount(String accountid,String accountname,double balance)
	{
		this.accountid=accountid;
		this.accountname=accountname;
		this.balance=balance;
	}
	
	void deposit(double amt)
	{
		balance+=balance;
	}
	
	void withdraw(double amt)
	{s
		balance-=balance;
	}
}

public class finall {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Bankaccount> bankacc=new ArrayList<>();
		
	    //insert
		System.out.print("Enter account holder id: ");
        String id = sc.nextLine();
        System.out.print("Enter account number: ");
        String name = sc.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();
        bankacc.add(new Bankaccount(id, name, balance));
        System.out.println("Account created successfully.");
        
        //deposit
        System.out.println("Enter Account for deposit:");
        sc.nextLine();
        String accid=sc.nextLine();
        for(Bankaccount ba:bankacc)
        {
        	if(ba.accountid.equals(accid))
        	{
        		ba.deposit(1000);
        		System.out.println(ba.balance);
        	}
        }
        
        
        
        
        
        
        
        

	}

}
