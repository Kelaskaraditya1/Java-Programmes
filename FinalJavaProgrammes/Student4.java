import java.util.*;
public class Student4
{
    String name,cast,sid;
    int rollno;
    char div;
    public void display()
    {
        System.out.println("The name of the Student is:"+name);
        System.out.println("The Sid of the Student is:"+sid);
        System.out.println("The rollno of the Student is:"+rollno);
        System.out.println("The div of the Student is:"+div);
        System.out.println("The cast of the Student is:"+cast);
    } 
    public Student4(String name,String sid,String cast,int rollno,char div)
    {
        this.name=name;
        this.sid=sid;
        this.cast=cast;
        this.rollno=rollno;
        this.div=div;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Student4 s1= new Student4("Aditya","2021FHCO042","OBC",54,'A');
        Student4 s2=new Student4("Prathamesh","2021FHCO040","SC",52,'A');
        s1.display();
        System.out.println("\n");
        s2.display();
        System.out.println("\n");
        Student4 tmp=s1;
        s1=s2;
        s2=tmp;
        s1.display();
        System.out.println("\n");
        s2.display();        
    }
}