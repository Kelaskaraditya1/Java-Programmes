import java.util.Scanner;
class Multithreading extends Thread
{
    public void run()
    {
try 
{
 System.out.println("Thread "+Thread.currentThread().getId()+" is running");   
}
 catch (Exception e)
 {
    System.out.println("Exception is found");
}
}
}
public class Multithread
{
    public static void main(String[] args)
    {
    int i;
    int n;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the valu of n");
    n=s.nextInt();
   for(i=0;i<n;i++)
   {
    Multithreading object = new Multithreading();
    object.start();
   }
}
}