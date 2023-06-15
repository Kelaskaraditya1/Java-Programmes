import java.util.*;
public class Point
{
    double x,y;
    static double distance(Point p1,Point p2)
    {
        double sum1=Math.pow((p2.x-p1.x),2);
        double sum2=Math.pow((p2.y-p1.y),2);
        double distance=Math.pow((sum1+sum2),0.5);
        return distance;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Point p1= new Point();
        Point p2= new Point();
        System.out.println("Enter the coordinates of 1 st Point\n");
        p1.x=s.nextDouble();
        p1.y=s.nextDouble();
        System.out.println("Enter the coordinates of 2 nd Point\n");
        p2.x=s.nextInt();
        p2.y=s.nextInt();
       double distance= distance(p1,p2);
       System.out.println("The Distance between Points p1 nd p2 is"+distance);
    }
}