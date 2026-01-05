package mscbdaoop;

class armstrong{
	
	int n;
	
	armstrong(int n)
	{
		this.n=n;
	}
	
	void calc()
	{
		
		int n1=n,n2=n;
		
		int sum=0;
		int c=0,t;
		while(n>0)
		{
			t=n%10;
			c++;
			n=n/10;
			
		}
		//System.out.println(c);
		
		while(n1>0)
		{
			t=n1%10;
			sum=(int) (sum+ (Math.pow(t, c))); //***
			n1=n1/10;
		}
		//System.out.println(sum);
		
		if(sum==n2)
		{
			System.out.println(n2+" is ARM");
		}
		else
		{
			System.out.println(n2+" is Not Arms");
		}
	}
	
}


public class armsoop {

	public static void main(String[] args) {
		
		for(int i=100;i<200;i++)
		{
			armstrong a1=new armstrong(i);
			a1.calc();
		}
		
		
		
		
	

	}

}
