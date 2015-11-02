import java.util.Scanner;
public class NumericalMethods
{
   public static void fibbonanciNumbers()
   {
       Scanner s= new Scanner(System.in);
       System.out.print("Please enter your integer above the 2nd iteration: ");
       int userNumber=s.nextInt();
       int fNew=0;
       int fold1=1;
       int fold2=1;
       for (int i=2;
                i<userNumber;
                i++)
                {
                    fNew=fold1+fold2;
                    fold2=fold1;
                    fold1=fNew;
                }
       System.out.print("The integer at that iteration is: "+fNew);
    }
    
    public String primeFinder(int interation)
    {
      return "";  
    }

}
