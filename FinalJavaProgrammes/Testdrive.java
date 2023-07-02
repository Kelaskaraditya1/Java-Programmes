import java.util.*;
class Medicaltest extends Thread
{
    public String name;
    public void run()
    {
        try 
        {System.out.println("Medical Test for "+name+" started.");
        Thread.sleep(1000);
        System.out.println("Medical test for "+name+" completed successfully.");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public Medicaltest(String name)
    {
        this.name=name;
    }
}
class Drivingtest extends Thread
{
    String name;
    public Drivingtest(String name)
    {
        this.name=name;
    }
    public void run()
    {
        try 
        {System.out.println("Driving Test for "+name+" started.");
        Thread.sleep(2000);
        System.out.println("Driving test for "+name+" completed successfully.");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class Interview extends Thread
{
    String name;
    public Interview(String name)
    {
        this.name=name;
    }
    public void run()
    {
        try 
        {System.out.println("Interview for "+name+" started.");
        Thread.sleep(3000);
        System.out.println("Interview for "+name+" completed successfully.");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class Testdrive
{
    public static void main(String[] args) throws Exception
    {
        Medicaltest m = new Medicaltest("Aditya");
        m.start();
        m.join();
        Thread.sleep(1000);
        Drivingtest d =new  Drivingtest ("Aditya");
        d.start();
        d.join();
        Thread.sleep(1000);
        Interview i = new Interview("Aditya");
        i.start();
    }
}