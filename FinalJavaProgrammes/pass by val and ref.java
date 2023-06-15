

public class
{
    public int age;
    public void update(Aditya a)
    {
        a = new Aditya();
        a.age=21;
    }
    public static void main(String[] args)
    {
        Aditya a = new Aditya();
        a.age=20;
        a.update(a);
        System.out.println(a.age);
    }
}

##pass by refrence:

public class Aditya
{
    public int age;
    public void update(Aditya a)
    {
        a.age=21;
    }
    public static void main(String[] args)
    {
        Aditya a = new Aditya();
        a.age=20;
        a.update(a);
        System.out.println(a.age);
    }
}