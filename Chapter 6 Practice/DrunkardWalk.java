import java.util.Random;
public class DrunkardWalk
{
    public static void main(String[] args)
    {
     Random choice=new Random();
     int drunkardx=0;
     int drunkardy=0;
     for (int i=0;
               i<100;
               i++)
               {
     int nextChoice=choice.nextInt(4)+1;
     if (nextChoice==1)
     {
         drunkardy++;
        }
        else if (nextChoice==2)
        {
            drunkardx++;
        }
        else if (nextChoice==3)
        {
            drunkardy--;
        }
        else
        {
            drunkardx--;
        }
        
    }
    System.out.println("The drunkard's final positon is ("+drunkardx+","+drunkardy+")");
    }

}
