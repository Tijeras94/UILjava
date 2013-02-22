
public class Fibonacci 
{
	public static void main (String args[])
	{
		int[] fibo= new int [13];
		fibo[0] = 1;
		fibo[1] = 1;
		for (int i = 1; i < 12; i++)
		{
			if (i == 1)
			{
				System.out.print(i);
			}
			fibo[i+1]=fibo[i]+fibo[i-1];
			System.out.print(" "+fibo[i]);
		}
	}
}
