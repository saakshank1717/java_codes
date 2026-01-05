package mscbdaoop;
import java.util.*;
class employee
{
	int eid;
	String name;
	static String manager;
	static {
		manager="SSS";
	}
	
	employee(int eid,String name)
	{
		this.eid=eid;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(eid+" "+name+" "+manager);
	}
	
	static void display1()
	{
		System.out.println(manager);
	}
}

public class staticc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of employees");
		int n=sc.nextInt();
		
		employee emp[]=new employee[n]; //array
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter eid:");
			int eid=sc.nextInt();
			sc.nextLine();//add
			System.out.println("Enter name:");
			String name=sc.nextLine();
			emp[i]=new employee(eid,name);//objcreated
		}
		
		for(employee e:emp)  
		{
			e.display();
		}
		
		employee.display1();
		
		
		
		
		
	}

}
