package mscbdaoop;

class area{
	int l,b;
	
	area(int l,int b)
	{
		System.out.println("in A constructor");
		this.l=l;
		this.b=b;
	}
	
	void calc()
	{
		int area=l*b;//local variable
		System.out.println("Area:"+area);
	}
	
}

public class basicoop {

	public static void main(String[] args) {
		
		area a1=new area(10,10);
		a1.calc();
		

	}

}
