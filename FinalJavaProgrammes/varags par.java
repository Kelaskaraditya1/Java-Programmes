public class Aditya
{
    static int sum(int a,int ...A)
    {
        int s=0;
        for(int val:A)
        s=s+val;
        return s;
    }
    public static void main(String[] args)
    {
        int k=sum(0,1,2,3,4,5);
        System.out.println(k);
    }
}