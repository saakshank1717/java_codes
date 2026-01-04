package mscbda;

public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=5-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
        
	}

}

