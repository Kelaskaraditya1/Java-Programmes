import java.util.*;
public class Aditya
{
    public String name;
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Aditya a [] = new Aditya [5];
        int i;
        for(i=0;i<5;i++)
        {
            a[i]=new Aditya();
            a[i].name=s.next();
        }
        for(i=0;i<5;i++)
        System.out.println(a[i].name);
    }
}