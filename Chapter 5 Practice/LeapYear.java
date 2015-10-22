import java.util.Scanner;
public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the year: ");
        int userYear=s.nextInt();
        if ((userYear%4>0) || (userYear%100==0&&userYear%400!=0&&userYear>=1582))
        {
            System.out.println("This year is NOT a leap year.");
        }
        else
        {
            System.out.println("This year is a leap year.");
        }
    }

}
