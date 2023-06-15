import java.util.Scanner;
public class input {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int age;
        String name;
        System.out.println("Enter Your Name and Age");
        age=s.nextInt();
        name=s.next();
        System.out.println("Your Name is "+name);
        System.out.println("Your Age is "+age);
    }
}
