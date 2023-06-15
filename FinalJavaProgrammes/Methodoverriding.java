class Parent
{
    public void method1(int a,int b)
    {
        System.out.println("The sum of a and b is:"+(a+b));
        System.out.println("The difference of a and b is:"+(a-b));
        System.out.println("The Product of a and b is:"+(a*b));
        System.out.println("The ratio of a and b is:"+(a/b));
        System.out.println("The remainder of a and b is:"+(a%b));
        System.out.println("The value of  a^b is:"+(Math.pow(a,b)));    
    }
    public void method2(int a,int ...B)
    {
        int sum=0;
        for(int val:B)
        sum=sum+val;
        System.out.println("The sum of the elements of the array is:"+sum);
    }
}
public class Methodoverriding extends Parent
{
    public void method1(int a,int b)
    {
        if(a>b)
        System.out.println(""+a+" is bigger than "+b);
        else
        System.out.println(""+b+" is bigger than "+a);
    }
    public void method2(int a,int ...B)
    {
        int key=a,counter=0,i=0;
        while(i<B.length)
        {
            if(B[i]!=key)
           { counter++;
            i++;
           }
            else
            {
            System.out.println("The Key is found at "+i+" location");
            break;
            }
        }
        if(counter==B.length)
        System.out.println("The key is not present in the list");
    }

    public static void main(String[] args)
    {
        Parent p = new Parent();
        p.method1(10, 20);
        System.out.println();
        p.method2(0, 10,20,30,40,50);
        System.out.println();
        Methodoverriding m = new Methodoverriding();
        m.method1(10, 20);
        System.out.println();
        m.method2(50,10,20,30,40,50);
    }
}
