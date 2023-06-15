import java.util.*;
class Nogreater extends Exception
{
    public String toString()
    {
        return "Entered number is Greater than 10";
    }
}
public class Customexception 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a=s.nextInt();
        if(a>10)
        {
            try
            {
                
            }
            catch(Exception e)
            {
                e.toString();
            }
        }
        else
        System.out.println("Thankyou for Entering the number\n");
    }
    
}
