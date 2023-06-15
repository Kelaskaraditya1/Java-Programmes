import java.util.*;
public class Copyconstructors
{
    String name,degree;
    int age;
    public void display()
    {
        System.out.println("My name is "+name);
        System.out.println("I am "+age+" years old");
        System.out.println("I am a "+degree+" Graduate");
        System.out.println("I Graduated From DMCE College of Engineering");
    }
    public Copyconstructors(String name,String degree,int age)
    {
        this.name=name;
        this.degree=degree;
        this.age=age;
    }
    public Copyconstructors(Copyconstructors c1)
    {
        name=c1.name;
        degree=c1.degree;
        age=c1.age;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Copyconstructors c1= new Copyconstructors("Aditya", "BE", 20);
        Copyconstructors c2 = new Copyconstructors(c1);
        c1.display();
        System.out.println();
        c2.display();
        System.out.println();
        c2.name="Sandesh";
        c2.display();
    }
}