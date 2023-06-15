import java.util.Scanner;
class Trignometery
{
    int degree;
    double sin,cos,tan,cosec,sec,cot;
    public double sin(int degree)
    {
        sin=Math.sin(Math.toRadians(degree));
        return sin;
    }
    public double cos(int degree)
    {
        cos=Math.cos(Math.toRadians(degree));
        return cos;
    }
    public double tan(int degree)
    {
        tan=Math.tan(Math.toRadians(degree));
        return tan;
    }
    public double cosec(int degree)
    {
        double s;
        s=sin(degree);
        s=1/s;
        cosec=s;
        return cosec;
    }
    public double sec(int degree)
    {
        double s;
        s=cos(degree);
        s=1/s;
        sec=s;
        return sec;
    }
    public double cot(int degree)
    {
        double s;
        s=tan(degree);
        s=1/s;
        cot=s;
        return cot;
    }
}
public class Mathematics 
{
    public static void main(String[] args)
    {
    int angle;
    double sin,cos,tan,cosec,sec,cot;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the value of the Angle");
    angle=s.nextInt();
    Trignometery t = new Trignometery();
    sin=t.sin(angle);
    cos=t.cos(angle);
    tan=t.tan(angle);
    cosec=t.cosec(angle);
    sec=t.sec(angle);
    cot=t.cot(angle);
    System.out.println("The value of sin of "+angle+" in rafian is "+sin);
    System.out.println("The value of cos of "+angle+" in rafian is "+cos);
    System.out.println("The value of tan of "+angle+" in rafian is "+tan);
    System.out.println("The value of cosec of "+angle+" in rafian is "+cosec);
    System.out.println("The value of sec of "+angle+" in rafian is "+sec);
    System.out.println("The value of cot of "+angle+" in rafian is "+cot);
    System.out.printf("I am Ironman");
    System.out.printf("The value of angle is %d and the angle %d is in Radians",angle,angle);
}
}