import java.util.*;
public class Student1
{
    String name;
    String sid;
    int roll_no;
    char div;
    String cast;
    public void fees_paid(String cast)
    {
        if(cast=="Open")
        System.out.println("The Fees to be paid by the Student is:1Lakh");
        if(cast=="Obc")
        System.out.println("The Fees to be paid by the Student is:50K");
        if(cast=="Nt")
        System.out.println("The Fees to be paid by the Student is:10k");
    }
    public void display()
    {
        System.out.println("The sid of the Student is:"+sid);
        System.out.println("The name of the Student is:"+name);
        System.out.println("The roll no of the Student is:"+roll_no);
        System.out.println("The div of the Student is:"+div);
        System.out.println("The cast of the Student is:"+cast);
        fees_paid(cast);
    }
    public Student1(String name,String sid,int roll_no,char div,String cast)
    {
        this.name=name;
        this.sid=sid;
        this.roll_no=roll_no;
        this.div=div;
        this.cast=cast;
        display();
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Student1 s1= new Student1("Aditya","2021FHCO042",54,'A',"Obc");
    }
}