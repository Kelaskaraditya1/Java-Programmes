import java.util.Scanner;
public class Rectangle 
{
 int length,bredth;
 public void  setlength(int a)
 {
    if((a>0)&&(a<=20))
    length=a;
 }
 public void  setbredth(int a)
 {
    if((a>0)&&(a<=20))
    bredth=a;
 }
 public int getlength()
 {
    return length;
 }
 public int getbredth()
 {
    return bredth;
 }
 public static void main(String[] args)
 {
    int a,b,perimeter,area;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the length and bredthof the rectangle");
    a=s.nextInt();
    b=s.nextInt();
    Rectangle  r= new Rectangle();
    r.setlength(a);
    r.setbredth(b);
    perimeter=2*(r.getlength()+r.getbredth());
    area=(r.getlength()*r.getbredth());
    System.out.println("The Perimeter of the rectangle is :"+perimeter);
    System.out.println("The Area of the rectangle is :"+area);
 }   
}
