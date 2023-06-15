import java.util.Scanner;
class InputOutput
{
  public static void main(String[] args)
  {
    int age;
    String name;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Your Name");
    name=s.next();
    System.out.println("Enter your Age");
    age=s.nextInt();
    System.out.println("Your name is :"+name);
    System.out.println("Your Age is :"+age);
  }
}
