import java.util.*;
public class Fibonacci
{
    static int fibonacci(int n)
    {
        if(n==1)
        return 0;
        else if(n==2)
        return 1;
        else
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of terms upto which Fibonacci series is to be obtained\n");
        int n=s.nextInt();
        // int a=0,b=1,c;
        // System.out.print(a+"\t");
        // System.out.print(b+"\t");
        // for(int i=3;i<=n;i++)
        // {
        //     c=a+b;
        //     System.out.print(c+"\t");
        //     a=b;
        //     b=c;
        for(int i=1;i<=n;i++)
        {
            int k=fibonacci(i);
            System.out.print    (k+"\t");
        }
        }
    }