import java.util.*;
interface Camera
{
    public void takepic();
    public void recordvideo();
}
interface Wifi
{
    public void shownetworks();
    public void connecttonetwork(String name);
    public String[] enternetworks();
}
interface Telephone
{
    public void call();
}
class Phone implements Telephone
{
    Scanner s = new Scanner(System.in);
    public void calculator()
    {
        System.out.println("Enter the first number\n");
        int a=s.nextInt();
        System.out.println("Enter the second number\n");
        int b=s.nextInt();
        System.out.println("Enter Your Choice\n");
        int choice=s.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("The Sum of a and b is:"+(a+b)+"\n");
            break;
            case 2:
            System.out.println("The Difference of a and b is:"+(a-b)+"\n");
            break;
            case 3:
            System.out.println("The Product of a and b is:"+(a*b)+"\n");
            break;
            case 4:
            System.out.println("The Ratio of a and b is:"+(a/b)+"\n");
            break;
            case 5:
            System.out.println("The Modulo of a and b is:"+(a%b)+"\n");
            break;
            case 6:
            System.out.println("The value of a^b is:"+(Math.pow(a,b))+"\n");
            break;
        }
    }
    public void call()
    {
        System.out.println("Enter the name of the person to be called\n");
        String name=s.next();
        System.out.println("Enter the phone no of the person\n");
        long phone=s.nextLong();
        System.out.print("\tCalling "+name+" on his mobile...\n");
        System.out.println("\tCall Connected\n");
    }
}
public class Smartphone extends Phone implements Camera,Wifi
{
    public void takepic()
    {
          System.out.println("\tStarting Camera\n");
        System.out.println("\tCapturing Pic\n");
        System.out.println("\tSaving image to Gallery\n");
    }
    public void recordvideo()
    {
        System.out.println("\tStarting Camera\n");
        System.out.println("\tRecording Video\n");
        System.out.println("\tSaving to Gallery");
    }
    public void shownetworks()
    {
       String network[]=enternetworks();
       for(String name:network)
       System.out.println(name+"\t");
    }
    public void connecttonetwork(String name)
    {
        System.out.println("Tap to connect to network\n");
        System.out.println("Connected to network "+name+" sucessfully\n");
        System.out.println(name+"\t Connected\n");
    }
    public String[] enternetworks()
    {
        System.out.println("Enter the number of networks around you\n");
        int no=s.nextInt();
        System.out.println("Enter the networks\n");
        String networks[]=new String[no];
        for(int i=0;i<no;i++)
        networks[i]=s.next();
        return networks;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Smartphone p = new Smartphone();
        System.out.println("Enter Your choice\n");
        int choice=s.nextInt();
        switch(choice)
        {
            case 1:
            p.calculator();
            break;
            case 2:
            p.call();
            break;
            case 3:
            p.takepic();
            break;
            case 4:
            p.recordvideo();
            break;
            case 5:
            p.shownetworks();
            System.out.println("Enter the name of the network to be connected\n");
            String name=s.next();
            p.connecttonetwork(name);
            break;
            case 6:
            break;
        }
    }
    }
   