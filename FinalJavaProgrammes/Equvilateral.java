import java.util.*;
abstract class Polygon
{
    int base,height,side;
    public abstract double area(int base,int height);
    public abstract double perimeter(int side);
    public double volume(int height)
    {
        double volume=area(base,height)*height;
        return volume;
    }
}
abstract class Triangle extends Polygon
{
    public double area(int base,int height)
    {
        double area=0.5*base*height;
        return area;
    }
}
public class Equvilateral extends Triangle
{
    public double perimeter(int side)
    {
        double perimeter=3*side;
        return perimeter;
    }
    public double area(int side)
    {
        double area=0.43301*side*side;
        return area;
    }
    public double volume(int l,int b,int h)
    {
        double volume=((l*b)+(b*h)+(l*h));
        return volume;
    }
    public static void main(String[] args)
    {
    Equvilateral e = new Equvilateral();
    double volume1=e.volume(10);
    System.out.println("The volume of the Polygon is:"+volume1+"\n");
    double area1=e.area(10,20);
    System.out.println("The Area of the Triangle is:"+area1+"\n");
    double perimeter1=e.perimeter(10);
    System.out.println("The Perimeter of the Equvilateral Triangle is:"+perimeter1);
    double volume2=e.volume(10,20,30);
    System.out.println("The Volume of the Prisim is:"+volume2);
    }
}
