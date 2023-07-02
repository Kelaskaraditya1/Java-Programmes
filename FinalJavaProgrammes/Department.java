 class Department
{
    static String department,hod;
    static int yoe;
    static void display()
    {
        System.out.println("Welcome to the Department of "+Department.department);
        System.out.println("I "+hod+" HOD of "+department+" Department welcomes you all");
        System.out.println("Our Department was established in "+yoe+" year");
    }
    public Department(String department,String hod,int yoe)
    {
        this.department=department;
        this.hod=hod;
        this.yoe=yoe;
    }
    public static class Student
    {
        static String sid,name;
        static int rollno;
        static char div;
        static float cgpa;
        static void display()
        {
            System.out.println("The Student id of the student is:"+sid);
            System.out.println("The Student belongs to "+Department.department+" Department");
            System.out.println("The Name of the Student is:"+name);
            System.out.println("The Rollno of the Student is:"+rollno);
            System.out.println("The Division of the Student is:"+div);
            System.out.println("The CGPA of the Student is:"+cgpa);
        }
        public Student(String sid,String name,int rollno,char div,float cgpa)
        {
            this.sid=sid;
            this.name=name;
            this.rollno=rollno;
            this.div=div;
            this.cgpa=cgpa;
        }
     
        public static void main(String[] args)
        {
           Department d1 = new Department("Computer","Dr_Amol_Pandey",1985);
           Department.display();
           Student s1 = new Student("2021FHCO042","Aditya",54,'A',8.8f);
           Student.display();
        }
    }
}