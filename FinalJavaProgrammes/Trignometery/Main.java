package Trignometery;
import Trignometery.Sine;
import Trignometery.Cosine;
import Trignometery.Tangent;
import java.util.*;
public class Main 
{
    static void values(int angle)
    {
        Sine s = new Sine();
        Cosine c = new Cosine();
        Tangent t = new Tangent();
        System.out.println("The Value of Sin of angle is: "+s.sin(angle)+"\n");
        System.out.println("The Value of Cos of angle is: "+c.cosine(angle)+"\n");
        System.out.println("The value of Tan of angle is: "+t.tan(angle)+"\n");
        System.out.println("The value of cosec of angle is: "+s.cosec(angle)+"\n");
        System.out.println("The value of Sec of angle is: "+c.sec(angle)+"\n");
        System.out.println("The Value of Cot of angle is: "+t.cot(angle)+"\n");
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the angle in degrees\n");
        int angle=s.nextInt();
        values(angle);
    }
    
}
