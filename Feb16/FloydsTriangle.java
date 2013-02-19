import java.io.IOException;
import java.util.Scanner;


public class FloydsTriangle 
{
	public static void main (String args[]) throws IOException
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Please enter a number of rows: ");
		
		int rows = kb.nextInt();
		
		int count = 0;
		
		for (int i = 0; i <= rows; i++)
		{
			for (int j = 0; j < i; j++)
			{
				count++;
				System.out.print(count + " ");
			}
			System.out.println("");
		}
		kb.close();
	}
}
