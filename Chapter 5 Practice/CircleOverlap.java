import java.util.Scanner;
public class CircleOverlap
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Input the radius of the first circle: ");
      double radius1 = in.nextDouble(); 
      System.out.print("Input the x-coordinate of the first circle: ");
      double xcenter1 = in.nextDouble();
      double ycenter1 = 0;
      System.out.print("Input the x-coordinate of the second circle: ");
      double radius2 = in.nextDouble(); 
      double xcenter2 = in.nextDouble();
      double ycenter2 = 0;
      if (radius1+radius2< (xcenter2-xcenter1))
      {
          System.out.println("The circles are disjoint");
        }
      else if ((radius1+radius2>xcenter2-xcenter1+radius2) 
                ||(radius1+radius2>xcenter2-xcenter1+radius1))
      {
          System.out.println("The circles are mutually contained");
        }
        else
        {
          System.out.println("The circles overlap");
        }
   }
}
