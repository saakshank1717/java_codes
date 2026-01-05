package mscbdaoop;
import java.util.*; 
class m{
	int r,i;
	
	m(int r,int i)
	{
		this.r=r;
		this.i=i;
	}
	
	m(){}
	
	m add(m c1,m c2)
	{
		m c3=new m();
		c3.r=c1.r+c2.r;
		c3.i=c1.i+c2.i;
		return c3;
		
	}
	
	void display()
	{
		System.out.println(r+"+"+i+"i");
	}
}

public class complex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter r1 i1:");
		int r1=sc.nextInt();
		int i1=sc.nextInt();
		m x=new m(r1,i1);
		
		System.out.println("Enter r2 i2:");
		int r2=sc.nextInt();
		int i2=sc.nextInt();
		m y=new m(r2,i2);
		
		x.display();
		y.display();
		
		m ans=x.add(x, y);//can call using x or y
		ans.display(); 
		
		
			

	}

}
