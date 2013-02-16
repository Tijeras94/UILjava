import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Jack 
{
  public static void main (String args[]) throws IOException
	{
		Scanner kb = new Scanner (new File("jack.dat"));
		
		while (kb.hasNext())
		{
			kb.nextLine();
			String temp = kb.nextLine();
			System.out.println(temp);
		}
		kb.close();
	}
}
