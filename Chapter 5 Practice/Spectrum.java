import java.util.Scanner;

/**
 * Write a description of class Spectrum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spectrum
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        double wavelength=s.nextDouble();
        if (wavelength>1e-1)
        {
            System.out.println("This is a radio wave with a frequency less than 3e9 Hz");
        }
        else if (wavelength>=1e-3&&wavelength<=1e-1)
        {
            System.out.println("This is a radio wave with a frequency between 3e9 Hz and 3e11 Hz");
        }
        else if (wavelength>=7e-7&&wavelength<1e-3)
        {
            System.out.println("This is a radio wave with a frequency between 3e11 Hz and 4e14 Hz");
        }
        else if (wavelength>=4e-7&&wavelength<7e-7)
        {
            System.out.println("This is a radio wave with a frequency between 4e14 Hz and 7.5e14 Hz");
        }
        else if (wavelength>=1e-8&&wavelength<4e-7)
        {
            System.out.println("This is a radio wave with a frequency between 7.5e14 Hz and 3e16 Hz");
        }
        else if (wavelength>=1e-11&&wavelength<1e-8)
        {
            System.out.println("This is a radio wave with a frequency between 3e16 Hz and 3e19 Hz");
        }
        else
        {
            System.out.println("This is a radio wave with a frequency greater than 3e19 Hz");
        }
    }

}
