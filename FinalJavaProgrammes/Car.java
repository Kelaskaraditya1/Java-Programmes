import java.util.*;
class Motorvehicle
{
    String company,model;
    double price;
    public void display()
    {
        System.out.println("The Motorvehicle belongs to the "+company+" company");
        System.out.println("The Motorvehicle is of "+model+" model");
        System.out.print("The price of the Motorvehicle is:"+price);
    }
    public Motorvehicle(String company,String model,double price)
    {
        this.company=company;
        this.model=model;
        this.price=price;
    }
}
public class Car extends Motorvehicle
{
    int dr;
    double finalprice;
    public double discount(int dr)
    {
        double price1=price;
        price=price*(dr/100);
        finalprice=price1-price;
        return finalprice;
    }
    public Car(String company,String model,double price,int dr)
    {
        super(company,model,price);
        this.dr=dr;
        finalprice=discount(dr);
    }
    public void display()
    {
        super.display();
        System.out.println("The Final price after applying "+dr+"% discountrate is:"+finalprice);
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Motorvehicle m1=new Motorvehicle("MGhector","Inspirion" , 1200000);
        Car c1= new Car("Maruti","Esteem",1200000,10);
        m1.display();
        System.out.println();
        c1.display();
    }
}