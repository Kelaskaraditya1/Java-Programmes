public class Student 
{
    String name;
    int rollno;
    char div;
    int age;
    public void display()
    {
        System.out.println("The name of the Student is:"+name);
        System.out.println("The rollno of the Student is:"+rollno);
        System.out.println("The div of the Student is:"+div);
        System.out.println("The age of the Student is:"+age);
    }
    Student(String name,int rollno,char div,int age)
    {
        this.name=name;
        this.rollno=rollno;
        this.div=div;
        this.age=age;
    }
    public static void main(String[] args)
    {
        Student s[]= new Student[3];
        
        s[0]=new Student("Aditya",54,'A',20);
        s[1]=new Student("Mayur",56,'A',20);
        s[2]=new Student("Prathamesh",52,'A',20);
        s[0].display();
        s[2].display();
        Student tmp;
        tmp=s[0];
        s[0]=s[2];
        s[2]=tmp;
        s[0].display();
        s[2].display();
        }
}