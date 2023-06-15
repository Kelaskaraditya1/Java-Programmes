import java.util.*;
public class Mathfunctions
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int choice;     
        System.out.println("Enter yor choice\n");
        choice=s.nextInt();
        while(choice!=7)
        {
        switch(choice)
        {
            case 1:
            int random=((int)Math.random()+1);
            System.out.println("The Random number generated is:"+random);
            break;
            case 2:
            System.out.println("Enter the number to be roundoff");
            double number=s.nextDouble();
            System.out.println("The rounded off number ahead is:"+Math.ceil(number));
            System.out.println("The rounded off number below is:"+Math.floor(number));
            break;
            case 3:
            System.out.println("Enter both the numbers to be compared");
            double no1=s.nextDouble();
            double no2=s.nextDouble();
            System.out.println("The maximum among both numbers entered is:"+Math.max(no1,no2));
            System.out.println("The minimum among both numbers entered is:"+Math.min(no1,no2));
            break;
            case 4:
            System.out.println("Enter the number and the poer to which it has to be raised");
            double a=s.nextDouble();
            double b=s.nextDouble();
            System.out.println("The value of a^b is:"+Math.pow(a,b));
            System.out.println("Enter the number whose Squareroot and Cuberoot is to be Found");
            double no=s.nextDouble();
            System.out.println("The Squareroot of the Entered number is:"+Math.sqrt(no));
            System.out.println("The Cuberoot of the entered number is:"+Math.cbrt(no));
            break;
            case 5:
            System.out.println("Enter the no whose natural and common log is to be found");
            double lno=s.nextDouble();
            System.out.println("The natural log of the number is:"+Math.log(lno));
            System.out.println("The common log of the numbe is:"+Math.log10(lno));
            break;
            case 6:
            System.out.println("Enter the angle whose trignometric Ratios is to be Found");
            double angle=s.nextDouble();
            System.out.println("The Value of Sine of angle in radian is:"+Math.sin(angle));
            System.out.println("The Value of cosine of angle in radian is:"+Math.cos(angle));
            System.out.println("The Value of Tangent of angle in radian is:"+Math.tan(angle));
            System.out.println("The Value of cosec angle in radian is:"+1/(Math.sin(angle)));
            System.out.println("The Value of sec of angle in radian is:"+1/(Math.cos(angle)));
            System.out.println("The Value of cot of angle in radian is:"+1/(Math.tan(angle)));
            break;
            case 7:
            break;
        }
    }
    }
}