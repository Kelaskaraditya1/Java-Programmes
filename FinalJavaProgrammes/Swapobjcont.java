import java.util.*;
public class Swapobjcont
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
     static void swapcontent(Swapobjcont student[],int fi,int si)
     {
        Swapobjcont tmp=student[fi];
        student[fi]=student[si];
        student[si]=tmp;

     }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Swapobjcont student[] = new Swapobjcont[3];
        for(int i=0;i<3;i++)
        student[i]=new Swapobjcont();
        System.out.println("Enter the Informantion of the Students\n");
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter the name of the Student\n");
            student[i].name=s.next();
            System.out.println("Enter the Sid of the Student\n");
            student[i].sid=s.next();
            System.out.println("Enter the rollno of the Student\n");
            student[i].rollno=s.nextInt();
            System.out.println("Enter the div of the Student\n");
            student[i].div=s.next().charAt(0);
            System.out.println("Enter the cast of the Student\n");
            student[i].cast=s.next();
        }
        System.out.println("Enter the 2 index no's of the Students of which information is to be exchanged\n");
        int index1=s.nextInt();
        int index2=s.nextInt();
        System.out.println("The information of both the Students before Swapping are\n");
        student[index1].display();
        System.out.println("\n");
        student[index2].display();
        System.out.println("\n");
        swapcontent(student, index1, index2);
        System.out.println("The information of both the students after swapping the information are:\n");
        student[index1].display();
        System.out.println("\n");
        student[index2].display();
        System.out.println("\n");
    }
}