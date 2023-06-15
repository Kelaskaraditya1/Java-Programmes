import java.util.*;
public class Reverse
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no\n");
        int n=s.nextInt();
        int A [] = new int [n];
        int count=0,c=0;
        for(int i=2;i<=(n-1);i++)
        {
            if(n%i==0)
            {count++;
            A[c++]=i;}
        }
        System.out.println("The no of divisors of "+n+" are "+count+" \n");
        System.out.println("The no of divisors are\n");
        for(int i=0;i<A.length;i++)
        System.out.println(A[i]);
    }
}