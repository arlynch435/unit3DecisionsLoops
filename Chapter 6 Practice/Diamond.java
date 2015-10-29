import java.util.Scanner;
public class Diamond
{
   public static void diamondMaker()
   {
       System.out.print("Enter a side length: ");
       Scanner s= new Scanner(System.in);
       int sideLength=s.nextInt();
       int diagonal=(sideLength*2)-1;
       int i=0;
       while (i<=sideLength)
       {
           String star= "*";
           for (int r=0;
                r<=(i*2)-1;
                r++)
                {
                    if (r==(i*2)-1)
                    {
                        System.out.print("\n");
                    }
                    else
                    {
                      System.out.print(star);
                    }
                }
           i++;
        }
        i=sideLength-1;
        while (i>0)
       {
           String star= "*";
           for (int r=0;
                r<=(i*2)-1;
                r++)
                {
                    if (r==(i*2)-1)
                    {
                        System.out.print("\n");
                    }
                    else
                    {
                      System.out.print(star);
                    }
                }
           i--;
        }
    }

}
