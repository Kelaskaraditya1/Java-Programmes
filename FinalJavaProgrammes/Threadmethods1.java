import java.util.*;
class Thread1 extends Thread   
{
    public void run()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of terms to be produced");
        int n=s.nextInt();
        int a=0,b=1;
        System.out.print(a+"\t"+b+"\t");
        for(int i=3;i<=n;i++)
        {
            int c=a+b;
            System.out.print(c+"\t");
            a=b;
            b=c;
        }
    }
}
public class Threadmethods1
{
    public static void main(String[] agrs)
    {
        Scanner s = new Scanner(System.in);
        Thread1 t1 = new Thread1();
        t1.setName("Fibonacci");
        System.out.println(t1.getName());
         System.out.println(t1.isAlive());
        t1.start();
    }
}
