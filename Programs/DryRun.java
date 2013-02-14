import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class DryRun 
{
	public static void main (String args[]) throws IOException
	{
		Scanner kb = new Scanner (new File ("dryrun.dat"));
		int times = Integer.parseInt(kb.nextLine().trim());
		
		for (int i=0; i<times; i++)
		{
			String temp = kb.nextLine().trim();
			
			System.out.println("I like " + temp + ".");
		}
		kb.close();
	}
}
