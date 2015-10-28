import java.util.Scanner;
public class SubstringMaker
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String str=s.next();
        for (int i=0;
             i<str.length();
             i++)
             {
                 for (int r=0;
                      r<str.length()-1;
                      r++)
                      {
                          System.out.println(str.substring(r,r+i));
                        }
                }
        System.out.println(str);
    }

}
