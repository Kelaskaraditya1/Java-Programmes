import java.util.*;
public class Customer implements Cloneable
{
    String name,cid;
    int cscore;
    public Customer(String name,String cid,int cscore)
    {
        this.name=name;
        this.cid=cid;
        this.cscore=cscore;
    }
    public Customer fetchcustomer()
    {
        try
        {
            return (Customer) super.clone();
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
        return null;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Customer c1 = new Customer("Aditya","2021FHCO042",420);
        Customer c2 = c1.fetchcustomer();
        if((c2!=c1)&&(c2!=null))
        {
            System.out.println("Clone created Sucessfully\n");
            System.out.println("The name of the Customer is:"+c2.name);
            System.out.println("The Customer id of the Customer is:"+c2.cid);
            System.out.println("The Credit Score of the Customer is:"+c2.cscore);
        }

    }
}