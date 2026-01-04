package mscbda;

public class pattern6 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			char start='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(start);
				start++;
			}
			System.out.println();
		}

	}

}
