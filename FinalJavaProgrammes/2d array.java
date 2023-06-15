import java.util.*;
class Aditya
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a[][] = new int [2][2];
        int b [][] = new int [2][2];
        int c [][] = new int [2][2];
        int i,j;
        System.out.println("Enter elements of 1 st matrix");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            a[i][j]=s.nextInt();
        }
             System.out.println("Enter elements of 2 nd matrix");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            b[i][j]=s.nextInt();
        }
          for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            c[i][j]=a[i][j]+b[i][j];
        }
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            System.out.println(c[i][j]);
        }
    }
    }