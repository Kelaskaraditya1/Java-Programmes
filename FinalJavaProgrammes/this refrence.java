public class Aditya
{
    String name;
    int age;
    String bloodgrp;
    Aditya(String name,int age,String bloodgrp)
    {
        this.name=name;
        this.age=age;
        this.bloodgrp=bloodgrp;
        System.out.println("My name is:"+name);
        System.out.println("My age is:"+age);
        System.out.println("My bloodgroup is:"+bloodgrp);
    }
    public static void main(String[] args)
    {
        Aditya a = new Aditya("Aditya",20,"A+");
    }
}