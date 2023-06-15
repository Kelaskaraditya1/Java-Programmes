import java.util.*;
abstract class Polygon
{
    int height;
   abstract public double perimeter(int height);
   public Polygon(int height)
   {
    this.height=height;
   }
   public void display()
   {
    System.out.println("The Area of the Polygon is:"+perimeter(height)+"\n");
   }
}
abstract class Triangle extends Polygon
{
    int base,height;
    public void display()
        {
            System.out.println("The Area of the Triangle is:"+area(height));
            System.out.println("The Perimeter of the Triangle is:"+perimeter(height)+"\n");
        }
    abstract public double area(int height);
    public double perimeter(int height)
    {
        double perimeter=(2*base)+height;
        return perimeter;
        
    } 
    public Triangle(int height,int base)
    {
        super(height);
        this.base=base;
    }
}
public class Equitriangle extends Triangle
{
    int height,base,side;
    public double area(int height)
    {
        double area=0.5*base*height;
        return area;
    }
    public double volume(int base,int height,int side)
    {
        double volume=(base*height)+(height*side)+(side*base);
        return volume;
    }
    public Equitriangle(int base,int height,int side)
    {
        super(height,base);
        this.side=side;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Equitriangle e = new Equitriangle(10,20,30);
        e.perimeter(20);
        e.area(20);
        e.volume(10,20,30);
        e.display();
    }
}