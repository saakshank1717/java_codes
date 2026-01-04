package mscbda;

public class digtowords {
	public static void main(String args[])
	{
		String words[]= {"zero","one","two","three","four","five"};
		int n=102;
		int t,sum=0;
		while(n>0)
		{
			t=n%10;
			sum=sum*10+t;
			n=n/10;
		}
		int u;
		while(sum>0)
		{
			u=sum%10;
			System.out.print(words[u]+" ");
			sum=sum/10;
		}
	}

}


