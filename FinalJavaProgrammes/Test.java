import java.util.*;
class Divby0 extends Exception
{
    public String tostString()
    {
        return "Pls enter number greater than 0\n";
    }
}
public class Test
{
    public static void main(String[] args) throws Divby0
    {
        HashSet<Integer> h1 = new HashSet<Integer>(0, 0)
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a and b\n");
        int a=s.nextInt();
        int b=s.nextInt();
       try
       {
        int c=a/b;
        System.out.println("The Ratio of a and b is:"+c);
       }
       catch(Divby0 e)
       {
        System.out.println(e);
       }

    }
}