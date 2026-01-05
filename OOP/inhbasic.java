package mscbdaoop;

class A{
	int a,b;
	A(int a,int b)
	{
		System.out.println("in A");
		this.a=a;
		this.b=b;
	}
	
	void display()
	{
		System.out.println(a+" "+b);
	}
}

class B extends A
{
	int k;
	B(int k,int a,int b)
	{
		super(a,b);
		this.k=k;
		System.out.println("in B");
	}
	
	void add()
	{
		int c=a+b+k;
		System.out.println(c);
		
	}
}

public class inhbasic {

	public static void main(String[] args) {
		B b=new B(1,2,3);
		b.add();
	}

}
