import java.util.*;
interface Aditya
{
    void name();
    void padvi();
}
public class constructor
{
    public static void main(String[] args)
    {
        Aditya a = new Aditya()
        {
            public void name()
            {
                System.out.println(" Majha naav Bajiprabhu Deshpande\n ");
            }
            public void padvi()
            {
                System.out.println(" Me Hirdas mavlyanchya deshmukhancha sarsenapati\n ");
            }
        };
        a.padvi();
        a.name();
    }

}