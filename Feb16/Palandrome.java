import java.util.*;
import java.io.*;
public class Palandrome
{
    public static void main (String args[]) throws IOException
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter your word: ");
        String word = kb.nextLine();
        String temp="";
        for (int i = 0; i <word.length(); i++)
        {
            temp+=word.charAt(word.length()-1-i);
            if (i == word.length()-1)
            {
                if (temp.equals(word))
                {
                    System.out.println("The word is a palandrome");
                }
                else
                {
                    System.out.println("The word is not a palandrome");
                }
            }
        }
        kb.close();
    }
}