import java.util.*;
public class Student3
{
    String name,sid,cast;
    int rollno,fees;
    char div;
    public void display()
    {
        System.out.println("The name of the Student is:"+name);
        System.out.println("The Sid of the Student is:"+sid);
        System.out.println("The rollno of the Student is:"+rollno);
        System.out.println("The div of the student is:"+div);
        System.out.println("The cast of the Student is:"+cast);
        System.out.println("The Fees to be paid by the Student is:"+fees);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Student3 s[]=new Student3[3];
        for(int i=0;i<3;i++)
        s[i]= new Student3();
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter the name of the Student\n");
            s[i].name=sc.next();
            System.out.println("Enter the Sid of the Student\n");
            s[i].sid=sc.next();
            System.out.println("Enter the rollno of the Student\n");
            s[i].rollno=sc.nextInt();
            System.out.println("Enter the div of the Student\n");
            s[i].div=sc.next().charAt(0);
            System.out.println("Enter the cast of the Student\n");
            s[i].cast=sc.next();
            System.out.println("Enter the fees of the Student\n");
            s[i].fees=sc.nextInt();   
        }
        for(int i=0;i<3;i++)
        {
            s[i].display();
            System.out.println("\n");
        }
    }
}