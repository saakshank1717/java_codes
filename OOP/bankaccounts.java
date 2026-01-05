package mscbdaoop;

class bankingaccounts{
	private int id;
	private String name;
	private int amt;
	
	bankingaccounts(int id,String name,int amt)
	{
		this.id=id;
		this.name=name;
		this.amt=amt;
	}
	
	int getid()
	{
		return id;
	}
	
	String getname()
	{
		return name;
	}
	
	int getamt()
	{
		return amt;
	}
			
}

class savingaccounts extends bankingaccounts{
	
	private float interest;
	
	savingaccounts(int id,String name,int amt,int interest)
	{
		super(id,name,amt);
		this.interest=interest;
	}
	
	float getinterest()
	{
		return interest;
	}
	
}




public class bankaccounts {

	public static void main(String[] args) {
		
		savingaccounts s=new savingaccounts(1,"Swami",333333,7);
		System.out.println(s.getid());
		System.out.println(s.getname());
		System.out.println(s.getamt());
		System.out.println(s.getinterest());
		
		

	}

}
