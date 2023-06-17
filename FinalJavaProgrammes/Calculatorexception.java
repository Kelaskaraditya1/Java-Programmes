import java.util.*;
class Divisionbyzero extends Exception
{
    public String toString()
    {
        return "The entered number is 0 Please enter another number";
    }
}
class Maxrange extends Exception
{
    public String toString()
    {
        return "Please enter number less than 100000";
    }
}
public class Calculatorexception
{
    static int sum(int a,int b) throws Maxrange
    {
        if((a<100000)&&(b<100000))
        return a+b;
        else
        throw new Maxrange();
    }
    static int difference(int a,int b) throws Maxrange
    {
        if((a<100000)&&(b<100000))
        return a-b;
        else
         throw new Maxrange();
    }
    static int product(int a,int b) throws Maxrange
    {
        if((a<100000)&&(b<100000))
        return a*b;
        else
        throw new Maxrange();
    }
    static float ratio(int a,int b) throws Maxrange,Divisionbyzero
    {
        float ratio;
        if(((a<100000)&&(b<100000))&&(b!=0))
            ratio=a/b;
       
        else
        {
            if((a>100000)&&(b>100000))
            throw new Maxrange();
            else if(b==0)
            throw new Divisionbyzero();

        }
        return a/b;
    }
    static double power(int a,int b) throws Maxrange
    {
        if((a<100000)&&(b<100000))
        throw new Maxrange();
        else
        return Math.pow(a,b);
    }
    static void trignometricfunc(int angle,String ratio)
    {
        if(ratio=="sin")
        System.out.println("Sin of "+angle+" is :"+Math.sin(angle));
        if(ratio=="cos")
        System.out.println("Cosine of "+angle+"is:  " +Math.cos(angle));
        if(ratio=="tan")
        System.out.println("Tangent of "+angle+"is:"+Math.tan(angle));
        if(ratio=="cosec")
        System.out.println("Cosecante of "+angle+"is:"+1/(Math.sin(angle)));
        if(ratio=="sec")
        System.out.println("Secante of "+angle+"is:"+(1)/(Math.cos(angle)));
        if(ratio=="cot")
        System.out.println("Cotangent of "+angle+"is:"+ (1)/Math.tan(angle));
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your choice\n");
        int choice=s.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter 1 st number");
                int a=s.nextInt();
                System.out.println("Emter 2 nd number\n");
                int b=s.nextInt();
                try
                {
                    int add=sum(a,b);
                    System.out.println("The sum of both the numbers is:"+add+"\n");
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            break;
            case 2:
            System.out.println("Enter 1 st number");
                int c=s.nextInt();
                System.out.println("Emter 2 nd number\n");
                int d=s.nextInt();
                try
                {
                    int diff=difference(c,d);
                    System.out.println("The difference of both the numbers is:"+diff+"\n");
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
                break;
                case 3:
                System.out.println("Enter 1 st number");
                int e=s.nextInt();
                System.out.println("Emter 2 nd number\n");
                int f=s.nextInt();
                try
                {
                     int pro=product(e,f);
                    System.out.println("The product of both the numbers is:"+pro+"\n");
                }
                catch(Exception e1)
                {
                    System.out.println(e1);
                }
                break;
                case 4:
                System.out.println("Enter 1 st number");
                int g=s.nextInt();
                System.out.println("Emter 2 nd number\n");
                int h=s.nextInt();
                try
                {
                    float div=ratio(g,h);
                    System.out.println("The Ratio of a and b is:"+div+"\n");
                }
                catch(Exception e2)
                {
                    System.out.println(e2);
                }
                break;
                case 5:
                System.out.println("Enter the number to be raised\n");
                int base=s.nextInt();
                System.out.println("Enter the power to which it has to be raised\n");
                int power=s.nextInt();
                try
                {
                    double val=power(base,power);
                    System.out.println("The value of "+base+" raised to "+power+" is:"+val+"\n");
                }
                catch(Exception e3)
                {
                    System.out.println(e3);
                }
                break;
                case 6:
                System.out.println("Enter the angle \n");
                int angle=s.nextInt();
                System.out.println("Enter the ratio of angle to be calculated\n");
                String ratio=s.next();
                    trignometricfunc(angle, ratio);
                    break;
        }
    }
}