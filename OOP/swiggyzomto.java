package mscbdaoop;

interface deliverypartner{
	public void pickfood(String restaurant);
	public void dropfood(String address);
}

class swiggy implements deliverypartner
{
	@Override
	public void pickfood(String restaurant)
	{
		System.out.println("Swiggy picked your food from"+restaurant);
	}
	
	public void dropfood(String address)
	{
		System.out.println("Swiggy delivered your food at"+address);
	}
	
}

class zomato implements deliverypartner
{
	@Override
	public void pickfood(String restaurant)
	{
		System.out.println("Zomato picked your food from"+restaurant);
	}
	
	public void dropfood(String address)
	{
		System.out.println("Zomato delivered your food at"+address);
	}
	
}

class customer{
	String name;
	customer(String name)
	{
		this.name=name;
	}
	
	void order(String address,String restaurant,deliverypartner p)
	{
		System.out.println(name+" placed an order from"+restaurant);
		p.pickfood(restaurant);
		p.dropfood(address);
	}
}



public class swiggyzomto {
	public static void main(String args[])
	{
	customer c=new customer("Swami");
	
	deliverypartner p=new swiggy();
	c.order("PUNE", "FEORGE", p);
		
	}

}
