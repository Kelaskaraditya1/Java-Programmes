import java.util.*;
public class Methodoverloading
{
    public void method(int a,int b)
    {
        System.out.println("The sum of a and b is:"+(a+b));
        System.out.println("The difference of a and b is:"+(a-b));
        System.out.println("The Product of a and b is:"+(a*b));
        System.out.println("The ratio of a and b is:"+(a/b));
        System.out.println("The remainder of a and b is:"+(a%b));
        System.out.println("The value of  a^b is:"+(Math.pow(a,b)));    
    }
    public void method(int A[])
    {
        int sum=0;
        for(int val:A)
            sum=sum+val;
            System.out.println("The Sum of the elements of Array is:"+sum);
    }
    public int method(int a,int ...B)
    {
        int sum=100;
        for(int val:B)
        sum=sum+val;
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Methodoverloading m = new Methodoverloading();
        m.method(10,20);
        System.out.println();
        m.method(new int[] {1,2,3,4,5,6,7,8,9,10});
        System.out.println();
        int sum=m.method(0,1,2,3,4,5,6,7,8,9,10);
        System.out.println();
        System.out.println("The Sum of elements of array is:"+sum);
    }
}