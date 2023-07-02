import java.util.*;
class Thread1 extends Thread
{
    public void run()
    {
    if(Thread.currentThread().isDaemon())
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no to be examined wheather Armstrong or not");
        int no=s.nextInt();
        int n=no,sum=0,rem;
        while(n!=0)
        {
            rem=n%10;
            sum+=Math.pow(rem, 3);
            n=n/10;
        }
        if(sum==no)
        System.out.println("The Number is Armstrong");
        else
        System.out.println("The Number is not Armstorng");
    }
    else
        System.out.println("I am not a Deamon Thread");
    }
}
public class Deamonthread
{
    public static void main(String[] args)
    {
        Thread1 t1 = new Thread1();
        t1.setDaemon(true);
        t1.start();

    }
}