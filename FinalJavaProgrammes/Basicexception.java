import java.util.*;
public class Basicexception
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the 1 st number\n");
        int a=s.nextInt();
        System.out.println("Enter the 2nd number\n");
        int b=s.nextInt();
        try
        {
            int c=a/b;
            System.out.println("The ratio of a and b is:"+c+"\n");
        }
        catch(Exception e)
        {
            System.out.println("Cannto find the ratio because:");
            System.out.print(e);
        }
    }
}