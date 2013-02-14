import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class echo 
{
	public static void main(String args[]) throws IOException
	{
		Scanner kb = new Scanner (new File ("echo.dat"));
		while (kb.hasNext())
		{
			System.out.println(kb.nextLine());
		}
		kb.close();
	}
}
