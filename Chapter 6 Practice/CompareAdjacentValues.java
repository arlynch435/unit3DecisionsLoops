import java.util.Scanner;
public class CompareAdjacentValues
{
    public static void detectAdjacentDuplicates()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a series of numbers and a character to quit.");
        double input=s.nextDouble();
        while (s.hasNextDouble())
        {
            double previousInput= input;
            input=s.nextDouble();
            if (previousInput==input)
            {
                System.out.println("Duplicate Adjacent Values!");
            }
        }
    }

}
