import java.util.*;
public class Point
{
    public int x,y;
    public Point(int a,int b)
    {
        x=a;y=b;
    }
    static double distance(Point a,Point b)
    {
        double p=Math.pow(b.x-a.x,2);
        double z=Math.pow(b.y-a.y,2);
        double d=Math.pow(p+z,0.5);
        return d;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Point a = new Point(10,45);
        Point b= new Point(29,35);
       double dist= distance(a,b);
       System.out.println(dist);
    }
}