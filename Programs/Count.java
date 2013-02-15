import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Count 
{
	public static void main(String args[]) throws IOException
	{
		Scanner kb = new Scanner (new File("count.dat"));
		
		int times = Integer.parseInt(kb.nextLine().trim());
		
		for (int i = 0; i < times; i++)
		{
			String temp = kb.nextLine().trim();
			
			int n = Integer.parseInt(temp.substring(0,2));
			int r = Integer.parseInt(temp.substring(3));
			
			char methd = temp.charAt(2);
			
			switch (methd)
				case 'C':
					{
						System.out.println(temp + " This is Combination.");
					}
				case 'P':
					{
						System.out.println(temp + " This is Permutation.");
					}
		}
		kb.close();
	}
}
