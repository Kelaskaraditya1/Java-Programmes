import java.util.*;
public class StudentBasic
{
    String sid;
    String name;
    int rollno;
    char div;
    static int count=0;
    public void fees_paid(String cast)
    {
        if(cast=="open")
        System.out.println("The Student paid 1 Lakh\n");
        if(cast=="Obc")
        System.out.println("The Student paid  50k\n");
        if(cast=="Nt")
        System.out.println("The Student paid 13k\n");
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        StudentBasic s1 = new StudentBasic();
        System.out.println("Enter the Details of the Student");
        s1.sid=s.next();
        s1.name=s.next();
        s1.rollno=s.nextInt();
        s1.div=s.next().charAt(0);
        s1.fees_paid("Obc");
    }
}