import java.util.*;
class Polygon
{
    int dimensions;
    double area,perimeter;
    public double area()
    {
        return area;
    }
    public double perimeter()
    {
        return perimeter;
    }
}
class Triangle extends Polygon
{
    int bredth,height;
    public double area()
    {
        double area=0.5*bredth*height;
        return area;
    }
    public double perimeter()
    {
        double perimeter=2*bredth*height;
        return perimeter;
    }
}
class Equilateral extends Triangle
{
    int side;
    public double area()
    {
        double area=0.4331*side*side;
        return area;
    }
    public double perimeter()
    {
        double perimeter=3*side;
        return perimeter;
    }
    public void display()
    {
        System.out.println("The Area of the Equilateral Triangle is:"+area()+"\n");
        System.out.println("The Perimeter of the Equilateral Triangle is:"+perimeter()+"\n");
    }
    public Equilateral(int side)
    {
        this.side=side;
        display();
    }
}
class Circle extends Polygon
{
    int radius;
    public double area()
    {
        double area=3.142*radius*radius;
        return area;
    }
    public double perimeter()
    {
        double perimeter=2*3.142*radius;
        return perimeter;
    }
    public void display()
    {
        System.out.println("The area of the Circle is:"+area()+"\n");
        System.out.println("The Perimeter of the Circel is:"+perimeter()+"\n");
    }
    public Circle(int radius)
    {
        this.radius=radius;
        display();
    }
}
public class Hybridinheritance
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Side of the Equilateral Triangle\n");
        int side=s.nextInt();
        Equilateral e =new Equilateral(side);
        System.out.println("Enter the Radius of the Circle\n");
        int radius=s.nextInt();
        Circle c =new Circle(radius);
    }
}