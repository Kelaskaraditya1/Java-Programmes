import java.util.*;
class Main
{
    static void it(int x)
{
    int tax;
    if(x<=250000)
    System.out.println("Paisa kama Pehla Garib");
    else if((250000<x)&&(x<=500000))
{
    tax=(5*x)/100;
    System.out.printf("You have to pay %d \n",tax);
}
 else if((500000<x)&&(x<=1000000))
{
    tax=(20*x)/100;
    System.out.printf("You have to pay %d \n",tax);
}
 else if(x>1000000)
{
    tax=(30*x)/100;
    System.out.printf("You have to pay %d \n",tax);
}
}
public static void main(String[] args)
{
    int income;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Your Income");
    income=s.nextInt();
    it(income);
}
}