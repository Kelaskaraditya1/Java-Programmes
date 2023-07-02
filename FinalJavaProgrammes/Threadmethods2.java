import java.util.*;
// class Thread1 extends Thread
// {
//      Thread t2;
//     public void run()
//     {
//         int i=1;
//         while(i<10)
//         {
//             try{
//             System.out.println(i+" "+currentThread().getName());
//             Thread.sleep(1000);
//             }
//             catch(Exception e)
//             {
//                 System.out.println(e);
//             }
//             i++;
//         }
//     }
// }
 public class Threadmethods2 extends Thread
{
    static Thread t2;
    public void run()
    {
        int i=1;
        while(i<10)
        {
            try{
                t2.join();
            System.out.println(i+" "+currentThread().getName());
            Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            i++;
        }
    }
    public static void main(String[] args) throws Exception
    {
        int i=1;
        t2=Thread.currentThread();
        Threadmethods2 t1 = new Threadmethods2();
        t1.start();
        try
        {
        while(i<10)
        {
            System.out.println(i+" "+Thread.currentThread().getName());
            Thread.sleep(1000);
            i++;
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
}
}