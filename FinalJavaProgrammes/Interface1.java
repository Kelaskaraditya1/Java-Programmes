interface Wifi
{
     String[] shownetwork();
     void connecttonet(String name);
}
public class Aditya implements Wifi
{
    public String[] shownetwork()
    {
        String A[]={"Aditya","Sanjana","Sandeep","taklya","Pappya","Palak"};
        return A;
    }
    public void connecttonet(String name)
    {
        System.out.println("Tap to connect to a network");
        System.out.println("Sucessfully Connected to network:"+name);
    }
    public static void main(String[] args)
    {
     Aditya a = new Aditya();
    String networks [] = a.shownetwork();
    System.out.println(networks);
    a.connecttonet("Aditya");
    }
}