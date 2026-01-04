package mscbda;
import java.util.*;

public class prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//System.out.println("Enter a number");
		//n=sc.nextInt();
		int a=2,b=100;
		
	for(int j=a;j<b;j++)
	{
		int n=j;
		int f=0;
		for(int i=2;i<n;i++)
		{
		    if(n%i==0)
		    {
		    	f=1;
		    	break;
		    }
		}
		if(f==0)
		{
			System.out.println(n);
		}
		
	}
		

	}

}
