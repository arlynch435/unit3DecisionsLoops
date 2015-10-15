public class StringCompare
{
    public static void main(String[] args)
    {
        String word1 = "catalog";
        String word2 = "cat";
        if (word1.compareTo("aaa")>0)
        {
            System.out.println("Word 1 is greater than the phrase \"aaa\"");
        }
        if (word1.equals(word2))
        {
            System.out.println("Word 1 is equal to word 2");
        }
        if (word1.compareTo(word2)<0)
        {
            System.out.println("Word 1 is less than word 2");
        }
        if (word1.substring(0,3).compareTo(word2.substring(0,3))==0)
        {
            System.out.println("Word 1 has the same 3-letter prefix as word 2");
        }
    }

}
