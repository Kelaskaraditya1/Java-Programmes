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
    int base,height;
    public double area()
    {
        double area=0.5*base*height;
        return area;
    }
    public double perimeter()
    {
        double perimeter=base+height+base;
        return perimeter;
    }
}
class Equitraingle extends Triangle
{
    int side;
    public double area()
    {
        double area=0.43301*side*side;
        return area;
    }
    public double perimeter()
    {
        double perimeter=3*side;
        return perimeter;
    }
    public Equitraingle(int side)
    {
        this.side=side;
    }
}
public class Multilevel
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the side of the Equilateral Triangle");
        System.out.println();
        int side=s.nextInt();
        Equitraingle e1 = new Equitraingle(side);
        System.out.println("The area of Equilateral Triangle is "+e1.area());
        System.out.println();
        System.out.println("The perimeter of Equilateral Triangle is "+e1.perimeter());
        System.out.println();
        System.out.println("Enter the base and height of the Triangle");
        System.out.println();
        Triangle t1 = new Triangle();
        t1.base=s.nextInt();
        t1.height=s.nextInt();
        System.out.println("The area of Triangle is "+t1.area());
        System.out.println();
        System.out.println("The perimeter of Triangle is "+t1.perimeter());
        System.out.println();
    }
}