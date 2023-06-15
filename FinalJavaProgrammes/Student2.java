import java.util.*;
public class Student2
{
    String sid,name,cast;
    int rollno,fees;
    char div;
    public void display()
    {
        System.out.println("The sid of the Student is:"+sid);
        System.out.println("The name of the Student is:"+name);
        System.out.println("The roll no of the Student is:"+rollno);
        System.out.println("The div of the Student is:"+div);
    }
    public void fees_paid(String cast,int fees)
    {
        if(cast=="Obc")
        System.out.println("The Fees to be paid by the Student is:"+fees/2);
        if(cast=="Nt")
        System.out.println("The Fees to be paid by the Student is:"+fees/3);
        if(cast=="Sc")
        System.out.println("The Fees to be paid by the Student is:"+fees/5);
    }
    public Student2(String sid,String name,int rollno,char div,int fees)
    {
        this.sid=sid;
        this.name=name;
        this.rollno=rollno;
        this.div=div;
        this.fees=fees;
        display();
        System.out.println("The cast of the Stuent is Open");
        System.out.println("The Fees to be paid by the Student is:"+fees);
    }
    public Student2(String sid,String name,int rollno,char div,int fees,String cast)
    {
        this.sid=sid;
        this.name=name;
        this.rollno=rollno;
        this.div=div;
        this.fees=fees;
        display();
        System.out.println("The cast of the Stuent is:"+cast);
        fees_paid(cast,fees);

    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Student2 s1= new Student2("2021FHCO042","Vinay",47,'A',100000);
        System.out.println("\n");
        Student2 s2= new Student2("2021FHCO042","Aditya",54,'A',100000,"Obc");
    }
}