import java.util.*;
public class Palindrome
{
    static void palindrome(String string)
    {
        char str[]=string.toCharArray();
        int length=str.length;
        int n=(str.length-1),i,j,counter=0;
        if(length%2==0)
        {
        for(i=0,j=n;((i<=(n/2))&&(j>=(n/2)+1));i++,j--)
        {
            if(str[i]==str[j])
            counter++;
            else
            break;
            System.out.println("The entered String is not a Palindrome\n");
        }
        if(counter==(n/2+1))
        System.out.println("The entered String is a Palindrome\n");
    }
    else
    {
        for(i=0,j=n;((i<(n/2))&&(j>(n/2)));i++,j--)
        {
            if(str[i]==str[j])
            counter++;
             else
            break;
            System.out.println("The entered String is a Palindrome\n");
        }
        if((counter==(n/2)-1))
        System.out.println("The entered String is a Palindrome\n");
    }
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String to examine wheather palindrome or not");
        String str=s.next();
        int length=str.length();
        palindrome(str);
    }
}