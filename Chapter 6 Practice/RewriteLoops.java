import java.util.Scanner;
public class RewriteLoops
{
    public static void r15()
    {
        int s= 0;
        int i =1;
        while (i<=10)
        {
            s+=i;
            i++;
        }
    }
    public static void r16()
    {
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        double x=0;
        double s=1.0/(1+n*n);
        n++;
        x+=s;
        while (s>.010)
        {
            s=1.0/(1+n*n);
            n++;
            x+=s;
        }
    }

}
