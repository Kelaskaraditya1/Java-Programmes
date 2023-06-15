import java.util.*;
public class Armstrong
{
    static void armstrong(int n)
    {
        int counter=0,sum=0;
        int A[]=new int[200];
        int no=n;
        while(n>10)
        {
            int rem=n%10;
            n=n/10;
            A[counter++]=rem;
        }
        if(n<10)
            A[counter++]=n;
        for(int i=0;i<counter;i++)
            sum=(int) (sum+Math.pow(A[i],3));
        if(sum==no)
        System.out.println("The entered number is a Armstrong\n");
        else
        System.out.println("The entered number is not a Armstrong\n");
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to be examined wheather Armstrong or not\n");
        int num=s.nextInt();
        armstrong(num);
    }
}