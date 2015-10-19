import java.util.Scanner;
public class CircleOverlapPart2
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Input the radius of the first circle: ");
      double radius1 = in.nextDouble(); 
      System.out.print("Input the x-coordinate of the first circle: ");
      double xcenter1 = in.nextDouble();
      System.out.print("Input the y-coordinate of the first circle: ");
      double ycenter1 = in.nextDouble();
      System.out.print("Input the radius of the second circle: ");
      double radius2 = in.nextDouble();
      System.out.print("Input the x-coordinate of the second circle: ");
      double xcenter2 = in.nextDouble();
      System.out.print("Input the y-coordinate of the second circle: ");
      double ycenter2 = in.nextDouble();
      if (radius1+radius2< Math.pow(Math.pow(xcenter2-xcenter1,2)+Math.pow(ycenter2-ycenter1,2),0.5))
      {
          System.out.println("The circles are disjoint");
        }
      else if ((radius1>Math.pow(Math.pow(xcenter2-xcenter1,2)+Math.pow(ycenter2-ycenter1,2),0.5)+radius2)
            || (xcenter1==xcenter2 && ycenter1==ycenter2) 
            || (radius2>Math.pow(Math.pow(xcenter2-xcenter1,2)+Math.pow(ycenter2-ycenter1,2),0.5)+radius1))
      {
          System.out.println("The circles are mutually contained");
        }
        else
        {
          System.out.println("The circles overlap");
        }
   }
}