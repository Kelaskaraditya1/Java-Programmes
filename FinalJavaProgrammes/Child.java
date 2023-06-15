import java.util.*;
class Parent
{
    String name,address;
    int age;
    public void display()
    {
        System.out.println("My Name is "+name);
        System.out.println("I live in "+address+" in a apartment");
        System.out.println("I am "+age+" years old");
    }
    public Parent(String name,String address,int age)
    {
        this.name=name;
        this.address=address;
        this.age=age;
    }
}
public class Child extends Parent
{
    String qualification;
    public Child(String name,String address,int age,String qualification)
    {
        super(name, address, age);
        this.qualification=qualification;
    }
    public void display()
    {
        super.display();
        System.out.println("I am a "+qualification+" passed out");
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Child c = new Child("Aditya","Shivneri_Sadan",20,"Be");
        c.display();
        System.out.println();
        Parent p = new Parent("Sandeep","Shivneri_sadan",50);
        p.display();
    }
    
}