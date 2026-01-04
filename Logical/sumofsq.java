package mscbda;
import java.util.*;

public class sumofsq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=34;
		int t,sum=0;
		while(n>0)
		{
			t=n%10;
			sum=sum+t*t;
			n=n/10;
			
		}
		System.out.println(sum);
		

	}

}
