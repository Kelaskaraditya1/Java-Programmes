import java.util.*;
class First extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        System.out.println(" In Forward Direction "+i+"\t");
    }
}
class Second implements Runnable
{
    public void run()   
    {
        for(int i=10;i>=1;i--)
        System.out.println("In Reverse Direction"+i+"\t");
    }
}
public class FirstThread
{
    public static void main(String[] args)
    {
        First t1 = new First();
        t1.start();
        Second bullet = new Second();
        Thread gun = new Thread(bullet);
        gun.start();
    }
}