import java.util.*;
public class StringBuffeer
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter tour String");
        StringBuffer string1 = new StringBuffer(s.next());
        int choice=1;
        while(choice!=6)
        {
            System.out.println("Enter Your choice");
            choice=s.nextInt();
            switch(choice)
            {
                case 1://for appending at last
                System.out.println("Enter the String to be appended");
                System.out.println(string1.append(s.next()));
                break;
                case 2://for Converting StringBuffer to String;
                String str=string1.toString();
                System.out.println("The String format of StringBuffer is:"+str);
                break;
                case 3://for deleting content from index
                System.out.println("Enter the index from which the content is to be deleted");
                System.out.println(string1.deleteCharAt(s.nextInt()));
                break;
                case 4://inserting the content at a index
                System.out.println("Enter the index and content to be added in the String");
                System.out.println(string1.insert(s.nextInt(),s.next()));
                break;
                case 5://creating Substring
                System.out.println("Enter the Starting and Ending Index for thr SubString");
                StringBuffer string2 = new StringBuffer(string1.substring(s.nextInt(),s.nextInt()));
                System.out.println(string2);
                case 6:
                break;
            }
        }
        

    }

}