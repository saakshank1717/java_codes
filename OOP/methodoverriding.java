package mscbdaoop;

abstract class animal
{
	abstract void sound();//here abstraction comes in picture
	//{
		//System.out.println("HELLLOOO");
	//}
}

class dog extends animal
{
	@Override
	void sound()
	{
		System.out.println("BHOW BHOW!");
	}
	
	void sound2()
	{
		System.out.println("UUUUUUUUUU");
	}
}

class cat extends animal
{
	@Override
	void sound()
	{
		System.out.println("MEOW MEOW!");
	}
}

public class methodoverriding {
	public static void main(String args[])
	{
		/*dog d=new dog();
		d.sound();
		
		cat c=new cat();
		c.sound();*/
		
		animal a=new cat();
		a.sound();
		//a.sound2();  this is not valid as there is no function sound2 in animal
		
		
		
		
	}

}
