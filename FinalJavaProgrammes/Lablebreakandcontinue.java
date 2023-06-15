public class Lablebreakandcontinue 
{
    public static void main(String[] args)
    {
           int i,j,num1=0,num2=0;
        x:for(i=0;i<10;i++)
        {
            for(j=0;j<10;j++)
            {
                if((i==5)&&(j==5))
                break x;
                else
                num1++;
            }
        }
        System.out.println(num1);
        x:for(i=0;i<10;i++)
        {
            for(j=0;j<10;j++)
            {
                if((i==5)&&(j==5))
                continue x;
                else
                num2++;
            }
        }
        System.out.println(num2);
    }
}
