import java.util.*;
public class Employee
{
    int age,salery;
    public Employee(int age,int salery)
    {
        this.age=age;
        this.salery=salery;
    }
    public void taxpayable(int age,int salery)
    {
        float tax;
        if((age<20)&&(salery<250000))
        System.out.println("No tax payable for the employee");
        else if((age>20)&&((salery>250000)&&(salery<400000)))
        {
            tax=salery*0.1f;
            System.out.println("The tax payable for the employee is:"+tax);
        }
        else if((age>30)&&((salery>400000)&&(salery<600000)))
        {
            tax=salery*0.2f;
            System.out.println("The tax payable for the employee is:"+tax);
        }
        else if((age>50)&&((salery>600000)&&(salery<800000)))
        {
            tax=salery*0.45f;
            System.out.println("The tax payable for the employee is:"+tax);
        }
        else
        {
            tax=salery*0.5f;
            System.out.println("The tax payable for the employee is:"+tax);
        }
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Employee e = new Employee(55,900000);
        e.taxpayable(50, 900000);


    }

}