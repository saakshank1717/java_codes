package mscbdaoop;

abstract class employee1{
	int id;
	String name;
	abstract void calcsalary();
	abstract void display();
	
	employee1(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}

class fulltimeemployee extends employee1
{
	float basics;
	double salary;
	
	fulltimeemployee(int id,String name,float basics)
	{
		super(id,name);
		this.basics=basics;
	}
	
	@Override
	void calcsalary()
	{
		salary=basics+(0.8*basics)+(0.2*basics);
	}
	
	@Override
	void display()
	{
		System.out.println(id+" "+name+" "+basics+" "+salary);
	}
}

class halftimeemployee extends employee1{
	int hours;
	float rate;
	double salary;
	
	halftimeemployee(int id,String name,int hours,float rate)
	{
		super(id,name);
		this.hours=hours;
		this.rate=rate;
	}
	
	@Override
	void calcsalary()
	{
		salary=hours*rate;
	}
	
	@Override
	void display()
	{
		System.out.println(id+" "+name+" "+" "+salary);
	}
	
}






public class employeepayroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fulltimeemployee f=new fulltimeemployee(1,"Swami",100);
		f.calcsalary();
		f.display();
		
		halftimeemployee h=new halftimeemployee(1,"Swami",5,40);
		h.calcsalary();
		h.display();


	}

}
