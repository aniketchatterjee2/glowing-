import java.io.*;
public class p4	{
	public static void main(String args[])throws IOException	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i;
		int j;
		int n;

		System.out.println("Enter your number:");
		n=Integer.parseInt(br.readLine);

		for(i=0; i<=n; i++)
			{
				for(j=1; j<=n; j++)
				{
					System.out.print(" ");
				}
				
				for(j=1; j<=2*i-1; j++)
				{
					System.out.print(j);
				}
				for(j=n-1; j>=1; j--)
				{
					System.out.println(j);
				}

				System.out.println();

			}
	}
}