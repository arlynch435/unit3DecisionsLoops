import java.util.Random;
public class MontyHall
{
   public static void hallChooser()
   {
       Random door= new Random();
       int yayCar1=0;
       int yayCar2=0;
       for (int i=0;
                i<1000;
                i++)
                {
       //First strategy, changes door to other door after host opens a door
       int playerChoice=door.nextInt(3)+1;
       //System.out.println("The player's choice is: "+playerChoice);
       int carChoice=door.nextInt(3)+1;
       int hostChoice=playerChoice;
       while (hostChoice==playerChoice || hostChoice==carChoice)
       {
           hostChoice=door.nextInt(3)+1;
        }
        //System.out.println("The host opened: "+hostChoice);
        int newChoice=playerChoice;
        while (newChoice==hostChoice ||newChoice==playerChoice)
        {
           newChoice=door.nextInt(3)+1; 
        }
        //System.out.println("The new choice is "+newChoice);
        boolean gotCar=true;
       if (newChoice==carChoice)
       {
           gotCar=true;
           //System.out.println("The new choice has the car!");
        }
        else
        {
            gotCar=false;
        }
       if (gotCar==true)
       {
           yayCar1++;
        }
    }
    for (int i=0;
               i<1000;
               i++)
               {
        int playerChoice=door.nextInt(3)+1;
       //System.out.println("The player's choice is: "+playerChoice);
       int carChoice=door.nextInt(3)+1;
       int hostChoice=playerChoice;
       while (hostChoice==playerChoice || hostChoice==carChoice)
       {
           hostChoice=door.nextInt(3)+1;
        }
        //System.out.println("The host opened: "+hostChoice);
        boolean gotCar=true;
       if (playerChoice==carChoice)
       {
           gotCar=true;
           //System.out.println("The new choice has the car!");
        }
        else
        {
            gotCar=false;
        }
       if (gotCar==true)
       {
           yayCar2++;
        }
    }
    System.out.println("The player got the car "+yayCar1+" times after switching.");
    System.out.println("The player got the car "+yayCar2+" times without switching.");
    }

}
