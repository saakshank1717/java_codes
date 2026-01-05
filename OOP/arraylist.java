package mscbdaoop;
import java.util.*;

class student{
	private int roll;
	private String name;
	
	student(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}
	
	int getroll()
	{
		return roll;
	}
	
	String getname()
	{
		return name;
	}
}

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		ArrayList<student> stud=new ArrayList<>();
		
		int n=3;
		//insert
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter roll name:");
			int roll=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			stud.add(new student(roll,name));
			
		}
		
		while(true) {
			
			System.out.println("Enter choice");
			int ch=sc.nextInt();
			
		switch(ch) {
		
		
		//insert
		case 1:System.out.println("Enter roll name:");
		int roll=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		stud.add(new student(roll,name));
		break;

		//display
		case 2:
			for(student s:stud)
		{
			System.out.println(s.getroll()+" "+s.getname());
		}
			break;
		
		case 3:int search=sc.nextInt();
		for(student s: stud)
		{
			if(s.getroll()==search)
			{
				System.out.println("FOUNDDDDDD");
				System.out.println(s.getroll()+" "+s.getname());
				break;
			}
			
		}
		break;
		
		case 4:System.exit(0);
		
		}
		
		
		
		
		
		
		}
		
		
		
		
		
		

		
		
	
	}

}
