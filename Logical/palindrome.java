package mscbda;

public class palindrome {
	public static void main(String args[])
	{
		int  n=3331;int d=n;
		int t,sum=0;
		while(n>0)
		{
			t=n%10;
			sum=sum*10+t;
			n=n/10;
		}
		if(sum==d)
		{
			System.out.println("PALINDROME");
		}
		else
		{
			System.out.println("NOT PALINDROME");
		}
	}

}
