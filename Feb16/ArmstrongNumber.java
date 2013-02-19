import java.util.*;
import java.io.*;

public class ArmstrongNumber
{
    public static void main (String args[]) throws IOException
    {
        Scanner kb = new Scanner (new File ("armstrong.txt"));
        
        int times = Integer.parseInt(kb.nextLine().trim());
                
        for (int i = 0; i < times; i++)
        {
            int total = 0;
            String temp = kb.nextLine();
            String tut="";
            for (int j = 0; j < temp.length(); j++)
            {
            	tut=temp.substring(j,j+1);
                int base = Integer.parseInt(tut);
                total+=Math.pow(base, 3);
            }
            System.out.println(total);
        }
        kb.close();
    }
}