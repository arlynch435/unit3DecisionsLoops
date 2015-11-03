import java.util.Scanner;
public class NumericalMethods
{
   public void fibbonanciNumbers()
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
    
    public String factorFinder(int userNumber)
    {
      int i=1;
      String factors="The factors of the integer are";
      while (i<userNumber)
      {
          if (userNumber%i==0)
          {
              factors+=i;
              factors+="\n";
            }
            i++;
        }
        return factors;  
    }
    public void factorMaker()
   {
       Scanner s= new Scanner(System.in);
       System.out.print("Please enter your integer: ");
       System.out.println(this.factorFinder(s.nextInt()));
       }
       
       public String primeFinder(int userNumber)
    {
      int i=1;
      String primes="The prime numbers less than the number input are: ";
      while (i<userNumber)
      {
          int divisor=1;
          while (divisor<=i)
          {
              if (i%divisor!=0)
              {
                 primes+=i;
                 primes+="\n";
                }
                divisor++;
            }
            i++;
        }
        return primes;  
    }
    public void primeMaker()
   {
       Scanner s= new Scanner(System.in);
       System.out.print("Please enter your integer: ");
       System.out.println(this.primeFinder(s.nextInt()));
       }
    }

