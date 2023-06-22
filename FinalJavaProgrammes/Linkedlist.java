import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class Linkedlist
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Iterator<Integer> iterator;
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        System.out.println("Enter the number of elements\n");
        int n=s.nextInt();
        System.out.println("Enter the elements\n");
        for(int i=0;i<n;i++)
        l1.add(s.nextInt());
        System.out.println(l1);
        int choice=1;
        while(choice!=8)
        {
            System.out.println("Enter your choice\n");
            choice=s.nextInt();
            switch(choice)
            {
                case 1://adding to first
                System.out.println("Enter the element to be added in the front\n");
                int element=s.nextInt();
                l1.addFirst(element);
                System.out.println(l1);
                break;
                case 2://adding to last
                System.out.println("Enter the element to be added in the rear\n");
                element=s.nextInt();
                l1.addLast(element);
                System.out.println(l1);
                break;
                case 3://element present at index
                System.out.println("Enter the index\n");
                int index=s.nextInt();
                System.out.println("The value present at the index "+index+" is "+l1.get(index)+"\n");
                break;
                case 4://finding wheather an element is present or not
                System.out.println("Enter the element to be checked wheather present in the list or not\n");
                element=s.nextInt();
                boolean status=l1.contains(element);
                if(status==true)
                System.out.println("The element is present in the list\n");
                else 
                System.out.println("The element is not present in the list\n");
                break;
                case 5://finding index of element
                System.out.println("Enter the element whose index has to find out \n");
                element=s.nextInt();
                System.out.println("The index of "+element+" is "+l1.indexOf(element)+"\n");
                break;
                case 6://removing element
                System.out.println("Enter the element to be removed from the linkedlist\n");
                element=s.nextInt();
                iterator=l1.iterator();
                while(iterator.hasNext())
                {
                    if(iterator.next()==element)
                    l1.remove();
                }
                System.out.println("After removing "+element+"\n");
                System.out.println(l1);
                break;
                case 7://for making sublist
                System.out.println("Enter the starting and ending index of the list");
                int start=s.nextInt();
                int end=s.nextInt();
                LinkedList<Integer>l2=new LinkedList<Integer>();
                l2= (LinkedList) l1.subList(start,end);
                System.out.print("\n"+"The Sub List is: ");
                System.out.println(l2);
                break;
                case 8:
                break;
            }
        }
    }
}