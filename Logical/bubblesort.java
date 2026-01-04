package mscbda;

public class bubblesort {
	public static void main(String args[])
	{
		int a[]= {2,4,5,1,8};
		int i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				
				}
				
			}
		}
		for(i=0;i<a.length;i++)
		{
		   System.out.println(a[i]);}
	}

}
