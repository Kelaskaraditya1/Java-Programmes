import java.util.*;
public class Array2
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int A[][]= new int [10][10];
        int B[][]= new int [10][10];
        int C[][]= new int [10][10];
        int i,j,k,r,c,sum=0;
        System.out.println("Enter the no of rows and columns\n");
        r=s.nextInt();
        c=s.nextInt();
        System.out.println("Enter the elements of 1 st matrix\n");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            A[i][j]=s.nextInt();
        }
        System.out.println("Enter the elements of 2 nd Matrix\n");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            B[i][j]=s.nextInt();
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                for(k=0;k<r;k++)
                    sum+=A[i][k]*B[k][j];
                    C[i][j]=sum;
                    sum=0;
            }
        }
        System.out.println("The Product of Both the Matrices is:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            System.out.println(C[i][j]);
        }
    }
}