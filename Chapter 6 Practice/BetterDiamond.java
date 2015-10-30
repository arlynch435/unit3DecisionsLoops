import java.util.Scanner;
public class BetterDiamond
{
   public static void diamondMaker()
   {
       System.out.print("Enter a side length: ");
       Scanner s= new Scanner(System.in);
       int sideLength=s.nextInt();
       int diagonal=(sideLength*2)-1;
       int column=1;
       while (column<=sideLength)
       {
           String star="";
           int starCount=0;
           while (starCount<(column*2)-1)
           {
               star+="*";
               starCount++;
            }
           int spaceCount=0;
           String space="";
            while (spaceCount<(diagonal-starCount)/2)
           {
               space+=" ";
               spaceCount++;
            }
           System.out.println(space+star);
           column++;
        }
        while (column-sideLength<=sideLength)
       {
           String star="";
           int starCount=0;
           while (starCount<((column-sideLength)*2)-1)
           {
               star+="*";
               starCount++;
            }
           int spaceCount=0;
           String space="";
            while (spaceCount<(diagonal-starCount)/2)
           {
               space+=" ";
               spaceCount++;
            }
           System.out.println(space+star);
           column++;
        }
    }

}
