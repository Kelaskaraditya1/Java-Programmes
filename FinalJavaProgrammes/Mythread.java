import java.util.*;
class Thread1 extends Thread
{
    public void run()
    {
        int i=0;
        while(i<5)
        System.out.println("I am ironman\n");
    }
}
class Thread2 extends Thread
{
    public void run()
    {
    int i=0;
    while(i<5)
    System.out.println("I am Batman\n");
    }
}
public class Mythread
{
    public static void main(String[] args)
    {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }

}