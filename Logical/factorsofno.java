package mscbda;
import java.util.*;

public class factorsofno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		int x=2;
		
		while(n>1)
		{
			if(n%x==0)
			{
				System.out.println(x);
				n=n/x;
				continue;
			}
			x++;
		}

	}

}
