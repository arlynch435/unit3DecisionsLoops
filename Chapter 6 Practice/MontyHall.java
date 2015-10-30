import java.util.Random;
public class MontyHall
{
   public static void hallChooser()
   {
       Random door= new Random();
       int yayCar1=0;
       int yayCar2=0;
       
       //First strategy, changes door to other door after host opens a door
       int playerChoice=door.nextInt(3)+1;
       System.out.println("The player's choice is: "+playerChoice);
       int carChoice=door.nextInt(3)+1;
       int hostChoice=playerChoice;
       while (hostChoice==playerChoice)
       {
           hostChoice=door.nextInt(3)+1;
        }
        System.out.print("The host opened: "+hostChoice);
       if (playerChoice==carChoice)
       {
           boolean gotCar=true;
        }
       if (gotCar==true)
       {
           yayCar1++;
        }
    }

}
