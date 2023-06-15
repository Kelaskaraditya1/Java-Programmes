import java.util.*;
public class Noofdivisors
{
    static void noofdiv(int n)
    {
        int count=0,A[]=new int [n],k=0;

        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
            count++;
            A[k++]=i;
            }
        }
        System.out.println("The no "+n+" is divisible by "+count+" divisors\n");
        System.out.println("The diviosrs are\n");
        for(int i=0;i<count;i++)
        System.out.print(A[i]+"\t");
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no whose divisors are to be found\n");
        int n=s.nextInt();
        noofdiv(n);
    }
}