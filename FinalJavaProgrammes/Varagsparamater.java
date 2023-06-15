import java.util.*;
public class Varagsparamater
{
    static int sum(int a,int ...A)
    {
       int sum=0;
        for(int val:A)
        {
            sum=sum+val;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int k=sum(0,1,2,3,4,5);
        System.out.println("The Sum of elements is:"+k);
    }
}