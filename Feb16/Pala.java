import java.util.*;
import java.io.*;
public class Pala
{
    public static void main (String args[]) throws IOException
    {
        Scanner kb = new Scanner(new File ("pala.txt"));
        int times = Integer.parseInt(kb.nextLine().trim());

        for (int i = 0; i < times; i++)
        {
            String comp = "";
            String temp = kb.nextLine();
            for (int j = 0; j < temp.length(); j++)
            {
                comp+=temp.charAt(temp.length()-1-j);
                if (j == temp.length()-1)
                {
                    if (temp.equals(comp))
                    {
                        System.out.println("The text is a palandrome.");
                    }
                    else 
                    {
                        System.out.println("The text is not a palandrome.");
                    }
                }
            }
        }
        kb.close();
    }
}