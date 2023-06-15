import java.util.*;
public class Test
{
    public static void main(String[] args)
    {
        int i,j,k,l,n;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=1+i;k++)
            {
                System.out.print("*");
            }
            for(l=i;l<n;l++)
            {
                System.out.print(" ");
            }
           
            System.out.println();
        }
        
    }
}