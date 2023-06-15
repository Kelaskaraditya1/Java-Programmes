import java.util.*;
public class Constructors
{
    String company,model;
    double price,finalprice;
    public void display()
    {
        System.out.println("The car belongs to the company:"+company);
        System.out.println("The model of the car is:"+model);
        System.out.println("The price of the car is:"+price);
    }
    public double discountprice(int dr)
    {
        double disprice=(price*dr)/100;
        finalprice=price-disprice;
        return finalprice;
    }
    public Constructors(String company,String model,double price,int dr)
    {
        this.company=company;
        this.model=model;
        this.price=price;
        display();
        System.out.println("The Final price of the car on "+dr+"% dicountrate is: "+discountprice(dr));
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String company,model;
        int dr;
        double price;
        System.out.println("Enter the Information about the car");
        System.out.println("Enter the company to which the car belongs");
        company=s.next();
        System.out.println("Enter the model of the car");
        model=s.next();
        System.out.println("Enter the price of the car");
        price=s.nextDouble();
        System.out.println("Enter the discountrate for maximum possible discount");
        dr=s.nextInt();
        Constructors car1=new Constructors(company, model, price, dr);
    }
}