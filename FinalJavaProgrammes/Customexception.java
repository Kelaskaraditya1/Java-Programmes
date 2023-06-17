import java.util.*;
class Nogreater extends Exception
{
    public String toString()
    {
        return "Entered number is lesser than 10";
    }
}
public class Customexception 
{
    public static void main(String[] args) throws Nogreater
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a=s.nextInt();
        if(a<10)
            System.out.println("Your entered number is:"+a+"\n");
        else
        throw new Nogreater();
        System.out.println("Thankyou for Entering the number\n");
    }
    
}
