package mscbdaoop;
import java.util.*;

class Student{
	private int roll;
	private String name;
	
	Student(int roll,String name)
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

public class studentgetset {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		Student stud[]=new Student[3];
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter roll and name:");
			int roll=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			
			stud[i]=new Student(roll,name);
			
		}
		
		for(Student s:stud)
		{
			System.out.println("roll:"+s.getroll()+" name:"+s.getname());
		}

	}

}
