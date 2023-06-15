import java.util.*;
public class Stringfunc
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String string="Chatrapati Shivaji Maharaj",str1="Aditya",str2="bajiprabhu Deshpande",str3="Murarbaji Deshpande";
        System.out.println("The length of the String is:"+string.length());
        System.out.println("Wheather the String is empty or not:"+string.isEmpty());
       System.out.println("Are both the Strings equal:"+str1.equals(str2));
       System.out.println("Are both the String not equal:"+str1.equalsIgnoreCase(str2)); 
       System.out.println("Contains example:"+str2.contains("baji")); 
       System.out.println("Contains example:"+str3.contains("baji"));
       System.out.println("Starts with example:"+str2.startsWith("baji"));
       System.out.println("Ends with example:"+str3.endsWith("baji"));
       System.out.println("Sbstring example1:"+str3.substring(0,5)+str2.substring(0,4)+" "+str2.substring(11));
       System.out.println("Upper Case example1:"+string.toUpperCase());
       System.out.println("Upper Case example1:"+str2.toUpperCase());
       System.out.println("Upper Case example1:"+str3.toUpperCase());
       System.out.println("Lower case example:"+str1.toLowerCase());

    }
}