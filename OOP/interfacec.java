package mscbdaoop;

interface payment
{
	public void pay(double amt);
}

class upi implements payment
{
	@Override
	public void pay(double amt)
	{
		System.out.println("PAID"+amt+" USING UPI");
	}
}

public class interfacec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		payment p;
		p=new upi();
		p.pay(300);
		
		

	}

}
