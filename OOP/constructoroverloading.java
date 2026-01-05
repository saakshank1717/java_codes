package mscbdaoop;

class calcc{
	int x,y,z;
	
	calcc(int x,int y)
	{
		this.x=x;
		this.y=y;
		this.z=0;
		
	}
	
	calcc(int x,int y,int z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	int add()
	{
		return x+y+z;
	}
}

public class constructoroverloading {

	public static void main(String[] args) {
		calcc c1=new calcc(1,2);
		calcc c2=new calcc(1,2,3);
		
		System.out.println(c1.add());
		System.out.println(c2.add());
		

	}

}
