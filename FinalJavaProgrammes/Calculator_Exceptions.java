import java.util.*;
class Divzero extends Exception
{
    public String getMessage()
    {
        return "Cannot divide by 0";
    }
}
class Maxrange extends Exception
{
    public String toString()
    {
        return "Enter value less than 100000";
    }
}
public class Calculator_Exceptions 
{
    static int add(int a,int b) throws Maxrange
    {
        if((a<100000)&&(b<100000))
        return a+b;
        else
        throw new Maxrange();
    }
   static int diff(int a,int b) throws Maxrange
    {
           if((a<100000)&&(b<100000))
        return a-b;
        else
        throw new Maxrange();
    }
      static int pro(int a,int b) throws Maxrange
    {
       if((a<100000)&&(b<100000))
        return a*b;
        else
        throw new Maxrange(); 
    }
       static double ratio(int a,int b) throws Maxrange,Divzero
    {
        if((a>=100000)&&(b>=100000))
        throw new Maxrange();
        else if(b==0)
        throw new Divzero();
        else
        return a/b;
    }
    public static void main(String[] args)
    {
        int a,b,choice,c;
        double d;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a and b");
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("Enter your choice");
        choice=s.nextInt();
        switch(choice)
        {
            case 1:
                try
                {
                    c=add(a,b);
                System.out.println("The sum of a and b is:"+c);
                }
                catch(Exception e)
                {
                System.out.println(e.toString());
                }
                break;
                case 2:
                    try
                    {
                        c=diff(a,b);
                    System.out.println("The difference of a and b is:"+c);
                    }
                    catch(Exception e)
                    {
                        System.out.println(e.toString());
                    }
                    break;
                    case 3:
                        try
                        {
                        c=pro(a,b);
                        System.out.println("The product of a and b is:"+c);
                        }
                        catch(Exception e)
                        {
                            System.out.println(e.toString());
                        }
                        break;
                        case 4:
                            try
                            {
                            try{
                                 d=ratio(a,b);
                            System.out.println("The ratio of a and b is:"+d);
                            }
                            catch(Exception e)
                            {
                                System.out.println(e.toString());
                            }
                            }
                            catch(Exception e)
                            {
                                System.out.println(e.getMessage());
                            }
                            break;
        }
    }
}
