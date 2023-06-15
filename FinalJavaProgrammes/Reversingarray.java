import java.util.*;
public class Reversingarray
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int A[]= new int[200];
        int n,i,j,tmp;
        System.out.println("Enter the no of elements");
        n=s.nextInt();
        System.out.println("Enter the elements");
        for(i=0;i<n;i++)
        A[i]=s.nextInt();
        int length=n-1;
        if(n%2==0)
        {
        for(i=0,j=length;((i<=(length/2))&&(j>=((length/2)+1)));i++,j--)
        {
            tmp=A[i];
            A[i]=A[j];
            A[j]=tmp;
        }
        for(i=0;i<n;i++)
        System.out.println(A[i]);
    }
    else
    {
        for(i=0,j=length;((i<=(length/2-1))&&(j>=(length/2+1)));i++,j--)
        {
            tmp=A[i];
            A[i]=A[j];
            A[j]=tmp;
        }
        for(i=0;i<n;i++)
        System.out.println(A[i]);
    }
}
}