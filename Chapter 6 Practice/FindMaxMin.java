

import java.util.Scanner;
public class FindMaxMin
{
    public static double findMax()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a series of numbers or a character to quit.");
        double largest=s.nextDouble();
        while(s.hasNextDouble())
        {
            double input=s.nextDouble();
            if(input>largest)
            {
                largest=input;
            }
        }
        return largest;
        
    }
    public static double findMin()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a series of numbers or a character to quit.");
        double smallest=s.nextDouble();
        while(s.hasNextDouble())
        {
            double input=s.nextDouble();
            if(input<smallest)
            {
                smallest=input;
            }
        }
        return smallest;
        
    }

}
