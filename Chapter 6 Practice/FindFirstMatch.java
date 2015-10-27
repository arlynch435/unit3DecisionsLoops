


public class FindFirstMatch
{
    //return position of first space or -1 if no spaces
    public static int findFirstMatch(String str)
    {
        int position=0;
        boolean found=false;
        while (found!= true && position <str.length())
        {
            char ch=str.charAt(position);
            if (ch==' ')
            {
                found= true;
            }
            else
            {
                position++;
            }
        }
        if(found)
            {
                return position;
            }
        else
            {
                return -1;
            }
    }

}
