public class basicclass
{
    String name;
    String grno;
    int rollno;
    char div;
     public void changename(String nname)
    {
        name=nname;
        System.out.println("The new name is:"+name);
    }
    public void display()
    {
        System.out.println("The name of the student is :"+name);
         System.out.println("The gr no of the student is :"+grno);
          System.out.println("The rollno of the student is :"+rollno);
           System.out.println("The div of the student is :"+div);
        
    }
    public static void main(String[] args)
    {
        Student s = new Student();
        s.name="Aditya";
        s.grno="2021FHCO042";
        s.rollno=54;
        s.div='A';
        s.display();
        s.changename("Bajiprabhu");
    }
}