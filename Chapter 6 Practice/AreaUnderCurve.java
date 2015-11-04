import java.util.Random;
public class AreaUnderCurve
{
    public double A;
    public double B;
    public double C;
    public double XRight;
    public double XLeft;
    public double YTop;
    public double YBottom;
    public AreaUnderCurve(double A, double B, double C,double XRight,double XLeft)
    {
        this.A=A;
        this.B=B;
        this.C=C;
        this.XRight=XRight;
        this.XLeft=XLeft;
    }
    public boolean isAPositive()
    {
        if (this.A>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isANegative()
    {
        if (this.A<0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isAZero()
    {
        if (this.A>=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public double func(double pointx)
    {
        double pointy=0;
        pointy=(this.A*pointx*pointx)+(this.B*pointx)+this.C;
        return pointy;
    }
    public double findExtrema()
    {
        double extremay=0;
        extremay=(-this.B)/(2*this.A);
        return extremay;
    }
    public void boundaryBox()
    {
        //a positive, extrema positive
        if (this.isAPostive()==true)
        {
            if (this.findExtrema>0)
            {
                
            }
            else
            //a positive extrema negative
            {
                this.YBottom=this.findExtrema();
                double choice1=this.func(this.XRight);
                double choice2=this.func(this.XLeft);
                if (choice1>choice2)
                {
                    this.YTop=choice1;
                }
                else if (choice1<choice2)
                {
                    this.YTop=choice2;
                }
            }
        }
        //a negative extrema negative
        //a negative extrema positive
        
    }
}
