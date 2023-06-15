import java.util.*;
public class Trignometery
{
    static void trigvalue(String ratio,int angle)
    {
        double val;
        switch (ratio)
        {
            case "sine":
            val=Math.sin(angle);
            System.out.println("The value of sine of angle is:"+val);
            break;
            case "cosine":
            val=Math.cos(angle);
            System.out.println("The value of cosine of angle is:"+val);
            break;
            case "tangent":
            val=Math.tan(angle);
            System.out.println("The value of tangetn of angle is:"+val);
            break;
            case "cosecent":
            val=Math.sin(angle);
            val=1/val;
            System.out.println("The value of cosec of angle is:"+val);
            break;
            case "secent":
            val=Math.cos(angle);
            val=1/val;
            System.out.println("The value of secent of angle is:"+val);
            break;
            case "cot":
            val=Math.tan(angle);
            val=1/val;
            System.out.println("The value of Cot of angle is:"+val);
            break;
        }


    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        trigvalue("sine", 45);
    }
}