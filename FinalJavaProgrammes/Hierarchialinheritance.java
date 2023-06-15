import java.util.*;
class Motorvehiclle
{
    String company,model;
    double price;
    public void display()
    {
        System.out.println("The Motorvehicle belongs to "+company+" company");
        System.out.println("The Motorvehicle is of "+model+" model");
        System.out.println("The price of Motorvehicle is:"+price);
    }
    public Motorvehiclle(String company,String model,double price)
    {
        this.company=company;
        this.model=model;
        this.price=price;
    }
}
class Car extends Motorvehiclle
{
    int dr;
    double finalprice;
    public double discount(int dr)
    {
        double price1=price;
        price=price*dr/100;
        finalprice=price1-price;
        return finalprice;
    }
    public void display()
    {
        super.display();
        System.out.println("The final price of the Car at "+dr+"% discount rate is "+finalprice);
    }
    public Car(String company,String model,int dr,double price)
    {
        super(company,model,price);
        this.dr=dr;
        discount(dr);
    }
}
class Bike extends Motorvehiclle
{
    int dr;
    double finalprice;
    public double discount(int dr)
    {
        double price1=price;
        price=price*dr/100;
        finalprice=price1-price;
        return finalprice;
    }
    public Bike(String company,String model,int dr,double price)
    {
        super(company,model,price);
        this.dr=dr;
        discount(dr);
    }
    public void display()
    {
        super.display();
        System.out.println("The final price of the Bike at "+dr+"% discount rate is "+finalprice);
    }
}
public class Hierarchialinheritance
{
    public static void main(String[] args)
    {
    Scanner s = new Scanner(System.in);
    Car c1 = new Car("Tesla","Eports",10,1000000);
    Bike b1 = new Bike("KTM","DUKE",10,200000);
    c1.display();
    System.out.println();
    b1.display();
}
}
