package StarPatterns;

public class Sp14 
{
	public static void main(String[] args) 
	{
		int n=8 ,k=1;
		for(int i=1 ;i<=n;i++)
		{
			for(int j=1 ;j<=n;j++)
			{
				if(j==n || j==1 || j==k)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			k++;
			System.out.println();
		}
	}
}
