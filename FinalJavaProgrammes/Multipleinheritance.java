interface Rectangle
{
    static final int length=10,bredth=20;
    public double area(int length,int bredth);
    public double perimeter(int length,int bredth);
}
interface Circle 
{
    public double area(int radius);
    public double perimeter(int radius);
}
public  class Multipleinheritance implements Rectangle,Circle
{
    int length,bredth,radius;
    public double area(int length,int bredth)
    {
        double area=length*bredth;
        return area;
    }
    public double perimeter(int length,int bredth)
    {
        double perimeter=2*(length+bredth);
        return perimeter;
    }
    public double area(int radius)
    {
        double area=3.142*radius*radius;
        return area;
    }
    public double perimeter(int radius)
    {
        double perimeter=3.142*radius*2;
        return perimeter;
    }
    public void display()
    {
        System.out.println("The Area of the Rectangle is:"+area(length,bredth));
        System.out.println("The Perimter of the Rectangle is:"+perimeter(length,bredth));
        System.out.println("The Area of the Circle is:"+area(radius));
        System.out.println("The Perimeter of the Circle is:"+perimeter(radius));
    }
    public Multipleinheritance(int length,int bredth,int radius)
    {
        this.length=length;
        this.bredth=bredth;
        this.radius=radius;
    }
    public static void main(String[] args)
    {
        Multipleinheritance m = new Multipleinheritance(10, 20, 15);
        m.display();
        System.out.println(Rectangle.length);
    }
}