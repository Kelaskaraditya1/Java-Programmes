import java.util.*;
public class Student
{
    String name;
    String namecollege;
    int age;
    int yos;
    char div;
    int rollno;
    int fees;
    String cast;
    public void display()
    {
        System.out.println("The name of the Student is:"+name);
        System.out.println("The name of college of Student is:"+namecollege);
        System.out.println("The age of the Student is:"+age);
        System.out.println("The year of study the Student is:"+yos);
        System.out.println("The Div of the Student is:"+div);
        System.out.println("The rollno of the Student is:"+rollno);
    }
    Student(String sname,String scname,int sage,int syos,char sdiv,int srollno)
    {
        name=sname;
        namecollege=scname;
        age=sage;
        yos=syos;
        div=sdiv;
        rollno=srollno;
        display();
    }
    Student(String sname,String scname,int sage,int syos,char sdiv,int srollno,int sfees,String scast)
    {
        name=sname;
        namecollege=scname;
        age=sage;
        yos=syos;
        div=sdiv;
        rollno=srollno;
        fees=sfees;
        cast=scast;
        display();
        System.out.println("The cast of the Student is:"+cast);
        System.out.println("The Fees of the Stuent for General category is:"+fees);
        if(cast=="OBC")
        {
        fees=fees/2;
        System.out.println("Since Obc The Student is to pay:"+fees);
        }
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Student s1 = new Student("Aditya","Dmce",20,2,'A',54);
        Student s2 = new Student("Aditya","Dmce",20,2,'A',54,100000,"OBC");
    }
}