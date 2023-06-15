import java.util.Scanner;
public class Constructor 
{
    int m;
    String n;
public Constructor(int m,String n)
{
this.m=m;
this.n=n;
}
public void setm(int m)
{
    this.m=m;
}
public void setn(String n)
{
    this.n=n;
}
public int getm()
{
return m;
}
public String getn()
{
return n;
}
  
public static void main(String[] args)
{
    int a;
    String b;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the value of a and b");
    a=s.nextInt();
    b=s.next();
  Constructor c1 = new Constructor(a,b);
  
  System.out.println(c1.m); 
  System.out.println(c1.m); 
  System.out.println(c1.n);
  
}
}
